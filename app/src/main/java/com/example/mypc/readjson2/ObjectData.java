package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class ObjectData {
    private String apiVersion;
    private Data data;

    @Override
    public String toString() {
        return "ObjectData{" +
                "apiVersion='" + apiVersion + '\'' +
                '}';
    }

    public ObjectData() {
    }

    public ObjectData(String apiVersion, Data data) {
        this.apiVersion = apiVersion;
        this.data = data;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
