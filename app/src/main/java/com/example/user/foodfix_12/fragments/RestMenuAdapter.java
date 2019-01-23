package com.example.user.foodfix_12.fragments;

import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class RestMenuAdapter extends RecyclerView.Adapter<RestMenuAdapter.MenuViewHolder> {

    private static List<Menu> menus;

    public RestMenuAdapter() {
        menus = new ArrayList<>();
    }

    public List<Menu> getMenus() {
        return menus;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(com.example.user.foodfix_12.R.layout.menu_item_view, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int pos) {
        Menu menu = menus.get(pos);
        holder.titleM.setText(menu.getTitleM());
        holder.message_name.setText(menu.getMessage_name());
        holder.message_payM.setText(menu.getMessage_payM());
        holder.setMenu(menu);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public void addMenu(List<Menu> items) {
        menus.addAll(items);
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements TextWatcher {

        EditText titleM;
        EditText message_name;
        EditText message_payM;
        Button btnDelete;
        Menu menu;
        int pos;

        public MenuViewHolder(final View itemView) {
            super(itemView);
            titleM = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_titleM);
            message_name = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_message_name);
            message_payM = itemView.findViewById(com.example.user.foodfix_12.R.id.menu_message_payM);
            btnDelete = itemView.findViewById(R.id.btnDelete);

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = menus.indexOf(menu);
                    menus.remove(pos);
                    RestMenuAdapter.this.notifyItemRemoved(pos);
                }
            });

            message_payM.addTextChangedListener(this);
            titleM.addTextChangedListener(this);
            message_name.addTextChangedListener(this);
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            try {
                pos = menus.indexOf(menu);
                menu.setMessage_name(message_name.getText().toString());
                menu.setMessage_payM(message_payM.getText().toString());
                menu.setTitleM(titleM.getText().toString());
                menus.set(pos, menu);
                //notifyDataSetChanged();
            }
            catch (Exception e) {
                Exception x = e;
                System.out.println(e);
            }
        }

        void setMenu(Menu menu) {
            this.menu = menu;
        }
    }

}
