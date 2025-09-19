package example.section02.uses.subsection03.termial;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        // 최종 연산자 calculating

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

        System.out.println();

        // Optional(Wrapper Class): null 대신 사용할 수 있는 안전 장치
        //
        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        OptionalInt min = IntStream.rangeClosed(1, 10).min();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println(max.getAsInt()); // getAsInt() 메소드를 사용해 가져오는 것이 안전함
        System.out.println(min.getAsInt());

        System.out.println();

        // 중간 연산 이후 최종 연산
        int oddSum = IntStream.rangeClosed(1,100)
                .filter(i -> i % 2 == 1)
                .sum();
        System.out.println("oddSum = " + oddSum);




    }
}
