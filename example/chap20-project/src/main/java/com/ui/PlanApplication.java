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

public class PlanApplication extends ParentsAplication{

    public Plan validationPlan(String planDt, int tripId) {

        System.out.println("시간을 입력해주세요 (HH:MM)");
        String planTime = scanner.nextLine();

        System.out.println("PLAN 내용을 입력해주세요.");
        String planContents = scanner.nextLine();

        while (true) {
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
            Tag tag = UtilService.getTag(plantag);
            if(tag != null) {
                return new Plan(tripId, planDt, planTime, planContents, tag);
            }
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

        // 수정할 시퀀스 가져오기
        int planId = getPlanId(tripId, targetDt);
        try {
            Plan plan = updateValidationPlan(planService.findPlanByPlanId(planId));

            // 수정하기
            planService.updatePlan(plan);

            System.out.println("==========" + plan.getPlanDate() + "=============");
            System.out.println(plan.getPlanTime() + " | " + plan.getContent() + "(" +plan.getTag()+ ")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Plan updateValidationPlan(Plan plan) {

        System.out.println("시간을 입력해주세요 (HH:MM) ");
        String planTime = scanner.nextLine();

        if (planTime.isEmpty()) {
            planTime = plan.getPlanTime();
        }

        System.out.println("PLAN 내용을 입력해주세요.");
        String planContents = scanner.nextLine();

        if (planContents.isEmpty()) {
            planContents = plan.getContent();
        }

        while (true) {
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
            Tag tag = UtilService.getTag(plantag);

            if(tag != null) {
                return new Plan(plan.getPlanId(), plan.getTripId(), plan.getPlanDate(), planTime, planContents, tag);
            }
        }
    }

    public int getPlanId (int tripId, String planDate) {
        List<Plan> planList = planService.findPlanByTripIdAndPlanDate(tripId, planDate);

        while (true) {

            System.out.println("========== " + planDate + "==============");
            for(int i = 1; i <= planList.size(); i++) {
                Plan plan = planList.get(i-1);
                System.out.println(i + ". " + plan.getPlanId() + plan.getPlanTime() + "| "
                        + plan.getContent() + "(" +plan.getTag()+ ")");
            }
            System.out.println("(0)BACK");
            System.out.println("PLAN의 번호를 입력해주세요.");
            int choiceNum = scanner.nextInt();

            if (choiceNum <= 0) {
                break;
            }
            // check
            return planList.get(choiceNum - 1).getPlanId();
        }

        return -1;
    }


    public void deletePlan(int tripId) {
        System.out.println("================DELETE PLAN===================");
        String targetDt = choicePlanDt(tripId);
        int planId = getPlanId(tripId, targetDt);

        try {
            planService.deletePlan(planId);
            System.out.println("삭제되었습니다.!! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println();


    }
}
