package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class AccessControl {
    private String syndicate;
    private String commentVote;
    private String rate;
    private String list;
    private String comment;
    private String embed;
    private String videoRespond;

    @Override
    public String toString() {
        return "AccessControl{" +
                "syndicate='" + syndicate + '\'' +
                ", commentVote='" + commentVote + '\'' +
                ", rate='" + rate + '\'' +
                ", list='" + list + '\'' +
                ", comment='" + comment + '\'' +
                ", embed='" + embed + '\'' +
                ", videoRespond='" + videoRespond + '\'' +
                '}';
    }

    public AccessControl() {
    }

    public AccessControl(String syndicate, String commentVote, String rate, String list, String comment, String embed, String videoRespond) {
        this.syndicate = syndicate;
        this.commentVote = commentVote;
        this.rate = rate;
        this.list = list;
        this.comment = comment;
        this.embed = embed;
        this.videoRespond = videoRespond;
    }

    public String getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(String syndicate) {
        this.syndicate = syndicate;
    }

    public String getCommentVote() {
        return commentVote;
    }

    public void setCommentVote(String commentVote) {
        this.commentVote = commentVote;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getVideoRespond() {
        return videoRespond;
    }

    public void setVideoRespond(String videoRespond) {
        this.videoRespond = videoRespond;
    }
}
