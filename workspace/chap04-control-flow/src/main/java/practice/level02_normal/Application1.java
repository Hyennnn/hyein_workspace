package practice.level02_normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // level01
//        IsOddEven ioe = new IsOddEven();
//
//        System.out.print("1~10 사이의 정수 한개를 입력해 주세요.");
//        int num = input.nextInt();
//        ioe.isOddEven(num);


        // level03
//        CalculateNums calc = new CalculateNums();
//
//        System.out.println("첫 번째 정수: ");
//        int num1 = input.nextInt();
//
//        System.out.println("두 번째 정수: ");
//        int num2 = input.nextInt();
//
//        System.out.println("연산 기호를 입력하세요:");
//        String operation = input.next();
//
//        calc.calculateNums(num1, num2, operation);


        // level04
//        Subject subject = new Subject();
//
//        System.out.println("국어 점수를 입력하세요.");
//        int korean = input.nextInt();
//        System.out.println("수학 점수를 입력하세요.");
//        int math = input.nextInt();
//        System.out.println("영어 점수를 입력하세요.");
//        int english = input.nextInt();
//
//        subject.PassOrFail(korean, math,english);


        // 반복문
        StrArr strArr = new StrArr();

        System.out.println("문자열을 입력해 주세요.");
        String str = input.nextLine();
        strArr.StrArr(str);

    }
}
