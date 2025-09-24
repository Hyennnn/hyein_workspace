package com.service;

import com.domain.Tag;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.domain.Tag.*;
import static com.domain.Tag.CAFE_DESERT;
import static com.domain.Tag.LODGING;
import static com.domain.Tag.PUB_BAR;
import static com.domain.Tag.SOPPING;

public class UtilService {

    // 날짜 패턴이 맞는지 확인
    public static boolean checkDate (String date) {
        try {
            SimpleDateFormat dateFormatParser = new SimpleDateFormat("yyyy-M-d");
            dateFormatParser.setLenient(false);
            dateFormatParser.parse(date);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // 정규화된 날짜 반환
    public static String nomalDate (String date) {
        checkDate(date);

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
            LocalDate parsed = LocalDate.parse(date, formatter);

            String normalized = parsed.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//            System.out.println("정규화된 날짜: " + normalized);
            return normalized;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }
    // 날짜 비교
    public static boolean compareDate (String startDt, String endDt) {

        try {
            LocalDate start = LocalDate.parse(startDt);
            LocalDate end =  LocalDate.parse(endDt);

            if (start.compareTo(end) > 0 ) {
                return true;
            }
            return false;

        } catch (Exception e) {
            return false;
        }
    }

    // 두개의 날짜 가져오기
    public static List<LocalDate> getBetweenDateArr (String startDt, String endDt) {
        try {

            LocalDate start = LocalDate.parse(startDt);
            LocalDate end =  LocalDate.parse(endDt);

            return  start.datesUntil(end.plusDays(1))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            return new ArrayList<>();
        }

    }

    // 태그
    public static Tag getTag(int tagNum) {
        switch (tagNum) {
            case 0 -> {
                return NONE_TAG;
            }
            case 1 -> {
                return SPOT;
            }
            case 2 -> {
                return RESTAURANT;
            }
            case 4 -> {
                return CAFE_DESERT;
            }
            case 5 -> {
                return SOPPING;
            }
            case 6 -> {
                return PUB_BAR;
            }
            case 7 -> {
                return LODGING;
            }
            default -> {
                return null;
            }
        }
    }
}
