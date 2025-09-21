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
}
