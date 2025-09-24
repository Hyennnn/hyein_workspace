package com.ui;

import com.persistence.FilePlanStorage;
import com.persistence.FileTripStorage;
import com.persistence.PlanRepository;
import com.persistence.TripRepository;
import com.service.PlanService;
import com.service.TripSservice;
import com.service.UtilService;

import java.util.Scanner;

public class ParentsAplication {
    protected static TripSservice tripSservice;
    protected final PlanService planService;
    protected final Scanner scanner;
    protected final UtilService utilService = new UtilService();


    protected ParentsAplication() {
        PlanRepository planRepository = new PlanRepository(new FilePlanStorage());
        TripRepository tripRepository = new TripRepository(new FileTripStorage());
        planService = new PlanService(planRepository);
        tripSservice = new TripSservice(tripRepository, planRepository);
        scanner = new Scanner(System.in);
    }
}
