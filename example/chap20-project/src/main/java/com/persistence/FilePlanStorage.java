package com.persistence;

import com.domain.Plan;
import com.domain.Trip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePlanStorage implements PlanStorage {
    private static final String FILE_PATH = "src/main/java/com/db/planDB.dat";
    @Override
    public void savePlan(List<Plan> planList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(planList);
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류 발생", e);
        }
    }

    @Override
    public List<Plan> loadPlanList() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Plan>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("MY plan LOADING~!");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("파일 로딩 중 오류 발생", e);
        }
    }
}
