package example.section02.uses.subsection03.termial;

import java.util.*;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        // collect
        List<Member> memberList = Arrays.asList(
                new Member("test01", "홍길동")
                , new Member("test02", "유관순")
                , new Member("test03", "신사임당")
        );
        
        // 이름 관리
        List<String> memberNames = memberList.stream()
//                .map(member -> member.getMemberName())
                .map(Member::getMemberName)
                .collect(Collectors.toList());

        System.out.println("memberNames = " + memberNames);
                
        String str = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining(","));
        System.out.println("str = " + str);

        Map<Integer, Long> countBynameLength =
                memberList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        m -> m.getMemberName().length(),
                                        Collectors.counting()
                                )
                        );
        System.out.println("countBynameLength = " + countBynameLength);
    }
}
