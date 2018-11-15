package com.example.utsav.beercheer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class BeerViewHolder extends GroupViewHolder
{
    private TextView title;

    public BeerViewHolder(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
    }

    public void bind(Beer beer)
    {
        title.setText(beer.getTitle());
    }
}
