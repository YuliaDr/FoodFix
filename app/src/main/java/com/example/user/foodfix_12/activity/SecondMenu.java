package com.example.user.foodfix_12.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.fragments.InfoFragment;
import com.example.user.foodfix_12.fragments.RestMenuFragment;

public class SecondMenu extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondmenu);

        ViewPager pager = findViewById(R.id.menu2);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return InfoFragment.newInstance();
                case 1:
                    return RestMenuFragment.newInstance();
                default: return InfoFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
