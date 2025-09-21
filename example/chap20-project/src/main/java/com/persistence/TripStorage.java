package com.persistence;

import com.domain.Trip;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface TripStorage {
    void saveTrip(List<Trip> tripList);
    List<Trip> loadTripList();
}
