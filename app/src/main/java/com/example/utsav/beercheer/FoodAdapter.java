package com.example.utsav.beercheer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class FoodAdapter extends ExpandableRecyclerViewAdapter<BeerViewHolder,FoodViewHolder>
{

    public FoodAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public BeerViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.combination_data_parent,parent,false);
        return new BeerViewHolder(view);
    }

    @Override
    public FoodViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.combination_data_child,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(FoodViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Food food = (Food) group.getItems().get(childIndex);
        holder.bind(food);
    }

    @Override
    public void onBindGroupViewHolder(BeerViewHolder holder, int flatPosition, ExpandableGroup group) {
        final Beer beer = (Beer) group;
        holder.bind(beer);
    }
}
