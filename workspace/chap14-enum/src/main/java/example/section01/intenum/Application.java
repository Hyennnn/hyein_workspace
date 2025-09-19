package example.section01.intenum;

import example.section02.enumtype.FoodsEnum;

public class Application {
    public static void main(String[] args) {
        // 정수 열거 패턴의 단점

        // 1. 타입 안정성 보장 방법이 없어 디버깅 하기 어려움
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;
        System.out.println("Food: " + food);
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;

        // 모두 상수 0이라는 값을 갖기 때문에 구분 불가능
        if (food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW) {
            System.out.println("식사-");
        }

        // 2. 정수형 상수는 문자열로 출력 어려움
        System.out.println(Foods.DRINK_RAW_CUTTLEFISH_SHAKE);

        // 3. 정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지 않음


        // 4. 정수 열거 패턴으로 상수가 선언된 경우 컴파일 에러 발생해 새로 만들어줘야함




    }

}
