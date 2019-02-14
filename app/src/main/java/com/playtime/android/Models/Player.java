package com.playtime.android.Models;

public class Player {
    private String name;
    private String number;
    int playCount;

    public Player(String name, String number){
        this.name = name;
        this.number = number;
    }

    public int getPlayCount() {
        return playCount;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
}