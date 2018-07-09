package com.example.dc.navigation.models;

/**
 * Created by Vih on 06/05/2018.
 */

public class Place {
    private String title, subtitle;
    private int image;

    public Place(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public Place(String title, String subtitle, int image) {
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return title;
    }
}
