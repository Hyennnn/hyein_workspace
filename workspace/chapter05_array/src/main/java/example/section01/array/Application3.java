package example.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        // 배열 초기화 되는 자료형 별 기본 값을 이해할 수 있다.



        // 지역 변수 (stack 할당)는 초기화 되어야만 사용가능
        int num;

        // heep 영역에 할당 될 경우 자료형에 따른 초기값이 설정 되어 할당 됨
        // 정수 : 0, 실수 : 0.0 , 논리 : false, 문자 : \u0000, 참조: null
        int[] iarr = new int[10];
        for (int i : iarr) {
            System.out.println(i + " ");
        }

        String[] sarr =  new String[5];
        for (String s : sarr) {
            System.out.println(s + " ");
        }

        // 값을 설정하면서 초기화
        int[] iarr1 = new int[]{1, 2, 3, 4, 5};
        int[] iarr2 = {1, 2, 3, 4, 5};

        for(int j : iarr1) {
            System.out.println(j + " ");
        }

        Arrays.stream(iarr2).forEach(System.out::println);
    }
}
