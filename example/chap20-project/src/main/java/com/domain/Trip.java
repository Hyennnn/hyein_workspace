package com.domain;

import java.time.LocalDate;
import java.util.List;

public class Trip {
    private int sequence;
    private String country;
    private String city;
    private String startDt;
    private String endDt;
    private List<LocalDate> betweenDtList;

    public Trip(String country, String city, String startDt, String endDt) {
        this.country = country;
        this.city = city;
        this.startDt = startDt;
        this.endDt = endDt;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSequence() {
        return sequence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStartDt() {
        return startDt;
    }

    public void setStartDt(String startDt) {
        this.startDt = startDt;
    }

    public String getEndDt() {
        return endDt;
    }

    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }


}
