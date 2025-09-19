package example.section02.abstractclass;
// 추상 클래스
// 상속 관계에서 부모 클래스로 활용을 하기 위해 사용을 한다.


// 추상클래스 : class 앞에 abstract 선언
public abstract class Product {
    // 추상 클래스  필드 : 일반, static 필드 가질 수 있음
    private int nonStaticFiled;
    private static int staticFiled;;


    // 추상 클래스 생성자 : 가질 수 있음
    // 직접적으로 인스턴스를 생성할 수는 없음
    public Product() {
    }

    // 추상 클래스 메소드 :
    public void nonSataticMethod() {
        System.out.println("Product의 nonSataticMethod");
    }

    public static void staticMethod() {
        System.out.println("Product의 staticMethod");
    }

    // 추상 메소드(미완성 메소드)
    // 추상 메소드를 가지려면 추상 클래스이어만 함다.
    // 추상 클래스에서 꼭 추상 메소드를 가지고 있을 필요 없음 (추상 메소드 0개 이상)
    public abstract void abstractMethod();
}
