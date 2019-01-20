package com.example.user.foodfix_12.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.user.foodfix_12.Other.CircularTransformation;
import com.example.user.foodfix_12.R;
import com.squareup.picasso.Picasso;

public class ProfileFragment extends Fragment {
    ImageView avatarImageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        avatarImageView = v.findViewById(R.id.avatar);
        Picasso.with(getActivity())
                .load(R.drawable.photo)
                .transform(new CircularTransformation(150))
                .into(avatarImageView);
        return v;
    }
}
