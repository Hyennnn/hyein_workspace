package example.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        // 생성자 개념 정리
        // 1. 인스턴스 생성 시점에 수행할 명령어가 있는 경우
        // User user1 = new User(); >> User()가 생성자
        // 2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 갓으로 필드 초기화 할경우
        // User user2 = new User("aaa" , "bbb");
        // 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하고 싶지 않은 경우
        // 제약을 걸고 싶을 때

        User user1 = new User();    // null 값으로 생성됨
        System.out.println(user1.getInformation());

        User user2 = new User("aaa" , "bbb");
        System.out.println();

        User user3 = new User("aaa" , "bbb", "홍길동", new Date("2025-02-01"));

    }
}
