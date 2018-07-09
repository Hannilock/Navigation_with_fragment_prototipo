package com.example.dc.navigation.models;

import java.net.URL;

/**
 * Created by Vih on 06/05/2018.
 */

public class Category {
    public String name, url;

    public Category(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
