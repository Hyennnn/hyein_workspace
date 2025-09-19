package example.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        // 인터페이스에 정의 된 추상 메소드를 활용

        // 1. 인터페이스를 구현한 클래스를 정의 기능을 완성한 뒤 사용
        Calculator c1 = new CalculatorImpl();
        System.out.println("c1.sumTowNumber(10 ,20) = " + c1.sumTowNumber(10, 20));

        // 2. 재사용 안 할 경우 익명 클래스 사용
        Calculator cs = new Calculator() {
            @Override
            public int sumTowNumber(int a, int b) {
                return a + b;
            }
        };

        System.out.println("cs.sumTowNumber(10, 40) = " + cs.sumTowNumber(10, 40));

        // 3. 람다식 사용
        // 람다식 규칙 : 내부에 하나의 추상 메소드가 선언 된 인터페이스 >> 함수형 인터페이스
        Calculator cs3 = (int a , int b) -> a + b;
        System.out.println("cs3.sumTowNumber(10,60) = " + cs3.sumTowNumber(10, 60));


    }
}
