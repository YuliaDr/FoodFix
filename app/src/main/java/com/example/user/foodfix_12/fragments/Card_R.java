package com.example.user.foodfix_12.fragments;

public class Card_R {
    private final String title_r;
    private final String message_time_r;
    private final String message_pay_r;
    private final String message_status_r;
    private final String message_place_r;

    Card_R(String title_r, String message_time_r, String message_pay_r, String message_status_r, String message_place_r) {
        this.title_r = title_r;
        this.message_time_r = message_time_r;
        this.message_pay_r = message_pay_r;
        this.message_status_r = message_status_r;
        this.message_place_r = message_place_r;
    }

    public String getTitle_r() {
        return title_r;
    }

    public String getMessage_time_r() {
        return message_time_r;
    }

    public String getMessage_pay_r() {
        return message_pay_r;
    }

    public String getMessage_status_r() {
        return message_status_r;
    }

    public String getMessage_place_r() {
        return message_place_r;
    }

}

