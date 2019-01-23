package com.example.user.foodfix_12.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RestMenuFragment extends Fragment {

    private RecyclerView mRecycler;
    private Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restmenu, container, false);

        mRecycler = v.findViewById(R.id.menu_recycler);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        final RestMenuAdapter adapter = new RestMenuAdapter();
        mRecycler.setAdapter(adapter);
        mRecycler.addItemDecoration(new DividerItemDecoration(mRecycler.getContext(), DividerItemDecoration.HORIZONTAL));
        adapter.addMenu(createMenus());
        adapter.notifyDataSetChanged();

        v.findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Menu> menus = adapter.getMenus();
                Menu.saveChanges(menus);
            }
        });

        v.findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu menu = new Menu();
                List<Menu> menus = new ArrayList<>();
                menus.add(menu);
                adapter.addMenu(menus);
                adapter.notifyItemInserted(adapter.getItemCount() - 1);
            }
        });

        return v;
    }

    public static RestMenuFragment newInstance() {

        RestMenuFragment f = new RestMenuFragment();
        return f;
    }

    private List<Menu> createMenus() {
        List<Menu> menus = Menu.getMenu();
        return menus;
    }

}
