package com.example.utsav.beercheer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CombinationFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CombinationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CombinationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CombinationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CombinationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CombinationFragment newInstance(String param1, String param2) {
        CombinationFragment fragment = new CombinationFragment();
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
        //externalize the view into a view
        View view = inflater.inflate(R.layout.fragment_combination, container, false);

        //create a recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.combinationRecyclerView);
        //set the layout for the recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //create an arraylist of beers
        ArrayList<Beer> beers = new ArrayList<>();
        //create an arraylist of food
        ArrayList<Food> lagerFood = new ArrayList<>();
        //add new food objects to the food array
        lagerFood.add(new Food(R.drawable.chicken,R.string.chicken));
        lagerFood.add(new Food(R.drawable.fish,R.string.fish));
        lagerFood.add(new Food(R.drawable.cheese,R.string.cheese));
        //create a new beer class
        Beer lagerBeer = new Beer("Lager Beer",lagerFood);
        //add the lagerbeer to the beer class we just made
        beers.add(lagerBeer);
        //create a new food class
        ArrayList<Food> stoutFood = new ArrayList<>();
        //add the items to the class
        stoutFood.add(new Food(R.drawable.chocolate,R.string.chocolate));
        stoutFood.add(new Food(R.drawable.oyster,R.string.oyster));
        stoutFood.add(new Food(R.drawable.grilled,R.string.oyster));
        //create a new beer class
        Beer stoutBeer = new Beer("Stout Beer",stoutFood);
        beers.add(stoutBeer);
        //create a new foodd class
        ArrayList<Food> pilsnerFood = new ArrayList<>();
        //add the items to the class
        pilsnerFood.add(new Food(R.drawable.sandwich,R.string.sandwich));
        pilsnerFood.add(new Food(R.drawable.sushi,R.string.sushi));
        pilsnerFood.add(new Food(R.drawable.pie,R.string.pie));
        //create a new beer class
        Beer pilsnerBeer = new Beer("Pilsner Beer",pilsnerFood);
        beers.add(pilsnerBeer);
        //create a new food class
        ArrayList<Food> porterFood = new ArrayList<>();
        //add the items to the class
        porterFood.add(new Food(R.drawable.bbq,R.string.bbq));
        porterFood.add(new Food(R.drawable.shellfish,R.string.shellfish));
        porterFood.add(new Food(R.drawable.steak,R.string.steak));
        //create a new beer class
        Beer porterBeer = new Beer("Porter Beer",porterFood);
        beers.add(porterBeer);
        //create a new food class
        ArrayList<Food> wheatFood = new ArrayList<>();
        //add the items to the class
        wheatFood.add(new Food(R.drawable.vegetables,R.string.salad));
        wheatFood.add(new Food(R.drawable.mexican,R.string.mexican));
        wheatFood.add(new Food(R.drawable.salmon,R.string.salmon));

        Beer wheatBeer = new Beer("Wheat Beer",wheatFood);
        beers.add(wheatBeer);

        ArrayList<Food> palealeFood = new ArrayList<>();
        //add the items to the class
        palealeFood.add(new Food(R.drawable.burger,R.string.burger));
        palealeFood.add(new Food(R.drawable.pudding,R.string.pudding));
        palealeFood.add(new Food(R.drawable.cheese_2,R.string.cheese));

        Beer paleAleBeer = new Beer("Pale Ale Beer",palealeFood);
        beers.add(paleAleBeer);

        ArrayList<Food> ipaFood = new ArrayList<>();
        //add the items to the class
        ipaFood.add(new Food(R.drawable.spicy,R.string.spicy));
        ipaFood.add(new Food(R.drawable.curry,R.string.curry));
        ipaFood.add(new Food(R.drawable.grilled,R.string.grilled));

        Beer ipaBeer = new Beer("Indian Pale Ale Beer",ipaFood);
        beers.add(ipaBeer);

        ArrayList<Food> sourFood = new ArrayList<>();
        //add the items to the class
        sourFood.add(new Food(R.drawable.egg,R.string.egg));
        sourFood.add(new Food(R.drawable.mussel,R.string.mussel));
        sourFood.add(new Food(R.drawable.pork,R.string.pork));

        Beer sourBeer = new Beer("Sour Beer",sourFood);
        //add the items to the class
        beers.add(sourBeer);

        FoodAdapter adapter = new FoodAdapter(beers);

        recyclerView.setAdapter(adapter);

        return view;
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
