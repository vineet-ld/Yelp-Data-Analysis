/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdata;


// This program gives out the number of positive and negative words in a review 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Saurabh
 */
public class AlchemyTextAnalytics {

    public static String apikey = "77c14973f2ba02eeb0d592bf749811ebfaffc223";
    public static String apiurl = "http://gateway-a.watsonplatform.net/calls/text/TextGetRankedKeywords";
    public static String jsonBody;
    public static File file = new File("C:/Users/Saurabh/Desktop/sentimentOutput123.txt");
    
    public static void parseLine() throws Exception {

        String csvFile = "C:/Users/Saurabh/Desktop/test.txt";
        BufferedReader br = null;
        String line = "";
        String splitBy = "\t";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use tab as separator
                String[] data = line.split(splitBy);
           //     System.out.println(data[1]);
                String jsonResponse = getKeywordSentimentData(data[1]);
                getKeywordSentimentValue(jsonResponse);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static String getKeywordSentimentData(String inputLine) throws Exception {

        URL url = new URL("http://gateway-a.watsonplatform.net/calls/text/TextGetRankedKeywords");
        Map<String, Object> params = new LinkedHashMap<>();
        String url1 = "http://gateway-a.watsonplatform.net/calls/text/TextGetRankedKeywords?q=" + URLEncoder.encode(inputLine, "UTF-8");
        params.put("apikey", "77c14973f2ba02eeb0d592bf749811ebfaffc223");
        params.put("text", inputLine);
        params.put("outputMode", "json");
        params.put("sentiment", "1");

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : params.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder s = new StringBuilder();
        for (int c; (c = in.read()) >= 0;) {
            s.append((char) c);
        }
        String jsonString = s.toString();
      //  System.out.println(jsonString);
        return jsonString;
    }

    public static void getKeywordSentimentValue(String jsonInput) throws Exception {
        JSONObject jsonObject = new JSONObject(jsonInput);
        JSONArray sentimentArray = jsonObject.getJSONArray("keywords");
        String score="";
        
        double ratingCalc=0, keywordCounter = 0,  scoreInteger=0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < sentimentArray.length(); i++) {
            JSONObject element = sentimentArray.getJSONObject(i);
            JSONObject sentiment = element.getJSONObject("sentiment");
            //System.out.println(sentiment);
            String text = element.getString("text");
            System.out.println(text);
            String type = sentiment.getString("type");   
            try{
                score = sentiment.getString("score");
            }catch(JSONException e){
                score ="0.000000";
            } 
            scoreInteger = Double.parseDouble(score);
            ratingCalc = ratingCalc + scoreInteger; 
            if(scoreInteger!=0.00){
                  keywordCounter++;
            } 
            s.append("Keyword is : "+text+"\n"+"Score is : "+score+"\n\n");
        }
        double avgRating = (ratingCalc)/(keywordCounter);
        String finalRating = getRating(avgRating);
        s.append("The rating derived from this review is "+finalRating);
        System.out.print(s);
        writeSentimentToFile(s+"",file);
        System.out.print("\n");
    }

    
    public static void writeSentimentToFile(String inputToWrite, File file) throws IOException{
        
        if (!file.exists()) {
            file.createNewFile();
	}
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.println(inputToWrite);
        System.out.println(inputToWrite);
        bw.close();
    }
    
    
    public static String getRating(double avgRating){
        if(avgRating > -1.0 && avgRating < -0.8 ){
            return "1*";
        }
        else if(avgRating > -0.8 && avgRating < -0.6){
            return "1.5*";
        }
        else if(avgRating > -0.6 && avgRating < -0.4){
            return "2*";
        }
        else if(avgRating > -0.4 && avgRating < -0.2){
            return "2.5*";
        }
        else if((avgRating > -0.2 && avgRating < 0) || (avgRating > 0 && avgRating < 0.2) ){
            return "3*";
        }
        else if(avgRating > 0.2 && avgRating < 0.4){
            return "3.5*";
        }
        else if(avgRating > 0.4 && avgRating < 0.6){
            return "4.0*";
        }
        else if(avgRating > 0.6 && avgRating < 0.8){
            return "4.5*";
        }
        else 
            return "5.0*";
    }
    
    
    public static void main(String[] args) throws Exception {

        parseLine();

    }

}


