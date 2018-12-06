package com.example.utsav.beercheer.javaClasses;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utsav.beercheer.R;

public class bottomSheetControl  extends BottomSheetDialogFragment {

    //create the string that we will set our desired text too for the bottom sheet
    String beerBottomTitle;
    String beerBottomDesc;
//    String string1 = null;
//    String string2 = null;
    //CREATE A CUSTOM CALLER FOR OUR BOTTOMSHEET CONTROL TAB
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //externalize the view
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);
        //create a connection for the beerbottomtitle
        TextView beerBottomTitle = view.findViewById(R.id.bottomBeerTitle);
        //create a connection for the textview beerbottomdesc
        TextView beerBottomDesc = view.findViewById(R.id.bottomBeerDescription);
        //set the title for the bottom sheet upon click
        beerBottomTitle.setText(getBeerBottomTitle());
        //set the desc for the bottom sheet upon click
        beerBottomDesc.setText(getBeerBottomDesc());
        //return the view
        return view;
    }




    public String getBeerBottomTitle() {
        return beerBottomTitle;
    }

    public void setBeerBottomTitle(String  beerBottomTitle) {
        this.beerBottomTitle = beerBottomTitle;
    }

    public String getBeerBottomDesc() {
        return beerBottomDesc;
    }

    public void setBeerBottomDesc(String beerBottomDesc) {
        this.beerBottomDesc = beerBottomDesc;
    }
}
