package com.example.recyclerview;

public class ModelClass {

    private int imageResource;
    String title;
    String body;

    public ModelClass(int imageResource, String title, String body) {
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
