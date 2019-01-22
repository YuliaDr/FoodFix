package com.example.user.foodfix_12.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class RestMenuFragment extends Fragment {

    private RecyclerView mRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restmenu, container, false);

        mRecycler = v.findViewById(R.id.menu_recycler);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        RestMenuAdapter adapter = new RestMenuAdapter();
        mRecycler.setAdapter(adapter);
        mRecycler.addItemDecoration(new DividerItemDecoration(mRecycler.getContext(), DividerItemDecoration.HORIZONTAL));
        adapter.addMenu(createMenus());
        adapter.notifyDataSetChanged();

        return v;
    }

    public static RestMenuFragment newInstance() {

        RestMenuFragment f = new RestMenuFragment();
        return f;
    }

    private List<Menu> createMenus() {
        List<Menu> menus = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Menu menu = new Menu("ЗАВТРАКИ", "Булгур с финиками", "Цена: " + i*127 + "\u20BD");
            menus.add(menu);
        }
        return menus;
    }
}
