package example.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        // 중간 연산자 map
        // 중간 연산자는 초종 연산 수행 전 까지 여러번 수행 가능하다.
        // Operator(연산자)
        // map : 스트림에 담긴 데이터를 람다식을 통해 가공 후 새로운 스트림에 전달
        IntStream intStreim = IntStream.range(0, 10);
        intStreim.filter(i -> i % 2 == 0) // 중간 연산자 (짝수만 필터링 하기)
                 .map(i -> i * 10)  // 중간 연산자 (짝수를 * 10으로 만들기)
                .forEach(System.out::println); // 최종 연산자















    }
}
