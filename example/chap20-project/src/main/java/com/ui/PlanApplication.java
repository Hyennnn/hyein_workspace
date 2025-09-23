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
            Tag tag = null;
            System.out.println("시간을 입력해주세요 (ex) 11:25)");
            String planTime = scanner.nextLine();

            System.out.println("PLAN 내용을 입력해주세요.");
            String planContents = scanner.nextLine();

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
            try {
                    switch (plantag) {
                        case 1 -> tag = SPOT;
                        case 2 -> tag = RESTAURANT;
                        case 4 -> tag = CAFE_DESERT;
                        case 5 -> tag = SOPPING;
                        case 6 -> tag = PUB_BAR;
                        case 7 -> tag = LODGING;
                        default -> tag = NONE_TAG;
                    }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        System.out.println("tag = " + tag);
        return new Plan(tripId,planDt, planTime, planContents, tag);
    }

    public void addPlan(int tripId) {
        // 날짜 선택
        String choicePlanDt = choicePlanDt(tripId);
        System.out.println("===========" + choicePlanDt + "=============");

       try {
           Plan plan = validationPlan(choicePlanDt, tripId);
           planService.addPlan(plan);

           System.out.println("---------------MY PLAN 생성 --------------");
           System.out.println("==" + plan.getPlanDate() + "================");
           System.out.println("-" + plan.getPlanTime() + " | " + plan.getContent() + "(" +plan.getTag().getTagName()+ ")");
           System.out.println();
           System.out.println();

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    public String choicePlanDt(int tripId) {
        Trip trip = tripSservice.getTripByTripId(tripId);
        List<LocalDate> dateList = UtilService.getBetweenDateArr(trip.getStartDt(), trip.getEndDt());

        while (true) {
            System.out.println("(0)BACK");
            for(int i = 1 ; i <= dateList.size(); i++) {
                System.out.println("(" + i + ") " + dateList.get(i - 1));
            }

            System.out.println("날짜의 번호를 입력해주세요.");
            int choiceNum = scanner.nextInt();

            if (choiceNum <= 0) {
                break;
            } else if (choiceNum > dateList.size() -1 ) {
                System.out.println("선택한 날짜가 없습니다. 다시 입력해주세요.");
            }

            return dateList.get(choiceNum - 1).toString();
        }

        return null;
        
    }


    public void updatePlan(int tripId) {
        System.out.println("================UPDATE PLAN===================");
        String targetDt = choicePlanDt(tripId);

        // 수정한 시퀀스 가져오기
        int planId = planDateList(tripId, targetDt);
        Plan plan = validationPlan(targetDt, tripId);

        System.out.println("==========" + plan.getPlanDate() + "=============");
        System.out.println(plan.getPlanTime() + " | " + plan.getContent() + "(" +plan.getTag()+ ")");

        // 수정하기
        planService.updatePlan(planId, plan);

    }

    public int planDateList (int tripId, String planDate) {
        List<Plan> planList = planService.findPlanByTripIdAndPlanDate(tripId, planDate);

        while (true) {

            System.out.println("========== " + planDate + "==============");
            for(int i = 1; i <= planList.size(); i++) {
                Plan plan = planList.get(i-1);
                System.out.println(i + ". " + plan.getPlanId() + plan.getPlanTime() + "| "
                        + plan.getContent() + "(" +plan.getTag()+ ")");
            }
            System.out.println("(0)BACK");
            System.out.println("수정할 PLAN의 번호를 입력해주세요.");
            int choiceNum = scanner.nextInt();

            System.out.println("choiceNum = " + (choiceNum - 1 ));
            System.out.println("choiceNum = " + planList.get(choiceNum - 1).getPlanId());

            if (choiceNum <= 0) {
                break;
            } else if (choiceNum - 1 > planList.size() ) {
                System.out.println("선택한 PLAN이 없습니다. 다시 입력해주세요.");
            }

            // return planList.get(choiceNum - 1).getPlanId();
        }

       throw new IllegalArgumentException("PLAN을 찾을 수 없습니다.");
    }


    public void deletePlan() {
        System.out.println("================DELETE PLAN===================");
        System.out.println("날짜를 입력해주세요");
        String planDt = scanner.nextLine();

        System.out.println("삭제할 PLAN의 번호를 입력해주세요");
        int planNUm = scanner.nextInt();
    }
}
