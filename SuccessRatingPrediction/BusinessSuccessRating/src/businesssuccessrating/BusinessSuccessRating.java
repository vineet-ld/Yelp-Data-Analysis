/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesssuccessrating;

import com.neu.bigdata.bean.Business;
import com.neu.bigdata.service.PredictionService;

/**
 *
 * @author Vineet
 */
public class BusinessSuccessRating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Business business = new Business();
        business.setCaters(Business.TRUE);
        business.setDelivery(Business.FALSE);
        business.setParkingGarage(Business.FALSE);
        business.setParkingStreet(Business.FALSE);
        business.setParkingLot(Business.TRUE);
        business.setParkingValidated(Business.FALSE);
        business.setParkingValet(Business.FALSE);
        business.setAlcohol(Business.ALCOHOL_FULL_BAR);
        business.setSmoking(Business.FALSE);
        business.setMusicDJ(Business.FALSE);
//        business.setNoiseLevel(Business.NOISELEVEL_QUIET);
        business.setNoiseLevel(Business.NOISELEVEL_VLOUD);
        business.setDelivery(Business.TRUE);
        business.setCity("rankin");
        business.setState("PA");
        
        PredictionService service = new PredictionService(business);
//        PredictionService service = new PredictionService("C:\\Users\\vinee_000\\OneDrive\\Vineet\\Courses\\Engineering Big Data Systems\\Project\\Code\\BusinessSuccessRating\\data\\test.json");
//        service.setJSON("C:\\Users\\vinee_000\\OneDrive\\Vineet\\Courses\\Engineering Big Data Systems\\Project\\Code\\BusinessSuccessRating\\data\\test.json");
        String response = service.getSuccessPrediction() + "%";
        System.out.print("Predicted Success Percentage:" + response);
        
    }
    
}
