package practice.level04;

import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] intArr = new int[6];
        int randNum = rand.nextInt(48) +1;

        // 첫 index에는 값 넣기
        intArr[0] = randNum;
        // 두번쩨 index 부터 값 체크 후 배열에 값 넣어주기
//        for (int i = 1; i < intArr.length; i++) {
//            if (intArr[i - 1] == randNum) {
//                intArr[i] = randNum;
//            } else {
//                intArr[i] = randNum;
//            }
//        }

        // 1. 배열의 index를 순회하기
        // 2. 랜덤 숫자 하나 고르기
        // 3. 랜덤 숫자가 





    }
}
