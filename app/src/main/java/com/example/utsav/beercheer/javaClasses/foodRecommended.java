package com.example.utsav.beercheer.javaClasses;

public class foodRecommended {

    private int foodImg;
    private String foodName;
    private String foodCombo;


    public foodRecommended() {

    }

    public foodRecommended(int foodImg, String foodName, String foodCombo) {
        this.foodImg = foodImg;
        this.foodName = foodName;
        this.foodCombo = foodCombo;
    }

    public int getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(int foodImg) {
        this.foodImg = foodImg;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCombo() {
        return foodCombo;
    }

    public void setFoodCombo(String foodCombo) {
        this.foodCombo = foodCombo;
    }
}
