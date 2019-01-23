package com.example.user.foodfix_12.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class CardsFragment_R extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cards_fragment_layout_r, container, false);
        RecyclerView cardsRecycler_R = view.findViewById(R.id.cards_recycler_r);
        cardsRecycler_R.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        CardsAdapter_R adapter = new CardsAdapter_R();
        cardsRecycler_R.setAdapter(adapter);
        cardsRecycler_R.addItemDecoration(new DividerItemDecoration(cardsRecycler_R.getContext(), DividerItemDecoration.HORIZONTAL));
        adapter.addCards_R(createCards_R());
        adapter.notifyDataSetChanged();
        return view;
    }

    private List<Card_R> createCards_R() {
        List<Card_R> cards_r = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Card_R card_r = new Card_R("\"Название ресторана\"", "Время: ЧЧ:ММ", "Оплата: " + i*127 + "\u20BD", "\"Статус\"", "Отменить");
            cards_r.add(card_r);
        }
        return cards_r;
    }
}