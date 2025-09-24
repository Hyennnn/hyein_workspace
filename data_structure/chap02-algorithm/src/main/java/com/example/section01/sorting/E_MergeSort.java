package com.example.section01.sorting;

import java.util.Arrays;

// 병합 정렬
// 분할 정복 방식으로 배열을 반씩 나누어 정렬 후 병합하는 방식
// 정렬 된 두 개의 배열을 합치는 과정에서 안정 정렬의 특성을 유지한다.
// 시간 복작도 : 0(nlog) (항상)
// 단, 추가 메모리 공간이 필요하므로 메모리 제한적 환경에서는 비효율적
public class E_MergeSort {

    // n 개의 정수가 주어졌을 때 병합 정렬 알고리즘을 사용해 오름차순으로 정렬
    public static void solution(int[] arr) {
        System.out.println("원본 배열: " + Arrays.toString(arr));
        int[] temp = new int[arr.length]; // 추가 메모리 공간
        mergeSort(arr, temp, 0, arr.length -1);
        System.out.println("정렬 된 배열: "  + Arrays.toString(temp));

    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2; // 안전하게 반으로 나는 로직

        // 쪼개기 과정
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        // 최적화 과정

        // 병합하는 과정
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        System.out.println("병합 전 배열 : " + Arrays.toString(arr));
        System.out.println("left: " + left + ", mid: " + mid + ", right: " + right);

        // 병합 구간의 배열을 암시 배열에 복사
        System.arraycopy(arr, left, arr, left + 1, right - left + 1);

        int leftIdx = left;     // 왼쪽 부분 배열의 시작점
        int rightIdx = mid + 1; // 오른족 부분 배열의 시작점
        int currentIdx = left;  // arr에 넣을 위치
        // 두 배열을 비교하면서 병합
        while (leftIdx <- mid && rightIdx <= right) {
            if (temp[leftIdx] <= temp[rightIdx]) { // 왼쪽이 작을 경우
                arr[currentIdx++] = temp[leftIdx++]; // 왼쪽을 넣어주기
            } else {
                arr[currentIdx++] = temp[rightIdx++]; // 오른쪽이 작을 경우 오른쪽을 넣어주기
            }
        }

        // 왼쪽 배열에 남은 요소 복사
        // 오른쪽 배열은 요소가 남아있더라도 해당 위치의 길이 arr과 동일하므로 따로 처리 필요 없음
        while (leftIdx <= mid) {
            arr[currentIdx++] = temp[leftIdx++];
        }

        System.out.println("병합 전 완료 : " + Arrays.toString(arr));
        System.out.println("--------------------------------------------------------");
    }

}
