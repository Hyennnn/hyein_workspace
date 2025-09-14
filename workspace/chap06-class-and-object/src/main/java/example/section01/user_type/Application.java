package example.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // 사용자 정의 자료형

        // 변수 선언 및 객체 생성
        // 클래스명 변수명 = new 클래스명() < 객체(instance) 생성 구문
        // 객체를 생성하면 클래스에 정의한 플드(전역 변수)와 메소드 대로 객체가 heep 영역에 생성
        Member member = new Member();   // 래퍼런스 자료형 > 주소값을 갖는다.

        System.out.println(member);// 값: example.section01.user_type.Member@372f7a8d

        // 필드에 접근하는 방법 >> 래퍼런스변수명.필드명
        // heep 영역은 기본적으로 JVM 초기값으로 최기화
        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(member.hobby);

        // 값 넣기(대입)
        member.id = "user02";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"야구", "코딩"};

        // 값 다시 출력
        System.out.println(member.id);
        System.out.println(member.pwd);
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.gender);
        System.out.println(Arrays.toString(member.hobby));


    }
}
