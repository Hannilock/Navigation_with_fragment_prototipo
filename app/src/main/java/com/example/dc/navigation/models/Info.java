package com.example.dc.navigation.models;

/**
 * Created by Vih on 10/05/2018.
 */

public class Info {
    private String type;
    private int image;

    public Info(String type, int image) {
        this.type = type;
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }
}
