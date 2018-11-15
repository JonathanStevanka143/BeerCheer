package com.example.utsav.beercheer.javaClasses;

public class creatorInsight {

    private int creatorImg;
    private String creatorName;
    private String creatorPick;


    public creatorInsight() {

    }

    public creatorInsight(int creatorImg, String creatorName, String creatorPick) {
        this.creatorImg = creatorImg;
        this.creatorName = creatorName;
        this.creatorPick = creatorPick;
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
}
