package com.example.utsav.beercheer;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomSpinnerAdapter extends ArrayAdapter<Grain>
{
    //create a context called context
    private Context context;

    //create an array of Grain called grains
    private Grain[] grains;


    public CustomSpinnerAdapter(@NonNull Context context, int resource, @NonNull Grain[] grains) {
        super(context, resource, grains);
        this.context = context;
        this.grains = grains;
    }

    @Override
    public int getCount() {
        return grains.length;
    }

    @Nullable
    @Override
    public Grain getItem(int position) {
        return grains[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View v = super.getView(position, convertView, parent);
        TextView textView  = v.findViewById(R.id.spinnerItem);
        textView.setText(grains[position].getGrainName());
        return textView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = super.getDropDownView(position, convertView, parent);
        TextView textView  = v.findViewById(R.id.spinnerItem);
        textView.setText(grains[position].getGrainName());
        return v;

    }
}
