package example.section02.uses.subsection.generation;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        // 배열, 컬렉션을 이용해 스트림 생성, 사용

        //배열 스트림 생성
        String[] sarr = {"java", "mariadb", "jdbc"};
        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(str -> System.out.println(str)); // 람다식
       // strStream1.forEach(System.out::println);    // 메서드 참조(Consumer 인터페이스 - println을 연결)

        System.out.println();
        // 배열을 가져오고 싶은 만큼 잘라서 가져오기
        Stream<String> strStream2 = Arrays.stream(sarr, 0,2);
        strStream2.forEach(System.out::println);

        System.out.println();
        // 컬렉션으로 스트림 생성
        List<String> strList = Arrays.asList("html", "css", "javascript");
        Stream<String> strStream3 = strList.stream();
        strStream3.forEach(System.out::println);

        System.out.println();
        // forEach는 컬렉션에도 있기 때문에 스트림화 안해도 사용 가능
        strList.forEach(System.out::println);


        System.out.println();
        // Builder 스트림 생성
        Stream<String> strStream4 = Stream.<String>builder()
                .add("홍길동") // 메소드 체이닝 방식 사용
                .add("유관순")
                .add("윤봉길")
                .build();
        strStream4.forEach(System.out::println);

        // iterate() 수열 형태 스트림 생성
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(System.out::println);



    }
}
