package practice.level03;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("홀수인 양의 정수를 입력하세요");
        int odd = sc.nextInt();

        getOddArr(odd);
    }

    public static void getOddArr(int odd) {

        if (odd % 2 != 0 && 0 < odd ) { // 홀수, 0보다 큰수
            int[] oddArr = new int[odd];
            int middleIndex = (odd / 2) + 1;

            int num = 1;
            for (int i = 0; i < middleIndex; i++) {
                oddArr[i] = num++;
            }

            num = middleIndex - 1;
            for (int i = middleIndex; i < oddArr.length; i++) {
                System.out.println("oddArr[i] = " + oddArr[i]);
                oddArr[i] = num--;
            }

            System.out.println(Arrays.toString(oddArr));
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다");
        }
    }
}
