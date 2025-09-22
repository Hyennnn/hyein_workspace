package com.ui;

import com.domain.Plan;
import com.domain.Tag;
import com.domain.Trip;
import com.persistence.FilePlanStorage;
import com.persistence.FileTripStorage;
import com.persistence.PlanRepository;
import com.persistence.TripRepository;
import com.service.PlanService;
import com.service.TripSservice;
import com.service.UtilService;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static com.domain.Tag.*;

public class PlanApplication {
    protected static TripSservice tripSservice;
    protected final PlanService planService;
    protected final Scanner scanner;
    public final UtilService utilService = new UtilService();



    public PlanApplication() {

        PlanRepository planRepository = new PlanRepository(new FilePlanStorage());
        TripRepository tripRepository = new TripRepository(new FileTripStorage());
        planService = new PlanService(planRepository);
        tripSservice = new TripSservice(tripRepository);
        scanner = new Scanner(System.in);
    }

    public Plan validationPlan(String planDt, int tripId) {

        while (true) {

            System.out.println("시간을 입력해 주세요 (ex) 11:25)");
            String planTime = scanner.nextLine();

            System.out.println("PLAN 내용을 입력해 주세요.");
            String planContents = scanner.nextLine();

            if (planContents.length() > 200) {
                System.out.println("200자 이내로 적어주세요.");
            }

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

            Tag tag = null;
            switch (plantag) {
                case 0 -> tag = NONE_TAG;
                case 1 -> tag = SPOT;
                case 2 -> tag = RESTAURANT;
                case 4 -> tag = CAFE_DESERT;
                case 5 -> tag = SOPPING;
                case 6 -> tag = PUB_BAR;
                case 7 -> tag = LODGING;
                default -> System.out.println("태그를 다시 선택해 주세요.");
            }

            return new Plan(tripId,planDt, planTime, planContents, tag);
        }


    }

    public void addPlan(int tripId) {

        // 날짜 선택
        choicePlanDt(tripId);


     //  String dt = choicePlanDt(tripId);

//       System.out.println("===========" + dt + "=============");
//       try {
//           validationPlan(dt, tripId);
//
//       } catch (Exception e) {
//           System.out.println(e.getMessage());
//       }

        System.out.println("==========================================");

    }

    public void choicePlanDt(int tripId) {

        Trip trip = tripSservice.getTripByTripId(tripId);
        List<LocalDate> dateList = UtilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt());

        while (true) {
            System.out.println("(0)BACK");
            for(int i = 0 ; i <= dateList.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + dateList.get(i));
            }

            System.out.println("날짜를 선택해 주세요.");
            int choiceNum = scanner.nextInt();

            if (choiceNum <= 0) {
                break;
            } else if (choiceNum > dateList.size()) {
                System.out.println("선택한 날짜가 없습니다. 다시 입력해 주세요.");
            }

            validationPlan(dateList.get(choiceNum).toString(), tripId);
        }
        
    }


//    public void addPlan() {
//        System.out.println("================ADD PLAN===================");
//
//        System.out.println("날짜를 입력해 주세요");
//        String planDt = scanner.nextLine();
//
//        System.out.println("시간을 입력해 주세요");
//        String tm = scanner.nextLine();
//
//        System.out.println("PLAN 내용을 입력해 주세요.");
//        String planContents =  scanner.nextLine();
//
//
//        System.out.println("태그를 선택해 주세요.");
//        System.out.println("(0) 없음");
//        System.out.println("(1) 관광명소");
//        System.out.println("(2) 음식점");
//        System.out.println("(3) 카페/디저트");
//        System.out.println("(4) 쇼핑");
//        System.out.println("(5) 테마/체험");
//        System.out.println("(6) 술집(바)");
//        System.out.println("(7) 숙소");
//
//        int plantag = scanner.nextInt();
//
//         switch (plantag) {
//            case 1 -> RESTAURANT.getDeclaringClass();
//            case 2 -> CAFE_DESERT.getDeclaringClass();
//            case 3 -> SPOT.getDeclaringClass();
//            case 4 -> SOPPING.getDeclaringClass();
//            case 5 -> THEME_EXPERIENCE.getDeclaringClass();
//            case 6 -> PUB_BAR.getDeclaringClass();
//            case 7 -> LODGING.getDeclaringClass();
//            default -> NONE_TAG.getDeclaringClass();
//        }
//
//    }

    public void updatePlan(String type) {
        System.out.println("================UPDATE PLAN===================");
        System.out.println("날짜를 입력해 주세요");
        String planDt = scanner.nextLine();

        System.out.println("수정할 PLAN의 번호를 입력해 주세요");
        int planNUm = scanner.nextInt();

    }

    public void deletePlan() {
        System.out.println("================DELETE PLAN===================");
        System.out.println("날짜를 입력해 주세요");
        String planDt = scanner.nextLine();

        System.out.println("삭제할 PLAN의 번호를 입력해 주세요");
        int planNUm = scanner.nextInt();
    }
}
