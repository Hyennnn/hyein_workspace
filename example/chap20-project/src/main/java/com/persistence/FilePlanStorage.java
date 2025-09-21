package com.persistence;

import com.domain.Plan;

import java.util.List;

public class FilePlanStorage implements PlanStorage {
    @Override
    public void savePlan(List<Plan> planList) {

    }

    @Override
    public List<Plan> loadPlanList() {
        return List.of();
    }
}
