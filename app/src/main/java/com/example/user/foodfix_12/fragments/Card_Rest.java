package com.example.user.foodfix_12.fragments;

class Card_Rest {

    private final String titler;
    private final String message_timer;
    private final String message_payr;
    private final String message_statusr;
    private final String message_placer;

    Card_Rest(String titler, String message_timer, String message_payr, String message_statusr, String message_placer) {
        this.titler = titler;
        this.message_timer = getMessage_timer();
        this.message_payr = getMessage_payr();
        this.message_statusr = getMessage_statusr();
        this.message_placer = getMessage_placer();
    }

    public String getTitler() {
        return titler;
    }

    public String getMessage_timer() {
        return message_timer;
    }

    public String getMessage_payr() {
        return message_payr;
    }

    public String getMessage_statusr() {
        return message_statusr;
    }

    public String getMessage_placer() {
        return message_placer;
    }

}

