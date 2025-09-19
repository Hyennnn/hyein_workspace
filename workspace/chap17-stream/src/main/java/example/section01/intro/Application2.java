package example.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        // 스트림의 병렬 처리
        List<String> list = new ArrayList<>(
                Arrays.asList("java", "mariadb", "html", "css", "mybatis")
        );

        System.out.println("=== for");

        System.out.println("=== stream");
        list.stream().forEach(Application2::print);



    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
