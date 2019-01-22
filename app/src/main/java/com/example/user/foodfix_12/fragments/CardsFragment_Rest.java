package com.example.user.foodfix_12.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class CardsFragment_Rest extends Fragment {

    private RecyclerView cards_restRecyclerRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_rest, container, false);
        cards_restRecyclerRecycler = view.findViewById(R.id.cards_rest_recycler);
        cards_restRecyclerRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        CardsAdapter_Rest adapter = new CardsAdapter_Rest();
        cards_restRecyclerRecycler.setAdapter(adapter);
        adapter.addCards_rest(createCards_rest());
        adapter.notifyDataSetChanged();
        return view;
    }

    private List<Card_Rest> createCards_rest() {
        List<Card_Rest> cards_rest = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Card_Rest card_rest = new Card_Rest("Заказ №" + i, "Время: ЧЧ:ММ", "Оплата: " + i*127 + "\u20BD", "Статус: Принят", "Место: Название ресторана");
            cards_rest.add(card_rest);
        }
        return cards_rest;
    }
}
