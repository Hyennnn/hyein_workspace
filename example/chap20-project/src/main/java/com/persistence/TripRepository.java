package com.persistence;

import com.domain.Trip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TripRepository {
    private final TripStorage tripStorage;
    private final List<Trip> tripList;

    public TripRepository(TripStorage tripStorage) {
        this.tripStorage = tripStorage;
        this.tripList = tripStorage.loadTripList();
    }

    public List<Trip> findAllTrip() {
        return new ArrayList<>(tripList);
    }

    public void insertTrip(Trip trip) {
//        System.out.println("TripRepository-insertTrip");
        trip.setSequence(lastSequenceNumber() +1 );
        tripList.add(trip);
        tripStorage.saveTrip(tripList);

    }

    public Integer lastSequenceNumber() {
        return tripList.isEmpty() ? 0 : tripList.get(tripList.size()-1).getSequence();
    }
    public Trip findTripByTripId(int tripId) {
//        System.out.println("TripRepository-findTripByTripId");
        return tripList.stream()
                .filter(trip -> trip.getSequence() == tripId)
                .findFirst()
                .orElse(null);
    }

    public void deleteTrip(int choiceNum) {
//        System.out.println("TripRepository-deleteTrip");
        tripList.removeIf(trip -> trip.getSequence() == choiceNum);
        tripStorage.saveTrip(tripList);
    }


    public void updateTripByTripId(Trip trip) {
//        System.out.println("TripRepository-updateTripByTripId");

        for(int i = 0; i < tripList.size(); i++) {
//            System.out.println("trip = " + trip.getSequence());
            if( tripList.get(i).getSequence() == trip.getSequence()) {
                tripList.set(i, trip);
                tripStorage.saveTrip(tripList);
                break;
            }
        }
    }
}
