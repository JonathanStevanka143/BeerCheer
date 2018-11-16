package com.example.utsav.beercheer;

import android.app.ActionBar;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        aboutUsFragment.OnFragmentInteractionListener,
        BeerType.OnFragmentInteractionListener,
        SettingsFragment.OnFragmentInteractionListener,
        homeScreenFragment.OnFragmentInteractionListener,
        CombinationFragment.OnFragmentInteractionListener{

    private TextView mTextMessage;
    FragmentManager fm;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_combination:
                    transaction.replace(R.id.content,new CombinationFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;

                case R.id.navigation_beerType:
                    transaction.replace(R.id.content,new BeerType());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;

                case R.id.navigation_home:
                    transaction.replace(R.id.content, new homeScreenFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                    return true;

                case R.id.navigation_beerColor:
                    return true;

                case R.id.navigation_settings:
                    transaction.replace(R.id.content, new SettingsFragment());
                    transaction.addToBackStack(null);
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

        fm = getSupportFragmentManager();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);

        FragmentManager fm;
        fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content, new homeScreenFragment());
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
