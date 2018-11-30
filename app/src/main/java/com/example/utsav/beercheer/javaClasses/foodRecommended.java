package com.example.utsav.beercheer.javaClasses;

public class foodRecommended {

    int beerimg;
    private String foodName;
    private String foodDescription;

    public foodRecommended() {

    }

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
