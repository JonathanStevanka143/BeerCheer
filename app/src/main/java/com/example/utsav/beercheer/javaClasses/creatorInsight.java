package com.example.utsav.beercheer.javaClasses;

public class creatorInsight {

    private int creatorImg;
    private String creatorName;
    private String creatorPick;
    private String creatorDescription;

    public creatorInsight() {

    }

    public creatorInsight( String topicName, String topicDescription) {
        this.creatorName = topicName;
        this.creatorDescription = topicDescription;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public String getCreatorPick() {
        return creatorPick;
    }

    public String getCreatorDescription() {
        return creatorDescription;
    }

    public void setCreatorDescription(String creatorDescription) {
        this.creatorDescription = creatorDescription;
    }
}
