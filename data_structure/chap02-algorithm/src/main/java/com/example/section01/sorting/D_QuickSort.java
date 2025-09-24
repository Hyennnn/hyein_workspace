package com.example.section01.sorting;

import java.util.Arrays;

// 퀵 정렬
// 기준값을 선정해 해당 값을 기준으로 작은 값과 큰 값으로 분할하는 방식
// 분할 후 각각의 부분 배열을 재귀적으로 정렬
// 평균적으로 0(nlog) (일반적으로 성능이 좋음)
// 피벗이 최악인 경우 (0n^2)
public class D_QuickSort {
    public static void solution(int[] arr) {
        // n개의 정수가 주어질 때, 퀵 정렬 알고리즘 사용해 오름차순 정렬
        System.out.println("원본 배열: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("정렬 된 배열: " + Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {
        // 종료 조건
        if(low >= high) {
            return;
        }

        // 기준 index
        int boundary = partition(arr, low, high);
        quickSort(arr, low, boundary-1); // 재귀(logn)
        quickSort(arr, boundary, high);

    }

    // private 값 기준 [low ... high]
    // 왼쪽 포인터가 멈춘 상태
    private static int partition(int[] arr, int low, int high) {
        int i =low;
        int j = high;
        int pivot = arr[low + (high - low) / 2]; // low 와 high의 중앙 값

        System.out.println("피벗:" + pivot + "기준, 인덱스 범위 : " + low + "~" + high);
        System.out.println("분할 전 배열: " + Arrays.toString(arr));

        while (i <= j) { // 주어진 input의 길이 만큼만 돌아감 (선형적)
            while (arr[i] < pivot) i++; // 작을 경우 증가
            while (arr[j] > pivot) j--; // 큰 경우 감소

            if(i <= j) { // i가 j 숫자보다 클겅우 교체해준다.
                swap(arr, i , j);
                i++;
                j--;
            }
        }
        System.out.println("분할 후 배열 = " + Arrays.toString(arr) );
        System.out.println(" 변환할 경계 인덱스 (오른쪽 구분 시작:" + i);
        System.out.println("-----------------------------------------");
        return i;


    }

    private static void swap(int[] arr, int a, int b) {
        if (a == b) return;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
