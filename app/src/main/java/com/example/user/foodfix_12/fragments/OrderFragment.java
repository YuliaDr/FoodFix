package com.example.user.foodfix_12.fragments;

import android.app.FragmentContainer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

public class OrderFragment extends FragmentContainer {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_order, container, false);

        return v;
    }

    public static OrderFragment newInstance() {

        OrderFragment f = new OrderFragment();
        return f;
    }
}
