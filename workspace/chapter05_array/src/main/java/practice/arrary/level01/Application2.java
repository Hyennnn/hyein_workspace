package practice.arrary.level01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] fruitArr = {"딸기", "바나나", "복숭아", "키위", "사과"};

        System.out.println("0부터 4까지의 정수를 입력하세요");
        int fruit = input.nextInt();

        if(fruit < fruitArr.length) {
            for (String str : fruitArr) {
                if (str.equals(fruitArr[fruit])) {
                    System.out.println(str);
                }
            }
        }  else {
            System.out.println("준비된 과일이 없습니다.");
        }


    }
}
