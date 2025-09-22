package com.persistence;

import com.domain.Trip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TripRepository {
    private final TripStorage tripStorage;
    private final List<Trip> tripList;

    public TripRepository(TripStorage tripStorage) {
        this.tripStorage = tripStorage;
        this.tripList = tripStorage.loadTripList();
       // this.tripList = new ArrayList<>();
    }

    public List<Trip> findAllTrip() {
        return new ArrayList<>(tripList);
    }

    public void insertTrip(Trip trip) {
        System.out.println("TripRepository-insertTrip");
//        System.out.println(trip.getCity());
        tripList.add(trip);
        tripStorage.saveTrip(tripList);

    }

    public Trip findTripByTripId(int tripId) {
        System.out.println("TripRepository-findTripByTripId");
        return tripList.stream()
                .filter(trip -> trip.getSequence() == tripId)
                .findFirst()
                .orElse(null);
    }

    public void deleteTrip(int choiceNum) {
        System.out.println("TripRepository-deleteTrip");
        tripList.removeIf(trip -> trip.getSequence() == choiceNum);
        tripStorage.saveTrip(tripList);
    }


    public void updateTripByTripId(int tripId, Trip trip) {
        System.out.println("TripRepository-updateTripByTripId");
        // 데이터 수정해주기


    }
}
