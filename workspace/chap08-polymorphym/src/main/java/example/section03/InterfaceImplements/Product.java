package example.section03.InterfaceImplements;

// 인터페이스는 다중 상속 가능
// 인터페이스를 상속 받을 수 있다.( 이때는 extends 키워드 사용)
// 클래스 extends ( 단일 상속)
// 클래스 implements 인터페이스, 인터페이스 ... (다중 상속)
// 인테페이스 extends 인터페이스, 인터페이스 ... (다중 상속)
import java.io.Serializable;

public class Product implements InterProduct, Serializable {
    // 추상 메서드는 반드시 Override 해줘야한다.
    // defualt는 선택!
    @Override
    public void nonSataticMethod() {
        System.out.println("Product 의 Non nonSataticMethod");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 의 Non abstractMethod");
    }

    // static 매서드
    // 오버라이드 안됨!
//    @Override
//    public static void staticMethod(){
//    }
}
