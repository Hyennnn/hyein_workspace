package com.ui;

import java.util.Scanner;

public class Application {
    private final Scanner scanner;
    PlanApplication planApplication = new PlanApplication();

    public Application() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("======= MY TRIP LIST =======");
            // myTripList
            // - 후쿠오카 여행 (일본)
            // - 다낭 여행 (베트남)
            System.out.println("=============================");
            System.out.println(">>(1) ADD TRIP! ");

            // 여행이 있을 경우
            System.out.println(">>(2) DETAIL TRIP!");
            System.out.println(">>(3) DELETE TRIP!");
            System.out.println(">>(9) EXIT");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> addTrip();
                    case 2 -> detailTrip(1);    // TODO: tripId 넣어주기
                    case 3 -> deleteTrip();
                    case 9 -> {
                        System.out.println("BYE~ :) ");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }

        }
    }

    public void addTrip() {
        System.out.println("========= ADD TRIP =========");

        System.out.println("=============================");

        // scanner 입력받기
        System.out.println("여행할 나라를 입력해주세요.");
        String country = scanner.nextLine();

        System.out.println( country + "의 여행지를 입력해주세요.");
        String city = scanner.nextLine();

        // TODO: 데이터 날짜 체크 해주기
        // TODO: 날짜 비교 해주기
        System.out.println(city + " 출발일을 입력해주세요.(YYYY-MM-DD)");
        String startDt = scanner.nextLine();

        System.out.println(city + " 종료을 입력해주세요.(YYYY-MM-DD)");
        String endDt = scanner.nextLine();


        // service


        // 데이터 저장
        System.out.println("---------------MY TRIP이 생성 --------------");
        System.out.println("[ " + city + "(" + country + ")]" );
        System.out.println(startDt + " ~ " + endDt);
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

    }

    public void deleteTrip() {
        System.out.println("======== DELETE TRIP ========");
        // TODO: MY TRIP LIST 가져오기
        System.out.println("=============================");

        System.out.println("삭제할 MY TRIP의 번호를 입력해 주세요.");
        System.out.println("EXIT: 9999");
        int choice = scanner.nextInt();


        try {
            // TODO: MY TRIP LIST 가져오기
            // TODO: 있는 경우 > 삭제 후 > retrun;
            // TODO: 없는 경우 > "잘못된 입력입니다. 다시 입력해 주세요."
            // TODO: 9999 일경우 뒤로가기

            if (choice == 9999) {
                return;
            }


        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }

    }

    public void detailTrip(int tripId) {

        while (true) {

            System.out.println("======== 후쿠오카 여행 ===-=====");
            // TODO: tripId를 가지고 trip 가져오기
            System.out.println("2025-09-01 ~ 2025.09.03 ");
            System.out.println("==============================");
            System.out.println("===== 9/1 ====================");
            // TODO: planList를 가지고 데이터 예쁘게 뿌려주기
            System.out.println("-------------------------------");

            System.out.println("(1)GO MY TRIP LIST");
            System.out.println("(2)UPDATE TRIP");
            System.out.println("(3)ADD PLAN");
            System.out.println("(4)UPDATE PLAN");
            System.out.println("(5)DELETE PLAN");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        return;
                    }
                    case 2 -> updateTrip();
                    case 3 -> planApplication.addPlan();
                    case 4 -> planApplication.updatePlan();
                    case 5 -> planApplication.deletePlan();
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류:" +e.getMessage());
            }

        }
    }

    private void updateTrip() {
        System.out.println("================UPDATE TRIP===================");

        System.out.println("수정할 번호를 입력해 주세요.");
        System.out.println("(1) MY TRIP 수정하기");
        System.out.println("(2) 출발일 수정하기");
        System.out.println("(3) 종료일 수정하기");

        int choice = scanner.nextInt();



    }

    public static void main(String[] args) {
        new Application().run();
    }
}
