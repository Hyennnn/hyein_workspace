package example.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        // 스트림의 중계 연산 중 sorted 이해 (정렬)

        List<Integer> iList = IntStream.of(5, 10, 99, 7, 1, 50)
                .boxed()
                .sorted((a, b) -> b - a) // 오름차순 a-b , 내림차순 b-a , 기본 정렬은 오름차순
                .toList();

        System.out.println(iList);
    }
}
