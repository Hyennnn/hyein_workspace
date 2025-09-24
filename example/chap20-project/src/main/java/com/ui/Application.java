package com.ui;

import com.domain.Plan;
import com.domain.Trip;
import com.persistence.FileTripStorage;
import com.persistence.TripRepository;
import com.service.PlanService;
import com.service.TripSservice;
import com.service.UtilService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Application extends ParentsAplication{
    private final PlanApplication planApplication = new PlanApplication();

    private static List<Trip> tripList;
    private static List<LocalDate> tripBetweenList;

    public Application() {
    }

    public static void run(Application application) {
        while (true) {
            System.out.println("======= MY TRIP LIST =======");
            tripList = tripSservice.findAllTrip();
            for(Trip t : tripList) {
                System.out.println( "-" + t.getCity() + "(" + t.getCountry() + "): "
                + t.getStartDt() + " ~ " + t.getEndDt() );
            }

            System.out.println("=============================");
            System.out.println(">>(1) ADD TRIP! ");

            // 여행이 있을 경우
            if (tripList.size() > 0) {
                System.out.println(">>(2) DETAIL TRIP!");
                System.out.println(">>(3) DELETE TRIP!");
            }
            System.out.println(">>(9) EXIT");

            int choice = application.scanner.nextInt();
            application.scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> application.addTrip();
                    case 2 -> application.choiceDetailTrip();
                    case 3 -> application.deleteTrip();
                    case 9 -> {
                        System.out.println("BYE~ :) ");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }

        }
    }

    public Trip validationTrip() {
        // scanner 입력받기
        System.out.println("여행할 나라를 입력해주세요.");
        String country = scanner.nextLine();

        System.out.println( country + "여행지를 입력해주세요.");
        String city = scanner.nextLine();

        String startDt = "";
        boolean checkDt = true;
        while (checkDt) {
            System.out.println(city + "("+ country + ")" + " 출발일을 입력해주세요.(YYYY-MM-DD)");
            startDt = scanner.nextLine();
            startDt = UtilService.nomalDate(startDt);
            // 날짜 체크
            if (utilService.checkDate(startDt)) {
                checkDt = false;
            } else {
                System.out.println("출발일을 다시 입력해주세요.");
            }

        }

        String endDt = "";
        checkDt = true;
        while (checkDt) {
            System.out.println(city + " 종료을 입력해주세요.(YYYY-MM-DD)");
            endDt = scanner.nextLine();
            endDt = UtilService.nomalDate(endDt);

            // 날짜 체크
            if (UtilService.checkDate(endDt)) {
                // 날짜 비교
                if (UtilService.compareDate(startDt, endDt)) {
                    System.out.println("출발일이 종료일보다 큽니다. 종료일을 다시 입력해주세요.");
                } else {
                    checkDt = false;
                }
            } else {
                System.out.println("종료일을 다시 입력해주세요.");
            }
        }


        return new Trip( country, city, startDt, endDt);
    }

    public void addTrip() {
        System.out.println("========= ADD TRIP =========");

        Trip trip = validationTrip();
        tripSservice.addTrip(trip);

        // 데이터 저장
        System.out.println("---------------MY TRIP 생성 --------------");
        System.out.println("[" + trip.getCity() + "(" + trip.getCountry() + ")]" );
        System.out.println(trip.getStartDt() + " ~ " + trip.getEndDt());
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

    }

    public void deleteTrip() {
        System.out.println("======== DELETE TRIP ========");
        while (true) {
            tripList = tripSservice.findAllTrip();
            for(int i = 0; i < tripList.size(); i++) {
                Trip t = tripList.get(i);
                System.out.println( (i + 1) + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
            }
            if (tripList.size() <= 0) {
                return;
            }

            System.out.println("(0)GO MY TRIP LIST");
            System.out.println("삭제할 TRIP의 번호를 선택해 주세요.");
            int choiceNum = scanner.nextInt();
            int tripSeq = tripList.get(choiceNum - 1).getSequence();
            try {
                if (choiceNum <= 0) {
                    break;
                } else {
                    // 번호 넘겨주기 > 비지니스 로직에서 번호 확인 처리
                        tripSservice.deleteByTripId(tripSeq);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public void choiceDetailTrip() {
        while (true) {
            System.out.println("======== MY TRIP CHOICE TRIP ========");
            tripList = tripSservice.findAllTrip();
           for(int i =  0; i < tripList.size() ; i++) {
               Trip t = tripList.get(i);
                System.out.println( (i + 1) + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
            }
            System.out.println("(0)GO MY TRIP LIST");
            System.out.println("TRIP의 번호를 선택해 주세요.");
            int choiceNum = scanner.nextInt();

            int tripSeq = tripList.get(choiceNum - 1).getSequence();
            if (choiceNum <= 0) {
                return;
            } else {
                tripSservice.checkTripId(tripSeq);
                detailTrip(tripSeq);
            }
        }
    }
    public void detailTrip(int tripId) {
        Trip trip = tripSservice.getTripByTripId(tripId);
        while (true) {
            System.out.println("============ MY TRIP ==========");
            System.out.println("-" + trip.getCity() + "(" + trip.getCountry() + "): "
                    + trip.getStartDt() + " ~ " + trip.getEndDt());
            System.out.println("==============================");

            tripBetweenList = UtilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt());
            //tilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt()).forEach(System.out::println);
            List<Plan> planList = planService.findPlanByTripId(tripId);
            for (LocalDate dt : tripBetweenList) {
                System.out.println(dt.toString());

                for(Plan plan : planList) {
                    if(dt.toString().equals(plan.getPlanDate())) {
                        System.out.println("-" + plan.getPlanTime() + " | " + plan.getContent() + "(" +plan.getTag()+ ")");
                    }
                }
            }

            System.out.println("-------------------------------");

            System.out.println("(1)BACK");
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
                    case 2 -> updateTrip(trip.getSequence());
                    case 3 -> addPlan(tripId);
                    case 4 -> planApplication.updatePlan(tripId);
                    case 5 -> deletePlan(tripId);
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류:" +e.getMessage());
            }
        }
    }

    private Trip updateValidation(Trip trip) {
        // scanner 입력받기
        System.out.println("여행할 나라를 입력해주세요.");
        String country = scanner.nextLine();

        if (country.isEmpty()) {
            country = trip.getCountry();
        }

        System.out.println( country + "여행지를 입력해주세요.");
        String city = scanner.nextLine();

        if (city.isEmpty()) {
            city = trip.getCity();
        }

        String startDt = "";
        boolean checkDt = true;
        while (checkDt) {
            System.out.println(city + "("+ country + ")" + " 출발일을 입력해주세요.(YYYY-MM-DD)");
            startDt = scanner.nextLine();
            startDt = UtilService.nomalDate(startDt);
            // 날짜 체크
            if (utilService.checkDate(startDt)) {

                checkDt = false;
            } else {
                System.out.println("출발일을 다시 입력해주세요.");
            }

        }

        String endDt = "";
        checkDt = true;
        while (checkDt) {
            System.out.println(city + " 종료을 입력해주세요.(YYYY-MM-DD)");
            endDt = scanner.nextLine();
            endDt = UtilService.nomalDate(endDt);
            // 날짜 체크
            if (UtilService.checkDate(endDt)) {

                // 날짜 비교
                if (UtilService.compareDate(startDt, endDt)) {
                    System.out.println("출발일이 종료일보다 큽니다. 종료일을 다시 입력해주세요.");
                } else {
                    checkDt = false;
                }
            } else {
                System.out.println("종료일을 다시 입력해주세요.");
            }
        }

        return new Trip(trip.getSequence(), country, city, startDt, endDt);
    }

    private void updateTrip(int tripId) {
        Trip trip = tripSservice.getTripByTripId(tripId);
        System.out.println("==========UPDATE TRIP===========");
        System.out.println("-" + trip.getCity() + "(" + trip.getCountry() + "): "
                + trip.getStartDt() + " ~ " + trip.getEndDt());
        System.out.println("================================");

        // update
        Trip updateTrip = updateValidation(trip);
        tripSservice.updateTrip(updateTrip);

        // 데이터 저장
        System.out.println("---------------MY TRIP 수정 --------------");
        System.out.println("[" + updateTrip.getCity() + "(" + updateTrip.getCountry() + ")]" );
        System.out.println(updateTrip.getStartDt() + " ~ " + updateTrip.getEndDt());
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

        detailTrip(tripId);

    }

    public void addPlan(int tripId) {
        // 날짜 선택
        String choicePlanDt = planApplication.choicePlanDt(tripId);
        System.out.println("===========" + choicePlanDt + "=============");

        try {
            Plan plan = planApplication.validationPlan(choicePlanDt, tripId);
            planService.addPlan(plan);

            System.out.println("---------------MY PLAN 생성 --------------");
            System.out.println("==" + plan.getPlanDate() + "================");
            System.out.println("-" + plan.getPlanTime() + " | " + plan.getContent() + "(" +plan.getTag().getTagName()+ ")");
            System.out.println();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        detailTrip(tripId);
    }

    public void deletePlan(int tripId) {
        System.out.println("================DELETE PLAN===================");
        String targetDt = planApplication.choicePlanDt(tripId);
        int planId = planApplication.getPlanId(tripId, targetDt);

        try {
            planService.deletePlan(planId);
            System.out.println("삭제되었습니다.!! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println();

        detailTrip(tripId);
    }
    public static void main(String[] args) {
        Application.run(new Application());
    }
}
