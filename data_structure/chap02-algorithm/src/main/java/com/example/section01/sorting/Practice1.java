package com.example.section01.sorting;

import java.util.Arrays;

//최적화 된 버블 정렬 구하기
// 버블 정렬은 안전한 두 요소를 비교하여 정렬하므로 일반적으로 0(n^2) 시간 복잡도를 가진다.
// 불필요한 비교를 줄이는 최적화를 통해 0(n) 성능 개선
public class Practice1 {
    static boolean swapped;
    public static void solution(int[] arr) {
        swapped = false;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // swap 하는 부분이 좋지 않음
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 교환이 한번도 발생하지 않으면 정렬 완료
            if (!swapped) {
                break;
            }
            System.out.println((i + 1) + "번째 : " + Arrays.toString(arr));
        }

    }


}
