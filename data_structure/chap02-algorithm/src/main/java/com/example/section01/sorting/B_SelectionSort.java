package com.example.section01.sorting;

import java.util.Arrays;

// 선택 정렬
// 배열에 최소 값을 찾아 맨 앞과 교환하는 방식의 정렬
// 배열을 여러 번 반본, 선택한 요소와 나머지 요소들을 비교 정렬
// 시간 복작도 : 0(n^2) ( swap화는 과정이 적음)
// 정령이 어느 정도 되어도 정렬 시간은 똑같음
public class B_SelectionSort {

    public static void solution(int[] arr) {
        for (int i = 0; i <= arr.length -1; i++) {
            // 루프 한번 돌 때 가장 작은 값이 존재하는 index
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                // i 다은 순번 이랑 비교 해해야 하므로 i + 1
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // 선택 된 데이터(최소 값)가 들어가야 할 인덱스로 교환
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println((i + 1) + "번째 : " + Arrays.toString(arr));
        }
    }
}
