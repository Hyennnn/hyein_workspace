package com.ui;

import com.domain.Trip;
import com.persistence.FileTripStorage;
import com.persistence.TripRepository;
import com.service.TripSservice;
import com.service.UtilService;

import java.time.LocalDate;
import java.util.List;

public class Application extends PlanApplication {
    protected static TripSservice tripSservice;
    private static List<Trip> tripList;
    private static List<LocalDate> tripBetweenList;
    int no = 1;
    public Application() {
        TripRepository tripRepository = new TripRepository(new FileTripStorage());
        tripSservice = new TripSservice(tripRepository);
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
                    case 2 -> application.choiceDetailTrip();
                    case 3 -> application.deleteTrip();
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


        // scanner 입력받기
        System.out.println("여행할 나라를 입력해주세요.");
        String country = scanner.nextLine();

        System.out.println( country + "의 여행지를 입력해주세요.");
        String city = scanner.nextLine();

        String startDt = "";
        boolean checkDt = true;
        while (checkDt) {
            System.out.println(city + " 출발일을 입력해주세요.(YYYY-MM-DD)");
            startDt = scanner.nextLine();

            // 날짜 체크
            if (utilService.checkDate(startDt)) {
                checkDt = false;
            } else {
                System.out.println("출발일을 다시 입력해 주세요.");
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
                System.out.println("종료일을 다시 입력해 주세요.");
            }
        }

        // service
        System.out.println("Application- service");
        tripSservice.addTrip(new Trip( country, city, startDt, endDt));

        // 데이터 저장
        System.out.println("---------------MY TRIP이 생성 --------------");
        System.out.println("[" + city + "(" + country + ")]" );
        System.out.println(startDt + " ~ " + endDt);
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

    }

    public void deleteTrip() {
        no = 1;
        System.out.println("======== DELETE TRIP ========");
        while (true) {
            tripList = tripSservice.findAllTrip();
            for(Trip t : tripList) {
                System.out.println( t.getSequence() + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
                no++;
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

    public void choiceDetailTrip() {
        no = 1;
        System.out.println("======== MY TRIP CHOICE TRIP ========");

        while (true) {
            tripList = tripSservice.findAllTrip();
            for(Trip t : tripList) {
                System.out.println( t.getSequence() + "." + t.getCity() + "(" + t.getCountry() + "): "
                        + t.getStartDt() + " ~ " + t.getEndDt() );
                no++;
            }
            System.out.println("(0)GO MY TRIP LIST");
            System.out.println("TRIP의 번호를 선택해 주세요.");
            int choiceNum = scanner.nextInt();

            try {
                if (choiceNum <= 0) {
                    return; 
                } else {
                    tripSservice.checkTripId(choiceNum);
                    detailTrip(choiceNum);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }


    }
    public void detailTrip(int tripId) {
        Trip trip = tripSservice.getTripByTripId(tripId);
        while (true) {


            System.out.println("======== 후쿠오카 여행 ===-=====");
            System.out.println("-" + trip.getCity() + "(" + trip.getCountry() + "): "
                    + trip.getStartDt() + " ~ " + trip.getEndDt());
            System.out.println("==============================");

            //tripBetweenList = UtilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt());
            UtilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt()).forEach(System.out::println);
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
                    case 3 -> addPlan();
                    case 4 -> updatePlan();
                    case 5 -> deletePlan();
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
        System.out.println("(1) 돌아가기");
        System.out.println("(2) MY TRIP 수정하기");
        System.out.println("(3) 출발일 수정하기");
        System.out.println("(4) 종료일 수정하기");

        int choice = scanner.nextInt();

    }

    public static void main(String[] args) {
        Application.run(new Application());
    }
}
