package com.domain;

import java.util.Arrays;

public enum Tag {
      NONE_TAG("없음")
    , RESTAURANT("음식점")
    , CAFE_DESERT("카페/디저트")
    , SPOT("관광명소")
    , SOPPING("쇼핑")
    , THEME_EXPERIENCE("테마/체험")
    , PUB_BAR("술집(바)")
    , LODGING("숙소");

    private final String tagName;

    Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

}
