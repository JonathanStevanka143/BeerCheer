package com.example.utsav.beercheer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.utsav.beercheer.javaClasses.beerRecommended;
import com.example.utsav.beercheer.javaClasses.creatorInsight;
import com.example.utsav.beercheer.javaClasses.foodRecommended;


import java.util.ArrayList;

/**
 * @Author: Jonathan Stevanka
 * @Date: November 15, 2018
 * @Description: This class is used to populate the homescreen. It will load up our list items, and
 * populate them to the screen.
 */

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link homeScreenFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link homeScreenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homeScreenFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView beerList;
    ListView foodList;
    ListView CreatorList;



    private OnFragmentInteractionListener mListener;

    public homeScreenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homeScreenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static homeScreenFragment newInstance(String param1, String param2) {
        homeScreenFragment fragment = new homeScreenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);
        //We will begin to populate the data on screen by using this onCreateView method

        //map the listview's
        beerList = (ListView) view.findViewById(R.id.recommendedBeerList);
        foodList = (ListView) view.findViewById(R.id.recommendedFoodList);
        CreatorList = (ListView) view.findViewById(R.id.creatorInsightList);

        //create the arrayList to hold the recommended beer items
        ArrayList<beerRecommended> recommendedBeer = new ArrayList<>();
        //create the items on this beer list items
        recommendedBeer.add(new beerRecommended(R.drawable.stout,"Stout Beer","IBU: 40","Type: Stout","ABV: 4.2%",""));
        recommendedBeer.add(new beerRecommended(R.drawable.porter,"Porter","","","",""));
        recommendedBeer.add(new beerRecommended(R.drawable.paleale,"Pale Ale","","","",""));


        //create the arrayList to hold recommendedFoodTypes
        ArrayList<foodRecommended> recommendedFood = new ArrayList<>();

        //add the items onto the list
        recommendedFood.add(new foodRecommended());
        recommendedFood.add(new foodRecommended());
        recommendedFood.add(new foodRecommended());


        //create the arrayList to hold information about the authors of the program
        ArrayList<creatorInsight> creatorInsights = new ArrayList<>();
        //create the items for the creatorinsight listview
        creatorInsights.add(new creatorInsight());
        creatorInsights.add(new creatorInsight());



        //create and connect the custom adapter for the Recommended beer
        beerAdapter adapter1 = new beerAdapter(getContext(), recommendedBeer);
        beerList.setAdapter(adapter1);


        return view;
    }
    //generate block comment here
    public class beerAdapter extends ArrayAdapter<beerRecommended> {
        public beerAdapter(Context context, ArrayList<beerRecommended> items){
            super(context, 0, items);
        }

        //now we must override the getview method so that we can return our own
        @NonNull
        @Override
        public View getView(int position, @Nullable View viewConvert, @NonNull ViewGroup parent){

            //now we check to see if the item has been inflated or not, and if it hasnt inflate it
            //to a new layout that we created specifically for this item
            if(viewConvert == null){
                viewConvert = LayoutInflater.from(getContext())
                        .inflate(R.layout.recommended_beer_layout, parent, false);
            }
            //grab the current position in the list
            beerRecommended beerRecommended = getItem(position);
            //map the textview name to the text
            TextView beerName = viewConvert.findViewById(R.id.beerTitleName);
            TextView beerIBU = viewConvert.findViewById(R.id.beerIBU);
            TextView beerType = viewConvert.findViewById(R.id.beerTypeT);
            TextView beerABV = viewConvert.findViewById(R.id.beerABV);
            TextView beerDescription = viewConvert.findViewById(R.id.beerDescription);
            ImageView beerImage = viewConvert.findViewById(R.id.foodImage);


            beerName.setText(beerRecommended.getBeerName());
            beerIBU.setText(beerRecommended.getBeerIBU());
            beerType.setText(beerRecommended.getBeerType());
            beerABV.setText(beerRecommended.getBeerABV());
            beerDescription.setText(beerRecommended.getBeerDescription());
            beerImage.setImageResource(beerRecommended.getBeerImg());



            return viewConvert;
        }
    }

    public class foodAdapter extends ArrayAdapter<foodRecommended>{
        public foodAdapter(Context context, ArrayList<foodRecommended> items){
            super(context, 0, items);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View viewConvert, @NonNull ViewGroup parent) {

            if(viewConvert == null){
                viewConvert = LayoutInflater.from(getContext())
                        .inflate(R.layout.recommended_food_layout, parent, false);
            }

            foodRecommended foodRecommended = getItem(position);




            return viewConvert;
        }
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
