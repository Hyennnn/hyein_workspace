package example.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        // Stream 이해
        // 주로 컬렉션 (배열, 자료구조에서 사용)
        List<String> list = new ArrayList<>(
                Arrays.asList("hello", "stream", "world", "stream")
        );

        // for문
        Iterator<String> iter =  list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if(str.equals("stream")){
                System.out.println("걸러낸 값 :" + str);
            }
        }

        // stream
        // filter는 Predicate
        // Predicate는 true/false
        // steam과 동일한
        // forEach()는 Consumer
        // Consumer는
        list.stream()
            .filter("stream"::equals)
            .forEach(str ->System.out.println("걸러진 값(stream) = " + str));




    }
}
