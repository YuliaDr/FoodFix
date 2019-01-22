package com.example.user.foodfix_12.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.activity.ThankYouActivity;

public class OrderFragment extends Fragment {
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_order, container, false);

        button = v.findViewById(R.id.btnOrder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThankYouActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

    public static OrderFragment newInstance() {

        OrderFragment f = new OrderFragment();
        return f;
    }
}
