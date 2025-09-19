package practice.arrary.level04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 길이가 4인 정수 배열 > 인덱스 0-9까지 중복x

        // 숫자 4자리 입력 받기
        // 스트라이크, 볼 흰트 주기
        // 숫자, 자리가 맞으면 스트라이크
        // 숫자가 맞으면 볼
        // 기회는 10번 , 10번 모두 소진 시 멘트
        // 4자리를 입력하지 않은 경우 입력해주세요. 차감 x


        int[] intArr = addRandArr();    // 난수 배열
        int[] inputArr = new int[4];
        int chnceNum = 10;
        int b = 0;      // 볼
        int h = 0;      // 홈런
        int game = 10;  // 게임
        while (game < 10) {
            System.out.println("4자리 숫자를 입력하세요");
            String num = input.nextLine();

            if (num.length() == 4) {
                chnceNum--;


                System.out.println(Arrays.toString(intArr));
                // input 배열에 숫자 넣기
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] = num.charAt(i) - '0';
                }


                // 값 비교
                for (int i = 0; i < intArr.length; i++) {
                    for (int j = 0; j < intArr.length; j++) {
                        if (inputArr[i] == intArr[j]) {
                            //                        System.out.println("같아!!!!");
                            //                        System.out.println("i = " + i);
                            //                        System.out.println("j = " + j);

                            if (i == j) { // 인덱스가 같을 경우
                                System.out.println("홈런!!!!");
                                h++;
                            } else {
                                System.out.println("볼~~");
                                b++;
                            }
                        }

                        if (h == 4) {
                            System.out.println("다 맞음");
                        }
                    }
                }

            } else{
                System.out.println("4자리의 정수를 입력해야 합니다.");
            }

        }


    }

    // 랜덤 배열 만들기
    public static int[] addRandArr () {
        Random rand = new Random();
        int[] intArr = new int[4];

        for (int i = 0; i < intArr.length; i++) {
            int num;
            boolean isDuplicate;

            do {
                num = (int) (Math.random() * 10) + 1;
                isDuplicate = false;

                // 중복 여부 체크
                for (int j = 0; j< i; j++) {
                    if (intArr[j] == num) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            intArr[i] = num;
        }

        return intArr;
    }
}
