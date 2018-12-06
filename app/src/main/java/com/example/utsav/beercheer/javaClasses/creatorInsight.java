package com.example.utsav.beercheer.javaClasses;

public class creatorInsight {

    //create the creator name string
    private String creatorName;
    //create the creator description string
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

    public String getCreatorDescription() {
        return creatorDescription;
    }

    public void setCreatorDescription(String creatorDescription) {
        this.creatorDescription = creatorDescription;
    }
}
