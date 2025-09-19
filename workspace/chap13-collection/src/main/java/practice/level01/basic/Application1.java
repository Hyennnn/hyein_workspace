package practice.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while(true){
            System.out.print("학생 성적 : ");
            int score = input.nextInt();
            list.add(score);

            System.out.println("추가 입력하려면 Y : N");
            String c =  input.next();
            if ("n".equals(c) || "N".equals(c)) {
                break;
            }
        }

        System.out.println("학생 인원 : " + list.size());

        int sum = 0;
        for(int i : list){
            sum += i;
        }

        System.out.println("평균 점수 : " + (double)sum/list.size());

    }
}
