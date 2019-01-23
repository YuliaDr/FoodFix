package com.example.user.foodfix_12.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.fragments.CardsFragment;
import com.example.user.foodfix_12.fragments.MapFragment;
import com.example.user.foodfix_12.fragments.ProfileFragment;
import com.example.user.foodfix_12.fragments.RestMenuFragment;

public class MainMenu extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //test
            changeFragment(new RestMenuFragment());
            /*switch (item.getItemId()) {
                case R.id.navigation_map:
                    changeFragment(new MapFragment());
                    return true;
                case R.id.navigation_history:
                    changeFragment(new CardsFragment());
                    return true;
                case R.id.navigation_profile:
                    changeFragment(new ProfileFragment());
                    return true;
            }*/
            return true;
            //return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_map);
    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();
    }

}
