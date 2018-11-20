package com.example.utsav.beercheer;

public class Grain
{

    private double lovibond;
    private String grainName;

    public Grain(double lovibond, String grainName) {
        this.lovibond = lovibond;
        this.grainName = grainName;
    }

    public double getLovibond() {
        return lovibond;
    }

    public void setLovibond(double lovibond) {
        this.lovibond = lovibond;
    }

    public String getGrainName() {
        return grainName;
    }

    public void setGrainName(String grainName) {
        this.grainName = grainName;
    }
}
