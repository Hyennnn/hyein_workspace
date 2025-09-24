package com.service;

import com.persistence.PlanRepository;
import com.persistence.TripRepository;
import com.domain.Trip;

import java.util.List;

public class TripSservice {
    private final TripRepository tripRepository;
    private final PlanRepository planRepository;

    public TripSservice(TripRepository tripRepository, PlanRepository planRepository) {
        this.tripRepository = tripRepository;
        this.planRepository = planRepository;
    }

    public List<Trip> findAllTrip() {
       return tripRepository.findAllTrip();
    }

    public void addTrip(Trip trip) {
//        System.out.println("service- addTrip");
        tripRepository.insertTrip(trip);
    }

    public Trip getTripByTripId(int tripId) {
        return tripRepository.findTripByTripId(tripId);
    }

    public void deleteByTripId(int tripId) {
        checkTripId(tripId);

        tripRepository.deleteTrip(tripId);
        planRepository.deleteTripId(tripId);

        System.out.println("삭제되었습니다.");
    }

    public void checkTripId(int tripId) {
        Trip trip = tripRepository.findTripByTripId(tripId);
        if (trip == null) {
            throw new IllegalArgumentException("해당 TRIP을 찾을 수 없습니다.");
        }
    }

    public void updateTrip(Trip trip) {
        try {
            checkTripId(trip.getSequence());
            tripRepository.updateTripByTripId(trip);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
