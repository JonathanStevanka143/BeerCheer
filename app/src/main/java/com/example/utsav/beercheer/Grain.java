package com.example.utsav.beercheer;

public class Grain
{
    //create a double value lovibond
    private double lovibond;
    //create a string called grainName
    private String grainName;

    //create a constructor for this class
    public Grain()
    {
        this.lovibond = 0.0;
        this.grainName = "";
    }

    /**
     * create getters and setters for the class
     */
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
