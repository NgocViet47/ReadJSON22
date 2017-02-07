package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Status {
    private String value;
    private String reason;

    @Override
    public String toString() {
        return "Status{" +
                "value='" + value + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public Status() {
    }

    public Status(String value, String reason) {
        this.value = value;
        this.reason = reason;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
