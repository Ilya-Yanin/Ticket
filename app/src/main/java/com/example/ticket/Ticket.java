package com.example.ticket;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String uid;
    private String pointStart;
    private String pointEnd;
    private String timeStart;
    private String timeEnd;
    private int price;

    public Ticket(String uid, String pointStart, String pointEnd, String timeStart, String timeEnd, int price) {
        this.uid = uid;
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.price = price;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPointStart() {
        return pointStart;
    }

    public void setPointStart(String pointStart) {
        this.pointStart = pointStart;
    }

    public String getPointEnd() {
        return pointEnd;
    }

    public void setPointEnd(String pointEnd) {
        this.pointEnd = pointEnd;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
