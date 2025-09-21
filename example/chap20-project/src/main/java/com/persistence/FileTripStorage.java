package com.persistence;

import com.domain.Trip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTripStorage implements TripStorage {
    private static final String FILE_PATH = "src/main/java/com/db/tripDB.dat";
    @Override
    public void saveTrip(List<Trip> tripList) {
        System.out.println("FileTripStorage- saveTrip");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(tripList);
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류 발생", e);
        }
    }

    @Override
    public List<Trip> loadTripList() {

        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Trip>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("MY TRIP LOADING~!");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("파일 로딩 중 오류 발생", e);
        }
    }
}
