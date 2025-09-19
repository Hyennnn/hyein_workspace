package example.section02.uses.subsection03.termial;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        // 최종 연산자 reduce (
        // 만약 Null 값을 체크할 경우엔 OptionalInt를 사용하고 (reduceParam은 reduce 에서 identity 값 받지 않고 있음)
        OptionalInt reduceParam =
                IntStream.rangeClosed(1, 10)
//                         .reduce((a,b) -> {
//                             // 이전 연산에서 반환 된 값이 다음 연산의 첫 번째 인자로 전달
//                             System.out.println("a: " + a + ",b: " + b);
//                             return Integer.sum(a, b);
//                         });
                            .reduce(Integer::sum);
        System.out.println("reduceParam = " + reduceParam);


        // 확실하게 int를 받을 수 있기 때문에 int로 받으면 된다.(reduceParam2은 reduce 에서 identity 값 받고 있음)

        int reduceParam2 = IntStream.rangeClosed(1, 10)
                .reduce(100, Integer::sum); // identity: 시작값
        System.out.println("reduceParam2 = " + reduceParam2);




    }
}
