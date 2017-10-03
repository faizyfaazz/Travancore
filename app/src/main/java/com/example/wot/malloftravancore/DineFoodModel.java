package com.example.wot.malloftravancore;

/**
 * Created by faizy on 10/3/2017.
 */

public class DineFoodModel {
    public DineFoodModel(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    int image;
    String name, team;
}
