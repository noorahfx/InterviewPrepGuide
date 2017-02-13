package com.example.noora.interviewprepguide.model;

/**
 * Created by noora on 2/13/2017.
 */

public class LanguageData {

    private int imageID;
    private String title;

    public LanguageData(int imageID, String title) {
        this.imageID = imageID;
        this.title = title;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
