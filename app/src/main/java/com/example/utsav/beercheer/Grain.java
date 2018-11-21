package com.example.utsav.beercheer;

public class Grain
{

    private double lovibond;
    private String grainName;

    public Grain()
    {
        this.lovibond = 0.0;
        this.grainName = "";
    }

    public double getLovibond() {
        return lovibond;
    }

    public void setLovibond(double lovibond)
    {
        this.lovibond = lovibond;
    }

    public String getGrainName()
    {
        return grainName;
    }

    public void setGrainName(String grainName)
    {
        this.grainName = grainName;
    }

    @Override
    public String toString() {
        return getGrainName();
    }
}
