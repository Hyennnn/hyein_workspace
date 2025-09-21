package com.persistence;

import com.domain.Plan;

import java.util.List;

public interface PlanStorage {

    void savePlan(List<Plan> planList);
    List<Plan> loadPlanList();
}
