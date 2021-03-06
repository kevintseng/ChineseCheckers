package com.raczy.chinesecheckers;

/**
 * Data class representing player participating in the game
 * Created by kacperraczy on 12.12.2017.
 */
public class Player {
    private final int id;
    private final String username;
    private int zoneID;

    public Player(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public int getZoneID() {
        return zoneID;
    }

    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }
}
