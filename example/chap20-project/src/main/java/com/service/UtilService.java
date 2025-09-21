package com.service;

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
}
