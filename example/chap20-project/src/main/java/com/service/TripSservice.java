package com.service;

import com.persistence.TripRepository;
import com.domain.Trip;

import java.util.List;
import java.util.stream.Stream;

public class TripSservice {
    private final TripRepository tripRepository;

    public TripSservice(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> findAllTrip() {
       return tripRepository.findAllTrip();
    }

    public void addTrip(Trip trip) {
        System.out.println("service- addTrip");
        tripRepository.insertTrip(trip);
    }

    public Trip getTripByTripId(int tripId) {
        return tripRepository.findTripByTripId(tripId);
    }

    public void deleteByTripId(int tripId) {
        checkTripId(tripId);

        tripRepository.deleteTrip(tripId);
        System.out.println("삭제되었습니다.");
    }

    public void checkTripId(int tripId) {
        Trip trip = tripRepository.findTripByTripId(tripId);
        if (trip == null) {
            throw new IllegalArgumentException("해당 TRIP을 찾을 수 없습니다.");
        }
    }

    public void updateTrip(int tripId, Trip trip) {
        Trip beforeTrip = tripRepository.findTripByTripId(tripId);
        if (beforeTrip == null) {
            throw new IllegalArgumentException("해당 TRIP을 찾을 수 없습니다.");
        }

        tripRepository.updateTripByTripId(tripId, trip);
    }
}
