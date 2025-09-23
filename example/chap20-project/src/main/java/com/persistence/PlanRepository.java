package com.persistence;

import com.domain.Plan;

import java.util.List;

public class PlanRepository {
    private final PlanStorage planStorage;
    private final List<Plan> planList;

    public PlanRepository(PlanStorage planStorage) {
        this.planStorage = planStorage;
        this.planList = planStorage.loadPlanList();
    }

    public void insertPlan(Plan plan) {
        System.out.println("PlanRepository-insertPlan");
        plan.setPlanId(lastPlanId() + 1);
        planList.add(plan);
        planStorage.savePlan(planList);
    }

    public Integer lastPlanId() {
        return planList.isEmpty()? 0 : planList.get(planList.size()-1).getPlanId();
    }
    public List<Plan> findPlanByTripId(int tripId) {
        System.out.println("PlanRepository-findPlanByTripId");
        return planList.stream()
                .filter(plan -> plan.getTripId() == tripId)
                .toList();
    }

    public List<Plan> findPlanByTripIdAndPlanDate(int tripId, String planDate) {
        System.out.println("PlanRepository-findPlanByTripIdAndPlanDate");
        return planList.stream()
                .filter(plan -> plan.getTripId() == tripId)
                .filter(date -> date.getPlanDate().equals(planDate))
                .toList();

    }

    public Plan findPlanByPlanId(int planId) {
        System.out.println("PlanRepository-findPlanByPlanId");
        return planList.stream()
                .filter(plan -> plan.getPlanId() == planId)
                .findFirst()
                .orElse(null);
    }

    public void updatePlanByPlanId(int planId, Plan plan) {

        for (int i = 0; planList.size() > i; i++) {
            Plan target =  planList.get(i);
            if (target.getPlanId() == planId) {
               target.setPlanTime(plan.getPlanTime());
               target.setContent(plan.getContent());
               target.setTag(plan.getTag());
               planStorage.savePlan(planList);
               break;
            }
        }
    }
}
