/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.bigdata.service;

import com.neu.bigdata.bean.Business;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Vineet
 */
public class PredictionService {

    private static final String API_KEY = "4PmWXYVW9tCG/v/3ZSIP4vU/qg0grEq+hVQxpn3dA333jU0WqCYD+kB+cZbxk/hIJsP/FHIEQk+bxv2xByyh5Q==";
    private static final String API_URL = "https://ussouthcentral.services.azureml.net/workspaces/397afc0f05b2497196f3cbee07b08634/services/4f6ea25b8ac14de0929f80e4893691aa/execute?api-version=2.0&details=true";

    private String jsonBody = "";

    public PredictionService() {

    }

    public PredictionService(Business business) {
        jsonBody = business.setToJSON();
    }

    public PredictionService(String fileName) {
        jsonBody = setJSON(fileName);
    }

    private String rrsHttpPost() {

        HttpPost post;
        HttpClient client;
        StringEntity entity;
        String response = "";

        try {
            // create HttpPost and HttpClient object
            post = new HttpPost(API_URL);
            client = HttpClientBuilder.create().build();

            // setup output message by copying JSON body into 
            // apache StringEntity object along with content type
            entity = new StringEntity(jsonBody, HTTP.UTF_8);
            entity.setContentEncoding(HTTP.UTF_8);
            entity.setContentType("text/json");

            // add HTTP headers
            post.setHeader("Accept", "text/json");
            post.setHeader("Accept-Charset", "UTF-8");

            // set Authorization header based on the API key
            post.setHeader("Authorization", ("Bearer " + API_KEY));
            post.setEntity(entity);

            // Call REST API and retrieve response content
            HttpResponse authResponse = client.execute(post);
            response = EntityUtils.toString(authResponse.getEntity());

            return response;

        } catch (Exception e) {

            return e.toString();
        }

    }

    public String setJSON(String fileName) {

        try {

            File apiFile = new File(fileName);
            Scanner sc = new Scanner(apiFile);
            while (sc.hasNext()) {
                jsonBody += sc.nextLine() + "\n";
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return jsonBody;
        }

    }

    public String getResponse() {
        return rrsHttpPost();
    }

    public double getSuccessPrediction() {

        double successRate = 0;
        String response = rrsHttpPost();
        JSONParser parser = new JSONParser();
        try {
            Object responseJSON = parser.parse(response);
            JSONObject root = (JSONObject) responseJSON;
            JSONObject results = getJSONObject("Results", root);
            JSONObject output1 = getJSONObject("output1", results);
            JSONObject value = getJSONObject("value", output1);
            JSONArray values = getJSONArray("Values", value);
            JSONArray firstValues = getJSONArray(0, values);
            Object finalValue = firstValues.get(35);
            successRate = Double.parseDouble(finalValue.toString());
            successRate = (successRate / 7.5) * 100.000;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return successRate;

    }

    private JSONObject getJSONObject(String key, JSONObject root) {
        JSONObject object = null;
        try {

            Object json = root.get(key);
            object = (JSONObject) json;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return object;
        }
    }

    private JSONArray getJSONArray(String key, JSONObject root) {
        JSONArray array = null;
        try {

            Object json = root.get(key);
            array = (JSONArray) json;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return array;
        }
    }

    private JSONArray getJSONArray(int index, JSONArray root) {
        JSONArray array = null;
        try {

            Object json = root.get(index);
            array = (JSONArray) json;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return array;
        }
    }

}
