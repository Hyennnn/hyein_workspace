package example.section03.InterfaceImplements;

public class Application {
    public static void main(String[] args) {
        // 인터페이스 활용

        // 인터페이스는 인스턴스화 불가함
//        InterProduct interProduct = new InterProduct(); // 컴파일 에러남


        // 다형성 (래퍼런스 타입) 사용
        InterProduct interProduct = new Product();

        // 오버라이딩 된 메소드 호출
        interProduct.abstractMethod();
        interProduct.nonSataticMethod();

        // default 메소드 호출
        interProduct.defaultMethod();

        // static 메소드 호출
        InterProduct.staticMethod();


    }
}
