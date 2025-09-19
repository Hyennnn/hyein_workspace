package example.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        // 생성자 메소드 참조

        Function<String, Member> function = Member::new;    // 생성자 메소드
        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
    }
}
