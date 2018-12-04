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

    String beerBottomTitle;
    String beerBottomDesc;
//    String string1 = null;
//    String string2 = null;
    //CREATE A CUSTOM CALLER FOR OUR BOTTOMSHEET CONTROL TAB
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);
//        string1 = savedInstanceState.getString("title");
//        string2 = savedInstanceState.getString("desc");
        TextView beerBottomTitle = view.findViewById(R.id.bottomBeerTitle);
        TextView beerBottomDesc = view.findViewById(R.id.bottomBeerDescription);

        beerBottomTitle.setText(getBeerBottomTitle());
        beerBottomDesc.setText(getBeerBottomDesc());

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
