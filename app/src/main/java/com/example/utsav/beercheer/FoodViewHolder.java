package com.example.utsav.beercheer;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;

public class FoodViewHolder extends com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
{

    private TextView dataText;
    private ImageView dataImage;

    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        dataText = itemView.findViewById(R.id.dataText);
        dataImage = itemView.findViewById(R.id.dataImage);
    }

    public void bind(Food food)
    {
        dataText.setText(food.foodName);
        dataImage.setImageResource(food.foodImage);
    }
}
