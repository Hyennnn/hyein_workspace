package example.section01.intro;

// 함수형 인터페이스 : 내부에 하나의 추상메소드가 선언 된 인터페이스, 람다식 타켓
// 람다식용 인터페이스는 무조건 1개의 인터페이스만 있어야 한다.
@FunctionalInterface
public interface Calculator {

    int sumTowNumber(int a, int b);

//    int avgTowNumber(int a, int b); // 안됨

}
