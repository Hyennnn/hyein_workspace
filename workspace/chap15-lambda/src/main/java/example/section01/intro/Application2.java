package example.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        // 람다식 활용을 위한 내부 인터페이스 관리 기법

        OuterInterface.Sum sum = (x, y) -> x + y;
        OuterInterface.Minus minus = (x, y) -> x - y;
        OuterInterface.Multiple multiply = (x, y) -> x * y;
        OuterInterface.Divide divide = (x, y) -> x / y;

        System.out.println(sum.sumTowNumber(3, 4));
        System.out.println(minus.minusTowNumber(3, 4));
        System.out.println(multiply.multipleTowNumber(3, 4));
        System.out.println(divide.divideTowNumber(3, 4));


    }
}
