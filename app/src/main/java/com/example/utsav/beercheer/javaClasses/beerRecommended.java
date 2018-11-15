package com.example.utsav.beercheer.javaClasses;

import android.graphics.drawable.Drawable;

public class beerRecommended {

    int beerImg;
    private String beerName;
    private String beerIBU;
    private String beerType;
    private String beerABV;
    private String beerDescription;

    public beerRecommended() {

    }

    public beerRecommended(int beerImg, String beerName, String beerIBU, String beerType, String beerABV, String beerDescription) {
        this.beerImg = beerImg;
        this.beerName = beerName;
        this.beerIBU = beerIBU;
        this.beerType = beerType;
        this.beerABV = beerABV;
        this.beerDescription = beerDescription;
    }


    public int getBeerImg() {
        return beerImg;
    }

    public void setBeerImg(int beerImg) {
        this.beerImg = beerImg;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getBeerIBU() {
        return beerIBU;
    }

    public void setBeerIBU(String beerIBU) {
        this.beerIBU = beerIBU;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    public String getBeerABV() {
        return beerABV;
    }

    public void setBeerABV(String beerABV) {
        this.beerABV = beerABV;
    }

    public String getBeerDescription() {
        return beerDescription;
    }

    public void setBeerDescription(String beerDescription) {
        this.beerDescription = beerDescription;
    }
}
