package com.example.user.foodfix_12.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class CardsAdapter_R extends RecyclerView.Adapter<CardsAdapter_R.CardViewHolder_R> {

    private final List<Card_R> cards_r;

    public CardsAdapter_R() {
        cards_r = new ArrayList<>();
    }

    @Override
    public CardsAdapter_R.CardViewHolder_R onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_view_r, parent, false);
        return new CardsAdapter_R.CardViewHolder_R(view);
    }

    @Override
    public void onBindViewHolder(CardsAdapter_R.CardViewHolder_R holder, int position) {
        Card_R card_r = cards_r.get(position);
        holder.title_r.setText(card_r.getTitle_r());
        holder.message_time_r.setText(card_r.getMessage_time_r());
        holder.message_pay_r.setText(card_r.getMessage_pay_r());
        holder.message_status_r.setText(card_r.getMessage_status_r());
        holder.message_place_r.setText(card_r.getMessage_place_r());
    }

    @Override
    public int getItemCount() {
        return cards_r.size();
    }

    public void addCards_R(List<Card_R> items) {
        cards_r.addAll(items);
    }

    static class CardViewHolder_R extends RecyclerView.ViewHolder {

        TextView title_r;
        TextView message_time_r;
        TextView message_pay_r;
        TextView message_status_r;
        TextView message_place_r;

        CardViewHolder_R(View itemView) {
            super(itemView);
            title_r = itemView.findViewById(R.id.card_title_r);
            message_time_r = itemView.findViewById(R.id.card_message_time_r);
            message_pay_r = itemView.findViewById(R.id.card_message_pay_r);
            message_status_r = itemView.findViewById(R.id.card_message_status_r);
            message_place_r = itemView.findViewById(R.id.card_message_place_r);
        }
    }

}