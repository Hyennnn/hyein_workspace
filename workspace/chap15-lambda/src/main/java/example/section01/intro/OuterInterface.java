package example.section01.intro;

// 인터페이스를 묶음으로 관리할 수 있는 클래스

public class OuterInterface {

    @FunctionalInterface
    interface Sum {
        int sumTowNumber(int a, int b);
    }

    @FunctionalInterface
    interface Minus {
        int minusTowNumber(int a, int b);
    }

    @FunctionalInterface
    interface Multiple {
        int multipleTowNumber(int a, int b);
    }

    @FunctionalInterface
    interface Divide {
        int divideTowNumber(int a, int b);
    }


}
