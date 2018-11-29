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

//    TextView beerBottomTitle;
//    TextView beerBottomDesc;
    //CREATE A CUSTOM CALLER FOR OUR BOTTOMSHEET CONTROL TAB
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);
//        beerBottomTitle = view.findViewById(R.id.bottomBeerTitle);
//        beerBottomDesc = view.findViewById(R.id.bottomBeerDescription);

        return view;
    }


//    public TextView getBeerBottomTitle() {
//        return beerBottomTitle;
//    }
//
//    public void setBeerBottomTitle(String  beerBottomTitle) {
//        this.beerBottomTitle.setText(beerBottomTitle);
//    }
//
//    public TextView getBeerBottomDesc() {
//        return beerBottomDesc;
//    }
//
//    public void setBeerBottomDesc(String beerBottomDesc) {
//        this.beerBottomDesc.setText(beerBottomDesc);
//    }
}
