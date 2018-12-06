package com.example.utsav.beercheer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.utsav.beercheer.javaClasses.bottomSheetControl;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BeerType#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeerType extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    List<Integer> beerImages  = new ArrayList<>();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    bottomSheetControl bottomSheetControl = new bottomSheetControl();

    private OnFragmentInteractionListener mListener;

    public BeerType() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BeerType.
     */
    // TODO: Rename and change types and number of parameters
    public static BeerType newInstance(String param1, String param2) {
        BeerType fragment = new BeerType();
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
        View view = inflater.inflate(R.layout.fragment_beer_type, container, false);

        //create a bundle for the bottom sheet


        //initialize the startup data
        initData();
        //create a viewpager
        HorizontalInfiniteCycleViewPager viewPager = view.findViewById(R.id.viewPager);
        //instanate a new custom adapter
        CustomAdapter adapter = new CustomAdapter(beerImages,getContext());

        viewPager.setAdapter(adapter);



        // Inflate the layout for this fragment
        return view;
    }

    private void initData()
    {
        //addd the images to the viewpager
        beerImages.add(R.drawable.ipa);
        beerImages.add(R.drawable.wheat);
        beerImages.add(R.drawable.stout);
        beerImages.add(R.drawable.sour);
        beerImages.add(R.drawable.porter);
        beerImages.add(R.drawable.pilsner);
        beerImages.add(R.drawable.paleale);
        beerImages.add(R.drawable.lager);
    }

    public class CustomAdapter extends PagerAdapter
    {
        //create a list
        List<Integer> beerImages;
        //create a context
        Context context;
        //create a layout inflater
        LayoutInflater layoutInflater;

        //public constructor
        public CustomAdapter(List<Integer> beerImages, Context context)
        {
            this.beerImages = beerImages;
            this.context = context;
            layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return beerImages.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view.equals(o);
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
        {
            container.removeView((View) object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, final int position) {
            View view = layoutInflater.inflate(R.layout.each_beer,container,false);


            final ImageView beerImage = (ImageView) view.findViewById(R.id.eachBeerImage);

            beerImage.setImageResource(beerImages.get(position));

            int beerPos = beerImages.get(position);

            container.addView(view);

            //create the information to point towards the button with moreinfo
            //this is our custom bottomSheetControl
            Button bottomSheetInfoButton = view.findViewById(R.id.beerSheetInfo);
            bottomSheetInfoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(position==0){
                        bottomSheetControl.setBeerBottomTitle("Indian Pale Ale");
                        bottomSheetControl.setBeerBottomDesc("Indian Pale Ale has been consumed in the United Kingdom since 1835. The modern incarnation is described as A hoppy, moderately-strong, very well-attenuated pale British ale with a dry finish and a hoppy aroma and taste.");
                    }
                    else if(position==1){
                        bottomSheetControl.setBeerBottomTitle("Wheat Beer");
                        bottomSheetControl.setBeerBottomDesc("Wheat beer is usually brewed with a large proportion of wheat relative to the amount of malted barley. The two main varieties are Weissbier and Witbier minor types include Lambic, Berliner Weisse and Gose.");
                    }
                    else if(position==2){
                        bottomSheetControl.setBeerBottomTitle("Stout Beer");
                        bottomSheetControl.setBeerBottomDesc("Stout is a dark beer, there are a number of stout beers including Baltic porter, Milk stout, and Imperial stout the most common variation is dry stout, exemplified by Guinness Draught, the world's best selling stout. ");
                    }
                    else if(position==3){
                        bottomSheetControl.setBeerBottomTitle("Sour Beer");
                        bottomSheetControl.setBeerBottomDesc("Sour beer is beer which has an intentionally acidic, tart or sour taste. The most common sour beer styles are Belgian: lambics, gueuze and Flanders red ale.");
                    }
                    else if(position==4){
                        bottomSheetControl.setBeerBottomTitle("Porter");
                        bottomSheetControl.setBeerBottomDesc("Porter is a dark style of beer developed in London from well-hopped beers made from brown malt. The name was first recorded in the 18th century, and is thought to come from its popularity with street and river porters.");
                    }
                    else if(position==5){
                        bottomSheetControl.setBeerBottomTitle("Pilsner");
                        bottomSheetControl.setBeerBottomDesc("Pilsner is a type of pale lager. It takes its name from the Bohemian city of Pilsen, where it was first produced in 1842. The world’s first blond lager, the original Pilsner Urquell, is still produced there today.");
                    }
                    else if(position==6){
                        bottomSheetControl.setBeerBottomTitle("Pale Ale");
                        bottomSheetControl.setBeerBottomDesc("Pale ale is an ale made with mainly pale malt. The highest proportion of pale malts results in a lighter colour. The term pale ale first appeared around 1703 for beers made from malts dried with coke, which resulted in a lighter colour than other beers popular at that time.");
                    }
                    else if(position==7) {
                        bottomSheetControl.setBeerBottomTitle("Lager");
                        bottomSheetControl.setBeerBottomDesc("Lager is a type of beer conditioned at low temperatures. The term may also be used as a verb to describe the cold-conditioning process. Lagers can be pale, amber, or dark. Pale lager is the most widely consumed and commercially available style of beer.");
                    }


                    bottomSheetControl.show(getChildFragmentManager(),"bottomSheetControl");


                }
            });



            return view;
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
