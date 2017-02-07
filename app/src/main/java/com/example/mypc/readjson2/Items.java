package com.example.mypc.readjson2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Items {
    private String id;
    private String uploaded;
    private String updated;
    private String uploader;
    private String category;
    private String title;
    private String description;
    private Integer duration;
    private String aspectRatio;
    private Double rating;
    private Integer ratingCount;
    private Integer viewCount;
    private Integer favoriteCount;
    private Integer commentCount;

    private ArrayList<String> tags;
    private Thumbnail thumbnail;
    private Player player;
    private Content content;
    private Status status;
    private AccessControl accessControl;

    @Override
    public String toString() {
        return "Items{" +
                "id='" + id + '\'' +
                ", uploaded='" + uploaded + '\'' +
                ", updated='" + updated + '\'' +
                ", uploader='" + uploader + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", viewCount=" + viewCount +
                ", favoriteCount=" + favoriteCount +
                ", commentCount=" + commentCount +
                '}';
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
