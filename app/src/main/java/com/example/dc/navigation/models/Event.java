package com.example.dc.navigation.models;

public class Event {
    private String name, date, place, genre;
    private int img;

    public Event(String name, String date, String place, String genre, int img) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.genre = genre;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
