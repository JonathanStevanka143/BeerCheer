package com.example.utsav.beercheer.javaClasses;

public class foodRecommended {

    //create the beerimg for the drawable ID reference
    int beerimg;
    private String foodName;
    //create the string for the foodname
    private String foodDescription;
    //create the string for the foodDescription
    //empty construct
    public foodRecommended() {

    }
    //full construct
    public foodRecommended(int beerimg,String foodName, String foodDescription) {
        this.beerimg = beerimg;

        this.foodName = foodName;
        this.foodDescription = foodDescription;
    }

    public void setFoodImg(int foodImg) {
        this.beerimg = beerimg;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getBeerimg() {
        return beerimg;
    }

    public void setBeerimg(int beerimg) {
        this.beerimg = beerimg;
    }
}
