package com.ui;

import com.domain.Tag;

import java.util.Scanner;

import static com.domain.Tag.*;

public class PlanApplication {
    private Scanner scanner;

    public void addPlan() {
        System.out.println("================ADD PLAN===================");

        System.out.println("날짜를 입력해 주세요.");
        String planDt =  scanner.nextLine();

        // TODO: 입력한 날짜의 일정 list 가져오기

        System.out.println("시간을 입력해 주세요.");
        String planTm =  scanner.nextLine();

        System.out.println("PLAN 내용을 입력해 주세요.");
        String planContents =  scanner.nextLine();

        System.out.println("태그를 선택해 주세요.");
        System.out.println("(0) 없음");
        System.out.println("(1) 관광명소");
        System.out.println("(2) 음식점");
        System.out.println("(3) 카페/디저트");
        System.out.println("(4) 쇼핑");
        System.out.println("(5) 테마/체험");
        System.out.println("(6) 술집(바)");
        System.out.println("(7) 숙소");
        int plantag = scanner.nextInt();

         switch (plantag) {
            case 1 -> RESTAURANT.getDeclaringClass();
            case 2 -> CAFE_DESERT.getDeclaringClass();
            case 3 -> SPOT.getDeclaringClass();
            case 4 -> SOPPING.getDeclaringClass();
            case 5 -> THEME_EXPERIENCE.getDeclaringClass();
            case 6 -> PUB_BAR.getDeclaringClass();
            case 7 -> LODGING.getDeclaringClass();
            default -> NONE_TAG.getDeclaringClass();
        }

    }

    public void updatePlan() {
        System.out.println("================UPDATE PLAN===================");
    }

    public void deletePlan() {
        System.out.println("================DELETE PLAN===================");

    }
}
