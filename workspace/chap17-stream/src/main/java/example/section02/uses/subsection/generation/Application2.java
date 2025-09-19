package example.section02.uses.subsection.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        // 기본 자료형 스트림 생성
        IntStream intStream = IntStream.range(5, 10);           // 5, 6, 7, 8, 9
        LongStream longStream = LongStream.rangeClosed(1, 3);   // 1, 2, 3
        Stream<Double> boxedDoubleStream = new Random().doubles(5).boxed();

       // 문자열 IntStream 변환
        IntStream helloworlddcahrs = "hello world".chars();
        // helloworlddcahrs.forEach(i -> System.out.println(i + " "));


    }






}
