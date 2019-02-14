package com.playtime.android.Models;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> players;

    public Team(){
        this.players = new ArrayList<Player>();
    }

    public Team(ArrayList<Player> players){
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
