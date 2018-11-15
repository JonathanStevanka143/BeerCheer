package com.example.utsav.beercheer.javaClasses;

public class creatorInsight {

    private int creatorImg;
    private String creatorName;
    private String creatorPick;
    private String creatorDescription;

    public creatorInsight() {

    }

    public creatorInsight(int creatorImg, String creatorName, String creatorPick, String creatorDescription) {
        this.creatorImg = creatorImg;
        this.creatorName = creatorName;
        this.creatorPick = creatorPick;
        this.creatorDescription = creatorDescription;
    }

    public int getCreatorImg() {
        return creatorImg;
    }

    public void setCreatorImg(int creatorImg) {
        this.creatorImg = creatorImg;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorPick() {
        return creatorPick;
    }

    public void setCreatorPick(String creatorPick) {
        this.creatorPick = creatorPick;
    }

    public String getCreatorDescription() {
        return creatorDescription;
    }

    public void setCreatorDescription(String creatorDescription) {
        this.creatorDescription = creatorDescription;
    }
}
