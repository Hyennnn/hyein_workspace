package com.ui;

import com.domain.Plan;
import com.domain.Trip;
import com.persistence.FileTripStorage;
import com.persistence.TripRepository;
import com.service.TripSservice;
import com.service.UtilService;

import java.time.LocalDate;
import java.util.List;

public class Application extends PlanApplication {
    private static List<Trip> tripList;
    private static List<LocalDate> tripBetweenList;
    public Application() {

    }

    public static void run(Application application) {
        while (true) {
            System.out.println("======= MY TRIP LIST =======");
            tripList = tripSservice.findAllTrip();
            for(Trip t : tripList) {
                System.out.println(t.getSequence() + "-" + t.getCity() + "(" + t.getCountry() + "): "
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
                    case 2 -> application.choiceDetailTrip("DTAIL_TYPE");
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
            for(Trip t : tripList) {
                System.out.println( t.getSequence() + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
            }
            if (tripList.size() <= 0) {
                return;
            }

            System.out.println("(0)GO MY TRIP LIST");
            System.out.println("삭제할 TRIP의 번호를 선택해 주세요.");
            int choiceNum = scanner.nextInt();

            try {
                if (choiceNum <= 0) {
                    break;
                } else {
                    // 번호 넘겨주기 > 비지니스 로직에서 번호 확인 처리
                        tripSservice.deleteByTripId(choiceNum);
                }



            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public void choiceDetailTrip(String type) {
        while (true) {
            System.out.println("======== MY TRIP CHOICE TRIP ========");
            tripList = tripSservice.findAllTrip();
            for(Trip t : tripList) {
                System.out.println( t.getSequence() + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
            }
            System.out.println("(0)GO MY TRIP LIST");
            System.out.println("TRIP의 번호를 선택해 주세요.");
            int choiceNum = scanner.nextInt();

            try {
                if (choiceNum <= 0) {
                    return; 
                } else {

                    if(type.equals("DTAIL_TYPE")) {
                        tripSservice.checkTripId(choiceNum);
                        detailTrip(choiceNum);
                    } else if(type.equals("UPDATE_TYPE")) {
                        tripSservice.checkTripId(choiceNum);
                        updateTrip(choiceNum);
                    }

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
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
                        break;
                    }
                    case 2 -> updateTrip((int)trip.getSequence());
                    case 3 -> addPlan(tripId);
                    case 4 -> updatePlan(tripId);
                    case 5 -> deletePlan();
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류:" +e.getMessage());
            }

        }
    }

    private void updateTrip(int tripId) {
        Trip trip = tripSservice.getTripByTripId(tripId);
        while (true) {
            System.out.println("==========UPDATE TRIP===========");
            System.out.println("-" + trip.getCity() + "(" + trip.getCountry() + "): "
                    + trip.getStartDt() + " ~ " + trip.getEndDt());
            System.out.println("================================");

            Trip updateTrip = validationTrip();
            tripSservice.updateTrip(tripId, updateTrip);

            // 데이터 저장
            System.out.println("---------------MY TRIP 수정 --------------");
            System.out.println("[" + trip.getCity() + "(" + trip.getCountry() + ")]" );
            System.out.println(trip.getStartDt() + " ~ " + trip.getEndDt());
            System.out.println("-----------------------------------------");
            System.out.println();
            System.out.println();

            return;

        }

    }

    public static void main(String[] args) {
        Application.run(new Application());
    }
}
