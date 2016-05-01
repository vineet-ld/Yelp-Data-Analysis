/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.bigdata.bean;

/**
 *
 * @author Vineet
 */
public class Business {

    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String DEFAULT = "none";

    public static final String NOISELEVEL_QUIET = "quiet";
    public static final String NOISELEVEL_AVG = "average";
    public static final String NOISELEVEL_LOUD = "loud";
    public static final String NOISELEVEL_VLOUD = "very_loud";

    public static final String ATTIRE_CASUAL = "casual";
    public static final String ATTIRE_DRESSY = "dressy";
    public static final String ATTIRE_FORMAL = "formal";
    
    public static final String ALCOHOL_FULL_BAR = "full_bar";
    public static final String ALCOHOL_BEER_AND_WINE = "beer_and_wine";
    
    public static final String WIFI_NO = "no";
    public static final String WIFI_FREE = "free";
    public static final String WIFI_PAID = "paid";

    private String businessID;
    private int reviewCount;
    private int stars;
    private String takeOut;
    private String driveThru;
    private String goodForDessert;
    private String goodForLateNight;
    private String goodForLunch;
    private String goodForDinner;
    private String goodForBrunch;
    private String goodForBreakfast;
    private String caters;
    private String noiseLevel;
    private String takesReservation;
    private String delivery;
    private String romanticAmbience;
    private String intimateAmbience;
    private String classyAmbience;
    private String hipsterAmbience;
    private String diveyAmbience;
    private String touristyAmbience;
    private String trendyAmbience;
    private String upScaleAmbience;
    private String casualAmbience;
    private String parkingGarage;
    private String parkingStreet;
    private String parkingValidated;
    private String parkingLot;
    private String parkingValet;
    private String hasTV;
    private String outdoorSitting;
    private String attire;
    private String alcohol;
    private String waiterService;
    private String acceptsCreditCard;
    private String priceRange;
    private String goodForKids;
    private String goodForGroups;
    private String goodForDancing;
    private String happyHour;
    private String coatCheck;
    private String smoking;
    private String wifi;
    private String musicDJ;
    private String musicBackground;
    private String musicLive;
    private String musicVideo;
    private String musicKaraoke;
    private String city;
    private String name;
    private String state;

    public Business() {
        businessID = "5UmKMjUEUNdYWqANhGckJw";
        reviewCount = 0;
        stars = 0;
        takeOut = Business.DEFAULT;
        driveThru = Business.DEFAULT;
        goodForDessert = Business.DEFAULT;
        goodForBreakfast = Business.DEFAULT;
        goodForBrunch = Business.DEFAULT;
        goodForDinner = Business.DEFAULT;
        goodForLateNight = Business.DEFAULT;
        goodForLunch = Business.DEFAULT;
        caters = Business.DEFAULT;
        noiseLevel = Business.DEFAULT;
        takesReservation = Business.DEFAULT;
        delivery = Business.DEFAULT;
        romanticAmbience = Business.DEFAULT;
        intimateAmbience = Business.DEFAULT;
        classyAmbience = Business.DEFAULT;
        hipsterAmbience = Business.DEFAULT;
        diveyAmbience = Business.DEFAULT;
        touristyAmbience = Business.DEFAULT;
        upScaleAmbience = Business.DEFAULT;
        casualAmbience = Business.DEFAULT;
        parkingGarage = Business.DEFAULT;
        parkingLot = Business.DEFAULT;
        parkingStreet = Business.DEFAULT;
        parkingValet = Business.DEFAULT;
        hasTV = Business.DEFAULT;
        outdoorSitting = Business.DEFAULT;
        attire = Business.DEFAULT;
        alcohol = Business.DEFAULT;
        waiterService = Business.DEFAULT;
        acceptsCreditCard = Business.DEFAULT;
        priceRange = Business.DEFAULT;
        goodForKids = Business.DEFAULT;
        goodForDancing = Business.DEFAULT;
        goodForGroups = Business.DEFAULT;
        happyHour = Business.DEFAULT;
        coatCheck = Business.DEFAULT;
        smoking = Business.DEFAULT;
        wifi = Business.DEFAULT;
        musicBackground = Business.DEFAULT;
        musicDJ = Business.DEFAULT;
        musicKaraoke = Business.DEFAULT;
        musicLive = Business.DEFAULT;
        musicVideo = Business.DEFAULT;
        city = Business.DEFAULT;;
        state = Business.DEFAULT;
    }

    public String getTakeOut() {
        return takeOut;
    }

    public void setTakeOut(String takeOut) {
        this.takeOut = takeOut;
    }

    public String getDriveThru() {
        return driveThru;
    }

    public void setDriveThru(String driveThru) {
        this.driveThru = driveThru;
    }

    public String getGoodForDessert() {
        return goodForDessert;
    }

    public void setGoodForDessert(String goodForDessert) {
        this.goodForDessert = goodForDessert;
    }

    public String getGoodForLateNight() {
        return goodForLateNight;
    }

    public void setGoodForLateNight(String goodForLateNight) {
        this.goodForLateNight = goodForLateNight;
    }

    public String getGoodForLunch() {
        return goodForLunch;
    }

    public void setGoodForLunch(String goodForLunch) {
        this.goodForLunch = goodForLunch;
    }

    public String getGoodForDinner() {
        return goodForDinner;
    }

    public void setGoodForDinner(String goodForDinner) {
        this.goodForDinner = goodForDinner;
    }

    public String getGoodForBrunch() {
        return goodForBrunch;
    }

    public void setGoodForBrunch(String goodForBrunch) {
        this.goodForBrunch = goodForBrunch;
    }

    public String getGoodForBreakfast() {
        return goodForBreakfast;
    }

    public void setGoodForBreakfast(String goodForBreakfast) {
        this.goodForBreakfast = goodForBreakfast;
    }

    public String getCaters() {
        return caters;
    }

    public void setCaters(String caters) {
        this.caters = caters;
    }

    public String getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(String noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public String getTakesReservation() {
        return takesReservation;
    }

    public void setTakesReservation(String takesReservation) {
        this.takesReservation = takesReservation;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getParkingGarage() {
        return parkingGarage;
    }

    public void setParkingGarage(String parkingGarage) {
        this.parkingGarage = parkingGarage;
    }

    public String getParkingStreet() {
        return parkingStreet;
    }

    public void setParkingStreet(String parkingStreet) {
        this.parkingStreet = parkingStreet;
    }

    public String getParkingValidated() {
        return parkingValidated;
    }

    public void setParkingValidated(String parkingValidated) {
        this.parkingValidated = parkingValidated;
    }

    public String getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(String parkingLot) {
        this.parkingLot = parkingLot;
    }

    public String getParkingValet() {
        return parkingValet;
    }

    public void setParkingValet(String parkingValet) {
        this.parkingValet = parkingValet;
    }

    public String getHasTV() {
        return hasTV;
    }

    public void setHasTV(String hasTV) {
        this.hasTV = hasTV;
    }

    public String getOutdoorSitting() {
        return outdoorSitting;
    }

    public void setOutdoorSitting(String outdoorSitting) {
        this.outdoorSitting = outdoorSitting;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getWaiterService() {
        return waiterService;
    }

    public void setWaiterService(String waiterService) {
        this.waiterService = waiterService;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getGoodForKids() {
        return goodForKids;
    }

    public void setGoodForKids(String goodForKids) {
        this.goodForKids = goodForKids;
    }

    public String getGoodForGroups() {
        return goodForGroups;
    }

    public void setGoodForGroups(String goodForGroups) {
        this.goodForGroups = goodForGroups;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getMusicDJ() {
        return musicDJ;
    }

    public void setMusicDJ(String musicDJ) {
        this.musicDJ = musicDJ;
    }

    public String getMusicBackground() {
        return musicBackground;
    }

    public void setMusicBackground(String musicBackground) {
        this.musicBackground = musicBackground;
    }

    public String getMusicLive() {
        return musicLive;
    }

    public void setMusicLive(String musicLive) {
        this.musicLive = musicLive;
    }

    public String getMusicVideo() {
        return musicVideo;
    }

    public void setMusicVideo(String musicVideo) {
        this.musicVideo = musicVideo;
    }

    public String getMusicKaraoke() {
        return musicKaraoke;
    }

    public void setMusicKaraoke(String musicKaraoke) {
        this.musicKaraoke = musicKaraoke;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String getBusinessID() {
        return businessID;
    }

    private int getReviewCount() {
        return reviewCount;
    }

    private int getStars() {
        return stars;
    }

    private String getRomanticAmbience() {
        return romanticAmbience;
    }

    private String getIntimateAmbience() {
        return intimateAmbience;
    }

    private String getClassyAmbience() {
        return classyAmbience;
    }

    private String getHipsterAmbience() {
        return hipsterAmbience;
    }

    private String getDiveyAmbience() {
        return diveyAmbience;
    }

    private String getTouristyAmbience() {
        return touristyAmbience;
    }

    private String getTrendyAmbience() {
        return trendyAmbience;
    }

    private String getUpScaleAmbience() {
        return upScaleAmbience;
    }

    private String getCasualAmbience() {
        return casualAmbience;
    }

    private String getAttire() {
        return attire;
    }

    private String getAcceptsCreditCard() {
        return acceptsCreditCard;
    }

    private String getGoodForDancing() {
        return goodForDancing;
    }

    private String getHappyHour() {
        return happyHour;
    }

    private String getCoatCheck() {
        return coatCheck;
    }

    private String getName() {
        return name;
    }

    public String setToJSON() {
        String json = "";
        try {

            StringBuffer s = new StringBuffer();
            s.append("{");
            s.append("  \"Inputs\": {");
            s.append("    \"input1\": {");
            s.append("      \"ColumnNames\": [");
            s.append("        \"business_id\",");
            s.append("        \"review_count\",");
            s.append("        \"stars\",");
            s.append("        \"attributes.take_out\",");
            s.append("        \"attributes.drive_thru\",");
            s.append("        \"attributes.good_for.dessert\",");
            s.append("        \"attributes.good_for.latenight\",");
            s.append("        \"attributes.good_for.lunch\",");
            s.append("        \"attributes.good_for.dinner\",");
            s.append("        \"attributes.good_for.brunch\",");
            s.append("        \"attributes.good_for.breakfast\",");
            s.append("        \"attributes.caters\",");
            s.append("        \"attributes.noise_level\",");
            s.append("        \"attributes.takes_reservations\",");
            s.append("        \"attributes.delivery\",");
            s.append("        \"attributes.ambience.romantic\",");
            s.append("        \"attributes.ambience.intimate\",");
            s.append("        \"attributes.ambience.classy\",");
            s.append("        \"attributes.ambience.hipster\",");
            s.append("        \"attributes.ambience.divey\",");
            s.append("        \"attributes.ambience.touristy\",");
            s.append("        \"attributes.ambience.trendy\",");
            s.append("        \"attributes.ambience.upscale\",");
            s.append("        \"attributes.ambience.casual\",");
            s.append("        \"attributes.parking.garage\",");
            s.append("        \"attributes.parking.street\",");
            s.append("        \"attributes.parking.validated\",");
            s.append("        \"attributes.parking.lot\",");
            s.append("        \"attributes.parking.valet\",");
            s.append("        \"attributes.has_tv\",");
            s.append("        \"attributes.outdoor_seating\",");
            s.append("        \"attributes.attire\",");
            s.append("        \"attributes.alcohol\",");
            s.append("        \"attributes.waiter_service\",");
            s.append("        \"attributes.accepts_credit_cards\",");
            s.append("        \"attributes.price_range\",");
            s.append("        \"attributes.good_for_kids\",");
            s.append("        \"attributes.good_for_groups\",");
            s.append("        \"attributes.good_for_dancing\",");
            s.append("        \"attributes.happy_hour\",");
            s.append("        \"attributes.coat_check\",");
            s.append("        \"attributes.smoking\",");
            s.append("        \"attributes.wifi\",");
            s.append("        \"attributes.music.dj\",");
            s.append("        \"attributes.music.background_music\",");
            s.append("        \"attributes.music.live\",");
            s.append("        \"attributes.music.video\",");
            s.append("        \"attributes.music.karaoke\",");
            s.append("        \"city\",");
            s.append("        \"name\",");
            s.append("        \"state\",");
            s.append("        \"Column 51\",");
            s.append("        \"Column 52\"");
            s.append("      ],");
            s.append("      \"Values\": [");
            s.append("        [");
            s.append("          \"").append(getBusinessID()).append("\",");
            s.append("          \"").append(getReviewCount()).append("\",");
            s.append("          \"").append(getStars()).append("\",");
            s.append("          \"").append(getTakeOut()).append("\",");
            s.append("          \"").append(getDriveThru()).append("\",");
            s.append("          \"").append(getGoodForDessert()).append("\",");
            s.append("          \"").append(getGoodForLateNight()).append("\",");
            s.append("          \"").append(getGoodForLunch()).append("\",");
            s.append("          \"").append(getGoodForDinner()).append("\",");
            s.append("          \"").append(getGoodForBrunch()).append("\",");
            s.append("          \"").append(getGoodForBreakfast()).append("\",");
            s.append("          \"").append(getCaters()).append("\",");
            s.append("          \"").append(getNoiseLevel()).append("\",");
            s.append("          \"").append(getTakesReservation()).append("\",");
            s.append("          \"").append(getDelivery()).append("\",");
            s.append("          \"").append(getRomanticAmbience()).append("\",");
            s.append("          \"").append(getIntimateAmbience()).append("\",");
            s.append("          \"").append(getClassyAmbience()).append("\",");
            s.append("          \"").append(getHipsterAmbience()).append("\",");
            s.append("          \"").append(getDiveyAmbience()).append("\",");
            s.append("          \"").append(getTouristyAmbience()).append("\",");
            s.append("          \"").append(getTrendyAmbience()).append("\",");
            s.append("          \"").append(getUpScaleAmbience()).append("\",");
            s.append("          \"").append(getCasualAmbience()).append("\",");
            s.append("          \"").append(getParkingGarage()).append("\",");
            s.append("          \"").append(getParkingStreet()).append("\",");
            s.append("          \"").append(getParkingValidated()).append("\",");
            s.append("          \"").append(getParkingLot()).append("\",");
            s.append("          \"").append(getParkingValet()).append("\",");
            s.append("          \"").append(getHasTV()).append("\",");
            s.append("          \"").append(getOutdoorSitting()).append("\",");
            s.append("          \"").append(getAttire()).append("\",");
            s.append("          \"").append(getAlcohol()).append("\",");
            s.append("          \"").append(getWaiterService()).append("\",");
            s.append("          \"").append(getAcceptsCreditCard()).append("\",");
            s.append("          \"").append(getPriceRange()).append("\",");
            s.append("          \"").append(getGoodForKids()).append("\",");
            s.append("          \"").append(getGoodForGroups()).append("\",");
            s.append("          \"").append(getGoodForDancing()).append("\",");
            s.append("          \"").append(getHappyHour()).append("\",");
            s.append("          \"").append(getCoatCheck()).append("\",");
            s.append("          \"").append(getSmoking()).append("\",");
            s.append("          \"").append(getWifi()).append("\",");
            s.append("          \"").append(getMusicDJ()).append("\",");
            s.append("          \"").append(getMusicBackground()).append("\",");
            s.append("          \"").append(getMusicLive()).append("\",");
            s.append("          \"").append(getMusicVideo()).append("\",");
            s.append("          \"").append(getMusicKaraoke()).append("\",");
            s.append("          \"").append(getCity()).append("\",");
            s.append("          \"").append(getName()).append("\",");
            s.append("          \"").append(getState()).append("\",");
            s.append("          \"\",");
            s.append("          \"\"");
            s.append("        ]");
            s.append("      ]");
            s.append("    }");
            s.append("  },");
            s.append("  \"GlobalParameters\": {}");
            s.append("}");
            
            json = s.toString();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return json;
        }
    }

}
