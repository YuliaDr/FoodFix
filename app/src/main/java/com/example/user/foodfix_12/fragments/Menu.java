package com.example.user.foodfix_12.fragments;

import android.widget.Toast;

import com.example.user.foodfix_12.Other.MyApplication;
import com.example.user.foodfix_12.activity.MainActivity;

import java.util.ArrayList;
import java.util.List;

class Menu {

    private String titleM;
    private String message_name;
    private String message_payM;

    Menu(String titleM, String message_name, String message_payM) {
        this.titleM = titleM;
        this.message_name = message_name;
        this.message_payM = message_payM;
    }

    Menu() {
        this.titleM = this.message_payM = this.message_name = "";
    }

    public static List<Menu> getMenu() {
        //TODO get list of dishes in menu
        List<Menu> list = new ArrayList<>();
        list.add(new Menu("hi", "hello", "q"));
        list.add(new Menu("second", "hello", "chillim"));
        return list;
    }

    public static void saveChanges(List<Menu> menus) {
        //TODO send new menu to server
        try {
            Toast.makeText(MyApplication.getAppContext(), "Идет сохранение", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTitleM() {
        return titleM;
    }

    public String getMessage_name() {
        return message_name;
    }

    public String getMessage_payM() {
        return message_payM;
    }

    public void setTitleM(String s) {
        this.titleM = s;
    }

    public void setMessage_name(String s) {
        this.message_name = s;
    }

    public void setMessage_payM(String s) {
        this.message_payM = s;
    }
}