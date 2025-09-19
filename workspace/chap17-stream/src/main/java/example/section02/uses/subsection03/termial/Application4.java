package example.section02.uses.subsection03.termial;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        // match(반환값: boolean)
        List<String> strList = Arrays.asList("java", "spring", "springBoot");

        boolean anyMatch = strList.stream().anyMatch(i -> i.contains("java"));
        boolean allMatch = strList.stream().allMatch(i -> i.length() > 5);
        boolean noneMatch = strList.stream().noneMatch(i -> i.contains("a"));



    }
}
