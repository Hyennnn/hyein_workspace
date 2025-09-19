package example.section02.uses.subsection02.intermediate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        // flatMap; 중접된 리스트를 하나로 묶을 때 사용

        List<List<String>> list = Arrays.asList(
            Arrays.asList("java", "spring", "spring boot")
            , Arrays.asList("java", "spring", "spring boot")
        );

        System.out.println(list);
        System.out.println();
        List<String> flatList = list.stream()// 리스트를 스트림화
                .flatMap(Collection::stream)    // flatMap() 으로 리스트를 하나로 모으기
                .collect(Collectors.toList()); // collect로 list화 시켜준다.( 값 모으기)

        System.out.println(flatList);
        System.out.println();


        // collect(Collectors.toList()) vs toList
        List<String> sentenes = Arrays.asList(
                "java world"
                , "spring api"
                , "spring boot"
        );

        System.out.println(sentenes);

        List<String> sentenes2 = sentenes
                .stream()
                .flatMap(sentene -> Arrays.stream(sentene.split(" ")))
                .toList(); // 불변, 읽기 전용
        System.out.println(sentenes2);

        flatList.add("추가함!!!!!!");
        System.out.println(flatList);
//        sentenes2.add("java world!!!!!"); >> 런타임 에러남
    }
}
