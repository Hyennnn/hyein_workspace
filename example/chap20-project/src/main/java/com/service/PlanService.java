package com.service;

import com.domain.Plan;
import com.persistence.PlanRepository;

import java.util.List;

public class PlanService {
    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }


    public void addPlan(Plan plan) {
        System.out.println("PlanService- addPlan");
        planRepository.insertPlan(plan);
    }

    public List<Plan> findPlanByTripId(int tripId) {
       return planRepository.findPlanByTripId(tripId);
    }

    public List<Plan> findPlanByTripIdAndPlanDate(int tripId, String planDate) {
        return planRepository.findPlanByTripIdAndPlanDate(tripId, planDate);
    }

    public void updatePlan(int planId, Plan plan) {
        System.out.println("PlanService- updatePlan");
        Plan beforePlan = planRepository.findPlanByPlanId(planId);

        if(beforePlan != null) {
            throw new  IllegalArgumentException("해당 PLAN을 찾을 수 없습니다.");
        }

        planRepository.updatePlanByPlanId(planId, plan);

    }
}
