package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable {

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
}
