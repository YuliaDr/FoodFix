package com.example.user.foodfix_12.fragments;

class Menu {

    private final String titleM;
    private final String message_name;
    private final String message_payM;

    Menu(String titleM, String message_name, String message_payM) {
        this.titleM = titleM;
        this.message_name = message_name;
        this.message_payM = message_payM;
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

}
