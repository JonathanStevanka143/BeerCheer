package com.example.utsav.beercheer;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Beer extends ExpandableGroup<Food>
{

    public Beer(String title, List<Food> items) {
        super(title, items);
    }
}
