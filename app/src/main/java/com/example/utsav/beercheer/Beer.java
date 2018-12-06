package com.example.utsav.beercheer;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Beer extends ExpandableGroup<Food>
{
    //create a public construct for beer that will take its super class's paramaters
    public Beer(String title, List<Food> items) {
        super(title, items);
    }
}
