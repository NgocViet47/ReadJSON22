package com.example.mypc.readjson2;

import java.util.ArrayList;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Data {
    private ArrayList<Items> items;
    private String updated ;
    private Integer totalItems;
    private Integer startIndex;
    private Integer itemsPerPage;

    @Override
    public String toString() {
        return "Data{" +
                "updated='" + updated + '\'' +
                ", totalItems='" + totalItems + '\'' +
                ", startIndex='" + startIndex + '\'' +
                ", itemsPerPage='" + itemsPerPage + '\'' +
                '}';
    }
    public Data() {
    }

    public Data(ArrayList<Items> items, String updated, Integer totalItems, Integer startIndex, Integer itemsPerPage) {
        this.items = items;
        this.updated = updated;
        this.totalItems = totalItems;
        this.startIndex = startIndex;
        this.itemsPerPage = itemsPerPage;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
}
