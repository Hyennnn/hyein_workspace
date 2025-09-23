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

        for(int i = 0; i < tripList.size(); i++) {
           Trip target = tripList.get(i);
            if(target.getSequence() == tripId) {
                target.setCountry(trip.getCountry());
                target.setCity(trip.getCity());
                target.setStartDt(trip.getStartDt());
                target.setEndDt(trip.getEndDt());
                tripStorage.saveTrip(tripList);
                break;
            }
        }

    }
}
