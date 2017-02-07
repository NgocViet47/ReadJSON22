package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Player {
    private String Default;

    @Override
    public String toString() {
        return "Player{" +
                "Default='" + Default + '\'' +
                '}';
    }

    public Player() {
    }

    public Player(String aDefault) {
        Default = aDefault;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }
}
