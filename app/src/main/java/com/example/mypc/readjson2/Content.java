package com.example.mypc.readjson2;

/**
 * Created by MyPC on 1/11/2017.
 */

public class Content {
    private String one="1";
    private String fire="5";
    private String six="6";

    @Override
    public String toString() {
        return "Content{" +
                "one='" + one + '\'' +
                ", fire='" + fire + '\'' +
                ", six='" + six + '\'' +
                '}';
    }

    public Content() {
    }

    public Content(String one, String fire, String six) {
        this.one = one;
        this.fire = fire;
        this.six = six;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }
}
