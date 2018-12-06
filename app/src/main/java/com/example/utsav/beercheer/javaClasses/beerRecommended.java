package com.example.utsav.beercheer.javaClasses;

import android.graphics.drawable.Drawable;

public class beerRecommended {

    //create a string called beerName
    private String beerName;
    //create a string called beerIBU
    private String beerIBU;
    //create a string called beerABV
    private String beerABV;
    //create a string called beerDescription
    private String beerDescription;
    //create a string called beerType
    private String beerType;

    //empty construct
    public beerRecommended() {

    }

    //full construct
    public beerRecommended(String beerName,String beerType, String beerIBU, String beerABV, String beerDescription) {
        this.beerName = beerName;
        this.beerType = beerType;
        this.beerIBU = beerIBU;
        this.beerABV = beerABV;
        this.beerDescription = beerDescription;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
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
