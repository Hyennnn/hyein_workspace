package practice.level02;

import java.util.Arrays;
import java.util.Scanner;

public class Applicaion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민등록번호를 입력하세요");
        String ssn = sc.nextLine();

        print(ssn);
    }

    public static void print(String ssn) {
        String[] ssnArr = ssn.split("-");
        System.out.println(ssnArr[0] + "-" + ssnArr[1].charAt(0) + "******");
    }
}
