package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int studentNum = 3;    // 총 학생 수
        StudentDTO[] studentsArr = new StudentDTO[studentNum];

        int idx = 0;
        while (true) {

            if (idx == studentNum) {
                break;
            }

            // 학생정보 입력받기
            scanStuent(studentsArr, studentNum, idx);

            System.out.println("계속 추가할 겁니까?(y/n)");
            String answer = input.next();

            if (answer.equals("y")) {
                idx++;
            } else {
                break;
            }
        }

        for(StudentDTO std : studentsArr) {
            System.out.println(std.getInformation());
        }
    }

    public static void scanStuent(StudentDTO[] studentsArr , int studentNum, int idx) {
        Scanner input = new Scanner(System.in);

        int in_grade = 0;
        int in_classroom = 0;
        String in_name;
        int in_kor = 0;
        int in_eng = 0;
        int in_math = 0;

        System.out.print("학년: ");
        in_grade = input.nextInt();

        System.out.print("반: ");
        in_classroom = input.nextInt();

        System.out.print("이름: ");
        in_name = input.next();

        System.out.print("국어점수: ");
        in_kor = input.nextInt();

        System.out.print("영어점수: ");
        in_eng = input.nextInt();

        System.out.print("수학점수: ");
        in_math = input.nextInt();

        studentsArr[idx] = new StudentDTO(in_grade, in_classroom, in_name, in_kor, in_eng, in_math);

    }
}
