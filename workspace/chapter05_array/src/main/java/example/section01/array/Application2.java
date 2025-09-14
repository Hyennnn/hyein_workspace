package example.section01.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 배열 선언 > stack 영억에 배열의 주소를 보환할 래서런스 변수 공간을 만드는 것
        int[] iarr;
        double[] darr;

        // new 연산자는 heep 영역에 공간을 할당하고 주소값을 반환
        // 주소값은

        iarr = new int[10];
        darr = new double[10];

        // stack에 주소가 저장
        // heep 영역은 주소 값으로 접근하는 방식
        System.out.println("darr = " + darr);
        System.out.println("iarr = " + iarr);

        // hashCode() : 객체의 주소 값을 10진수로 반환해줌
        System.out.println("darr.hashCode() = " + darr.hashCode());
        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        
        // length() : 배열의 길이를 알 수 있음 ( 필드/ 속성)
        System.out.println("darr.length = " + darr.length);
        System.out.println("iarr.length = " + iarr.length);
        
        // 한 번 지정한 배열의 길이는 변경할 수 없음
        // 새로운 배열을 생성하고 그 주소 값을 래퍼런스 변수에 담는다.
        iarr = null; // 배열 객체를 가리키리 않음( 레퍼런스 주소 없음)

        // null 이라는 특수 값을 참조하고 있을 경우 참조 연산자(.)를 사용하면 런타임 에러 발생
        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        System.out.println("iarr.length = " + iarr.length);

    }

}
