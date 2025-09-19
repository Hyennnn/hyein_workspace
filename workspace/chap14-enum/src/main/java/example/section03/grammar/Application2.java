package example.section03.grammar;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {
        // EnumSet 활용 enum Set 자료구조

        // EnumSet을 사용시 class를 넘겨줘야함
        EnumSet<FoodsEnum> foodEnum = EnumSet.allOf(FoodsEnum.class);

        for(FoodsEnum food : foodEnum) {
            System.out.println("food = " + food);
        }
    }
}
