package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable {

    private int planId;
    private Date planDate;
    private String content;
    private Tag tag;
    
}
