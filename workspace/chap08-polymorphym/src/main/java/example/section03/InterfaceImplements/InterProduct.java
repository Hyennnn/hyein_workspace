package example.section03.InterfaceImplements;

public interface InterProduct {
    // 인터페이스  필드
    // public static final 은 생략 가능( 상수 필드만 작성 가능하므로 묵시적으로 생략가능)

    public static final int MAX_NUM = 100;
    int MIN_NUM = 0;


    // 인터페이스 생성자
    // 인터페이스는 생성자를 가질 수 없음
    // public InterProduct() {}     >> 컴파일 에러


    // 인터페이스 메소드
    // 추상 메서드만 작성이 가능하다.
    // public abstract 는 묵시적으로 생략 가능함
    public abstract void nonSataticMethod();
    void abstractMethod();

    // static 메소드 작성 가능 (jdk 1.8 버전 추가)
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스 의 staticMethod");
    }

    // default 키워드 사용으로 non static 메소드 작성 가능 (jdk 1.8 버전 추가)
    // default 메소드는 완성 되어있어 오버라이딩 강제화 안됨

    // 구현을 안하고 공통으로 사용하는 메소드를 defualt로 작성하고
    // 구현해야하는 애들은 추상 클래스로 작성한다.
    // 필요하면 overring 해도 되고 안해도 됨
    public default void defaultMethod() {
        System.out.println("InterProduct 인터페이스 의 defaultMethod");
    }

}
