package com.example.user.foodfix_12.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.fragments.AboutRestFragment;
import com.example.user.foodfix_12.fragments.CardsFragment_R;

public class RestMenuActivity extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_info_r:
                    changeFragment(new AboutRestFragment());
                    return true;
                case R.id.navigation_history_r:
                    changeFragment(new CardsFragment_R());
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restmenu);

        BottomNavigationView navigation = findViewById(R.id.navigation_r);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_history_r);
    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_r, fragment).commit();
    }

}
