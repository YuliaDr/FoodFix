package com.example.user.foodfix_12.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RestMenuAdapter extends RecyclerView.Adapter<RestMenuAdapter.MenuViewHolder> {

    private final List<Menu> menus;

    public RestMenuAdapter() {
        menus = new ArrayList<>();
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(com.example.user.foodfix_12.R.layout.menu_item_view, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        Menu menu = menus.get(position);
        holder.titleM.setText(menu.getTitleM());
        holder.message_name.setText(menu.getMessage_name());
        holder.message_payM.setText(menu.getMessage_payM());
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public void addMenu(List<Menu> items) {
        menus.addAll(items);
    }

    static class MenuViewHolder extends RecyclerView.ViewHolder {

        TextView titleM;
        TextView message_name;
        TextView message_payM;

        MenuViewHolder(View itemView) {
            super(itemView);
            titleM = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_titleM);
            message_name = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_message_name);
            message_payM = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_message_payM);
        }
    }

}
