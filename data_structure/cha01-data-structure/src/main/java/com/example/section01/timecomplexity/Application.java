package com.example.section01.timecomplexity;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] arr = {3,1,2,15,4,9,10, 7};
        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr,7));
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(fibonacci(10));
    }

    // 상수 시간 0(1)
    private static boolean getFirst(int[] arr) {
        return arr[0] == arr[1];
    }

    // 로그 시간 0(log n)
    private static int binarySearch(int[] arr, int target) {
        // 초기 세팅 (배열을 오름차순으로 정렬
        // 내부적으로 nlogn 만큼 시간이 걸림
        Arrays.sort(arr);
        System.out.println("정렬 된 Arrays: " + Arrays.toString(arr));
        // 배열의 처음과 끝을 지정하는 인덱스 담는 변수(포인터)
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(target == arr[mid]) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1; // 방향을 바꿔줌
            } else {
                right = mid - 1; // 1 일경우
            }
        }

        return -1; // 내가 찾는 값이 없음
    }

    // 선형 시간 0(n)
    private static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }

    // 지수시간 0(2^n)
    private static int fibonacci(int n) {
        // 기본 사례 : n이 0 또는 1 인 경우
        if (n <= 1) {
            return n;
        }

        // 재귀 상태 : 피보나치 수열의 정의에 따라 계산
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
