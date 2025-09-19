package example.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        // 중간 연산자 filter
        // filter : 특정 데이터만 걸러내는 메소드로 매개변수 Predicate 타입 선언
        // Predicate : 매개변수 boolean 반환 형태
        IntStream intStreim = IntStream.range(0, 10);
        intStreim.filter(i -> i % 2 == 0) // 중간 연산자
                 .forEach(System.out::println); // 최종 연산자






    }
}
