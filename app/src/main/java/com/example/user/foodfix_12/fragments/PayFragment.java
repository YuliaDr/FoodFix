package com.example.user.foodfix_12.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

public class PayFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pay, container, false);

        return v;
    }

    public static PayFragment newInstance() {

        PayFragment f = new PayFragment();
        return f;
    }
}
