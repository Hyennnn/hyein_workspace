package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Plan {
    private int planId;
    private int tripId;
    private String planDate;
    private String planTime;
    private String content;
    private Tag tag;

    public Plan(int tripId, String planDate, String planTime, String content, Tag tag) {
        this.tripId = tripId;
        this.planDate = planDate;
        this.planTime = planTime;
        this.content = content;
        this.tag = tag;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
