package com.example.utsav.beercheer;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BeerColorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BeerColorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeerColorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    EditText inputValue,inputValue2,inputValue3, batchSize;

    Spinner spinner, spinner2, spinner3;
    CustomSpinnerAdapter customSpinnerAdapter;

    RadioGroup unitsGroup;

    TextView litersGallons, kgPounds, srmResult, ebcResult, approx;

    Button updateButton, resetButton;

    double totalLovibond,lovibond,lovibond2,lovibond3,srm,ebc, volume;
    double weight,weight2,weight3;
    double mcu,mcu2,mcu3,totalMcu;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BeerColorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BeerColorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeerColorFragment newInstance(String param1, String param2) {
        BeerColorFragment fragment = new BeerColorFragment();
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
        View view = inflater.inflate(R.layout.fragment_beer_color, container, false);
        // Inflate the layout for this fragment

        unitsGroup = view.findViewById(R.id.unitsGroup);

        litersGallons = view.findViewById(R.id.litersGallons);
        kgPounds = view.findViewById(R.id.kgPounds);
        spinner = view.findViewById(R.id.spinner);
        spinner2 = view.findViewById(R.id.spinner2);
        spinner3 = view.findViewById(R.id.spinner3);

        inputValue = view.findViewById(R.id.inputValue);
        inputValue2 = view.findViewById(R.id.inputValue2);
        inputValue3 = view.findViewById(R.id.inputValue3);
        batchSize = view.findViewById(R.id.batchSize);

        srmResult = view.findViewById(R.id.srmResult);
        ebcResult = view.findViewById(R.id.ebcResult);
        approx = view.findViewById(R.id.colorResult);

        updateButton = view.findViewById(R.id.updateButton);
        resetButton = view.findViewById(R.id.resetButton);

        Grain[] grains = new Grain[16];

        grains[0] = new Grain();
        grains[0].setLovibond(140);
        grains[0].setGrainName("Crystal Malt 10L");

        grains[1] = new Grain();
        grains[1].setLovibond(500);
        grains[1].setGrainName("Black Malt");

        grains[2] = new Grain();
        grains[2].setLovibond(300);
        grains[2].setGrainName("Roasted Barley");

        grains[3] = new Grain();
        grains[3].setLovibond(525);
        grains[3].setGrainName("Black Barley");

        grains[4] = new Grain();
        grains[4].setLovibond(350);
        grains[4].setGrainName("Chocolate Malt");

        grains[5] = new Grain();
        grains[5].setLovibond(1.5);
        grains[5].setGrainName("Dextrin Malt");

        grains[6] = new Grain();
        grains[6].setLovibond(1.8);
        grains[6].setGrainName("Pale Malt");

        grains[7] = new Grain();
        grains[7].setLovibond(10);
        grains[7].setGrainName("Munich Malt");

        grains[8] = new Grain();
        grains[8].setLovibond(50);
        grains[8].setGrainName("Special Roast");

        grains[9] = new Grain();
        grains[9].setLovibond(3.5);
        grains[9].setGrainName("Vienna Malt");

        grains[10] = new Grain();
        grains[10].setLovibond(25);
        grains[10].setGrainName("Victory Malt");

        grains[11] = new Grain();
        grains[11].setLovibond(2);
        grains[11].setGrainName("Wheat Malt");

        grains[12] = new Grain();
        grains[12].setLovibond(2);
        grains[12].setGrainName("White Wheat Malt");

        grains[13] = new Grain();
        grains[13].setLovibond(24);
        grains[13].setGrainName("Aromatic Malt");

        grains[14] = new Grain();
        grains[14].setLovibond(24);
        grains[14].setGrainName("Biscuit Malt");

        grains[15] = new Grain();
        grains[15].setLovibond(56);
        grains[15].setGrainName("Caramunich Malt");

//        grainArrayList.add(new Grain(21,"Caravienne Malt"));
//        grainArrayList.add(new Grain(2.9,"Pale Ale Malt"));
//        grainArrayList.add(new Grain(1.5,"Pilsen Malt"));
//        grainArrayList.add(new Grain(180,"Special B Malt"));
//        grainArrayList.add(new Grain(2.4,"Scotmalt Golden Promise"));


        customSpinnerAdapter = new CustomSpinnerAdapter(getContext(),R.layout.spinner_item,grains);

        spinner.setAdapter(customSpinnerAdapter);
        spinner2.setAdapter(customSpinnerAdapter);
        spinner3.setAdapter(customSpinnerAdapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Grain grain = customSpinnerAdapter.getItem(position);

                lovibond = grain.getLovibond();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Grain grain = customSpinnerAdapter.getItem(position);

                lovibond2 = grain.getLovibond();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Grain grain = customSpinnerAdapter.getItem(position);

                lovibond3 = grain.getLovibond();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        unitsGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                View radioButton = unitsGroup.findViewById(checkedId);

                int index = unitsGroup.indexOfChild(radioButton);

                switch (index)
                {
                    case 0:
                        litersGallons.setText("Gallons");
                        kgPounds.setText("Pounds");
                        break;
                    case 1:
                        litersGallons.setText("Liters");
                        kgPounds.setText("Kg");
                        break;
                }
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weight = Double.parseDouble(inputValue.getText().toString());



                weight2 = Double.parseDouble(inputValue2.getText().toString());
                weight3 = Double.parseDouble(inputValue3.getText().toString());

                volume = Double.parseDouble(batchSize.getText().toString());

                if(kgPounds.getText() == "Pounds")
                {
                    weight *= 2.20;
                    weight2 *= 2.20;
                    weight3 *= 2.20;
                }

                if(litersGallons.getText() == "Gallons")
                {
                    volume *= 0.264;
                }

                Log.i("test",String.valueOf(weight));

                totalLovibond = lovibond+lovibond2+lovibond3;

                //Calculating MCU of each grain
                mcu = (weight * lovibond) / volume;
                mcu2 = (weight2 * lovibond2) / volume;
                mcu3 = (weight3 * lovibond3) / volume;

                //Calculating MCU of entire batch
                totalMcu = mcu + mcu2 + mcu3;

                //Log.i("test",String.valueOf(totalMcu));

                //Calculating SRM
                srm = 1.4922 * (Math.pow(totalMcu,0.6859));

                //Log.i("test",String.valueOf(srm));

                ebc = 1.97 * srm;

                srmResult.setText(String.valueOf(String.format("%.2f",srm)));
                ebcResult.setText(String.valueOf(String.format("%.2f",ebc)));

                switch ((int) srm)
                {
                    case 1:
                        approx.setBackgroundColor(Color.parseColor("#FFE699"));
                        break;
                    case 2:
                        approx.setBackgroundColor(Color.parseColor("#FFD878"));
                        break;
                    case 3:
                        approx.setBackgroundColor(Color.parseColor("#FFCA5A"));
                        break;
                    case 4:
                        approx.setBackgroundColor(Color.parseColor("#FFBF42"));
                        break;
                    case 5:
                        approx.setBackgroundColor(Color.parseColor("#FBB123"));
                        break;
                    case 6:
                        approx.setBackgroundColor(Color.parseColor("#F8A600"));
                        break;
                    case 7:
                        approx.setBackgroundColor(Color.parseColor("#F39C00"));
                        break;
                    case 8:
                        approx.setBackgroundColor(Color.parseColor("#EA8F00"));
                        break;
                    case 9:
                        approx.setBackgroundColor(Color.parseColor("#E58500"));
                        break;
                    case 10:
                        approx.setBackgroundColor(Color.parseColor("#DE7C00"));
                        break;
                    case 11:
                        approx.setBackgroundColor(Color.parseColor("#D77200"));
                        break;
                    case 12:
                        approx.setBackgroundColor(Color.parseColor("#CF6900"));
                        break;
                    case 13:
                        approx.setBackgroundColor(Color.parseColor("#CB6200"));
                        break;
                    case 14:
                        approx.setBackgroundColor(Color.parseColor("#C35900"));
                        break;
                    case 15:
                        approx.setBackgroundColor(Color.parseColor("#BB5100"));
                        break;
                    case 16:
                        approx.setBackgroundColor(Color.parseColor("#B54C00"));
                        break;
                    case 17:
                        approx.setBackgroundColor(Color.parseColor("#B04500"));
                        break;
                    case 18:
                        approx.setBackgroundColor(Color.parseColor("#A63E00"));
                        break;
                    case 19:
                        approx.setBackgroundColor(Color.parseColor("#A13700"));
                        break;
                    case 20:
                        approx.setBackgroundColor(Color.parseColor("#9B3200"));
                        break;
                    case 21:
                        approx.setBackgroundColor(Color.parseColor("#952D00"));
                        break;
                    case 22:
                        approx.setBackgroundColor(Color.parseColor("#8E2900"));
                        break;
                    case 23:
                        approx.setBackgroundColor(Color.parseColor("#882300"));
                        break;
                    case 24:
                        approx.setBackgroundColor(Color.parseColor("#821E00"));
                        break;
                    case 25:
                        approx.setBackgroundColor(Color.parseColor("#7B1A00"));
                        break;
                    case 26:
                        approx.setBackgroundColor(Color.parseColor("#771900"));
                        break;
                    case 27:
                        approx.setBackgroundColor(Color.parseColor("#701400"));
                        break;
                    case 28:
                        approx.setBackgroundColor(Color.parseColor("#6A0E00"));
                        break;
                    case 29:
                        approx.setBackgroundColor(Color.parseColor("#660D00"));
                        break;
                    case 30:
                        approx.setBackgroundColor(Color.parseColor("#5E0B00"));
                        break;
                    case 31:
                        approx.setBackgroundColor(Color.parseColor("#5A0A02"));
                        break;
                    case 32:
                        approx.setBackgroundColor(Color.parseColor("#600903"));
                        break;
                    case 33:
                        approx.setBackgroundColor(Color.parseColor("#520907"));
                        break;
                    case 34:
                        approx.setBackgroundColor(Color.parseColor("#4C0505"));
                        break;
                    case 35:
                        approx.setBackgroundColor(Color.parseColor("#470606"));
                        break;
                    case 36:
                        approx.setBackgroundColor(Color.parseColor("#440607"));
                        break;
                    case 37:
                        approx.setBackgroundColor(Color.parseColor("#3F0708"));
                        break;
                    case 38:
                        approx.setBackgroundColor(Color.parseColor("#3B0607"));
                        break;
                    case 39:
                        approx.setBackgroundColor(Color.parseColor("#3A070B"));
                        break;
                    case 40:
                        approx.setBackgroundColor(Color.parseColor("#36080A"));
                        break;
                    default:
                        approx.setBackgroundColor(Color.parseColor("#36080A"));
                        break;
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputValue.setText("");
                inputValue2.setText("");
                inputValue3.setText("");
                batchSize.setText("");
                srmResult.setText("0.0");
                ebcResult.setText("0.0");
            }
        });

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
