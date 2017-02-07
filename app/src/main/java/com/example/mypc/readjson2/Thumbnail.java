package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Thumbnail {
    private String Default;
    private String hqDefault;

    @Override
    public String toString() {
        return "Thumbnail{" +
                "Default='" + Default + '\'' +
                ", hqDefault='" + hqDefault + '\'' +
                '}';
    }

    public Thumbnail(String aDefault, String hqDefault) {
        Default = aDefault;
        this.hqDefault = hqDefault;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    public String getHqDefault() {
        return hqDefault;
    }

    public Thumbnail() {
    }

    public void setHqDefault(String hqDefault) {
        this.hqDefault = hqDefault;
    }
}
