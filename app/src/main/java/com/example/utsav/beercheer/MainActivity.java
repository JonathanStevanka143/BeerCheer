package com.example.utsav.beercheer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * this is the main activity for the entire application
 */

//make the class extend the fragments onclick listening, this will be important later on
public class MainActivity extends AppCompatActivity implements
        aboutUsFragment.OnFragmentInteractionListener,
        BeerType.OnFragmentInteractionListener,
        SettingsFragment.OnFragmentInteractionListener,
        homeScreenFragment.OnFragmentInteractionListener,
        CombinationFragment.OnFragmentInteractionListener,
        BeerColorFragment.OnFragmentInteractionListener,
        learnOurStory.OnFragmentInteractionListener
{

    //create the fragment manager that will be used later
    FragmentManager fm;
    //this is for our bottom sheet. this will make the onclicks valid for the items inside the bar
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        //create the overrided method for the onNavigationItemSelcted method
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //begin the transaction
            FragmentTransaction transaction = fm.beginTransaction();
            //create the switch statement we will use to listen into whats being clicked
            switch (item.getItemId()) {
                case R.id.navigation_combination:
                    //replace whats on screen
                    transaction.replace(R.id.content,new CombinationFragment());
                    //add the sheet to the back so we can use it later on
                    transaction.addToBackStack(null);
                    //commit the fragment
                    transaction.commit();
                    return true;

                case R.id.navigation_beerType:
                    //replace whats on screen
                    transaction.replace(R.id.content,new BeerType());
                    //add the sheet to the back so we can use it later on
                    transaction.addToBackStack(null);
                    //commit the fragment
                    transaction.commit();
                    return true;

                case R.id.navigation_home:
                    //replace whats on screen
                    transaction.replace(R.id.content, new homeScreenFragment());
                    //add the sheet to the back so we can use it later on
                    transaction.addToBackStack(null);
                    //commit the fragment
                    transaction.commit();
                    return true;

                case R.id.navigation_beerColor:
                    //replace whats on screen
                    transaction.replace(R.id.content, new BeerColorFragment());
                    //add the sheet to the back so we can use it later on
                    transaction.addToBackStack(null);
                    //commit the fragment
                    transaction.commit();
                    return true;

                case R.id.navigation_settings:
                    //replace whats on screen
                    transaction.replace(R.id.content, new SettingsFragment());
                    //add the sheet to the back so we can use it later on
                    transaction.addToBackStack(null);
                    //commit the fragment
                    transaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the support from the fragment manager
        fm = getSupportFragmentManager();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //set the selected icon to be home to always open on the homepage
        navigation.setSelectedItemId(R.id.navigation_home);


        //create a fragment manager
        FragmentManager fm;
        //get the supportfragmentManager
        fm = getSupportFragmentManager();
        //create a transaction
        FragmentTransaction transaction = fm.beginTransaction();
        //replace whats on the screen
        transaction.replace(R.id.content, new homeScreenFragment());
        //show the screen
        transaction.commit();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
