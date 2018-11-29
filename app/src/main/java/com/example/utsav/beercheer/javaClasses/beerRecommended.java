package com.example.utsav.beercheer.javaClasses;

import android.graphics.drawable.Drawable;

public class beerRecommended {

    private String beerName;
    private String beerIBU;
    private String beerABV;
    private String beerDescription;

    public beerRecommended() {

    }

    public beerRecommended(String beerName, String beerIBU, String beerABV, String beerDescription) {
        this.beerName = beerName;
        this.beerIBU = beerIBU;
        this.beerABV = beerABV;
        this.beerDescription = beerDescription;
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
