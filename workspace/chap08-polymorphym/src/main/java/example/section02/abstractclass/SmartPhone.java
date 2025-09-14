package example.section02.abstractclass;

public class SmartPhone extends Product {
    // 추상 클래스를 상속 받는 경우
    // 1. 추상 클래스를 상속 받는 추상클래스가 되거나
    // 2. 추상 메소드를 꼭 구현하기 (오버라이딩해서 완성하는 강제성)

    @Override
    public void abstractMethod() {
        System.out.println("스마트폰 에서 abstractMethod 오버라이딩");
    }

    public void printSmartPhone() {
        System.out.println("스마트폰에서 printSmartPhone");
    }

}
