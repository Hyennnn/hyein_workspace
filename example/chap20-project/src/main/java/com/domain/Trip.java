package com.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;
    private static long sequenceCounter = 0;
    private long sequence;

    private String country;
    private String city;
    private String startDt;
    private String endDt;
    private List<Plan> planList;
    private List<LocalDate> betweenDtList;

    public Trip(String country, String city, String startDt, String endDt) {
        this.sequence = ++sequenceCounter;
        this.country = country;
        this.city = city;
        this.startDt = startDt;
        this.endDt = endDt;
    }

    public long getSequence() {
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

    public List<Plan> getPlanList() {
        return planList;
    }

    public void setPlanList(List<Plan> planList) {
        this.planList = planList;
    }

}
