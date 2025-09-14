package example.section02.dimensional;

import java.util.Arrays;

public class Applicaion1 {
    public static void main(String[] args) {

        // 2차원 배열의 초기화
        int[][] arr1; // 권장
        int[] arr2[];
        int arr3[][];

        // 배열 생성
 //       arr1 = new int[][]; // 크기를 지정하지 않아서 생성 불가
 //       arr1 = new int[][4]; // 주소를 묶어서 관리, 크기를 지정하지 않아서 생성 불가
        arr1 = new int[3][4];

        // 주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당(heep)
        arr1[0] = new int[5];
        arr1[1] = new int[5];
        arr1[2] = new int[5];

        // 한번에 이차원 배열을 선언, 할당
        arr1 = new int[3][5];

        for(int i=0;i<3;i++) {  // 행의 길이 (3) > 레퍼런스 배열
            for(int j=0;j<5;j++) { // 열의 길이 (5)
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


    }
}
