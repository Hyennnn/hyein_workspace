package example.section05.date;

import java.time.*;
import java.util.Date;

public class Applicatio1 {
    public static void main(String[] args) {

        // 1. 기본 생성자
        Date today = new Date();
        System.out.println(today);

        // 2. 매게변수 생성자 Date(long)
        Date time = new Date(100000L);
        System.out.println(time);



        // localTime
        // now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
        // of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(18, 30, 0);
        System.out.println("timeNow = " + timeNow);
        System.out.println("timeOf = " + timeOf);

        //localDate
        // now() : 자신의 PC의 현재 날짜 기준으로 LocalDate 객체 반환
        // of() : 매개변수로 받은 날짜 기준으로 LocalDate 객체 반환
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2022, 1, 1);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        //LocalDateTime
        // now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDate 객체 반환
        // of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDate 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow = " + dateTimeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);

        //ZonedDateTime
        // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime 객체를 반환
        // of() : 매개변수로 java.util.TimeZone 의 getAvailableIDs() 메소드가 반환하는 값을 넣어 ZoneId 반환 받을 수 있다
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
    }
}
