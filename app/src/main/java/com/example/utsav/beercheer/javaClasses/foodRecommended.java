package com.example.utsav.beercheer.javaClasses;

public class foodRecommended {

    int foodImg;
    private String foodName;
    private String foodCombo;
    private String foodDescription;

    public foodRecommended() {

    }

    public foodRecommended(int foodImg, String foodName, String foodCombo, String foodDescription) {
        this.foodImg = foodImg;
        this.foodName = foodName;
        this.foodCombo = foodCombo;
        this.foodDescription = foodDescription;
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

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }
}
