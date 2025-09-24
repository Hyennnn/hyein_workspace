package com.example.section01.sorting;

import java.util.Arrays;

// 버블 정렬
// 안전한 두 요소를 비교해 교환하는 방식으로 크기 순서대로 정렬하는 정렬
// 배열 전체를 여러번 반복해 가장 큰 요소가 끝으로 이동
// 시간 복잡도 : 0(n^2) (최악)
//           : 0(n) (거의 정렬 된 경우)
// 교환 연산이 많아 다른 0(n^2) 정렬보다 느릴 수 있음
public class A_BubbleSort {
    // Q : n개의 정수가 주어졌을 때 버블 정렬 알고리즘을 사용해 오름차순으로 정렬하는 프로그램

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 한번 돌았을 때 맨 끝에 있는 값 정해주는 역활
            // 그래서 length -1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 비교 횟수가 줄어들어 length - i -1 해준다.
                if (arr[j] > arr[j + 1]) {
                    // j 인덱스 값이 j -1 인덱스 값보다 크다면 오름차순 기중에 맞지 않으므로 swqp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println((i + 1) + "번째 : " + Arrays.toString(arr));
        }
    }
}
