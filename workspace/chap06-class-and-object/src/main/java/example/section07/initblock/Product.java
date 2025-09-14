package example.section07.initblock;

public class Product {
    // 1. JVM 기본 값 > 2. 명시적 초기화 값 (잘 할일이 없음)
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼성";

    // 3. 초기화 블럭
    // 인스턴스 초기화 블럭
    // 인스턴스 초기화는 변수 선언, 동적 초기화 등도 가능
    // 인스턴스 초기화 블럭에서 클래스 변수를 초기화 할 수 있지만 (권장 x)
    // static 초기화 블럭에서는 인스턴스 변수 초기화는 할 수 없음
    // 권장 : 따로 쓰기~
    {
        name = "사이언";
        price = 8000000;

        brand = "사과";
        System.out.println("인스턴스 초기화 블러 동장 확인");

    }

    // static 초기화
    static {
        brand = "엘지";

        System.out.println("static 초기화 블럭 동장 확인");
    }

    // 4. 생성자 초기화
    public Product() {
        System.out.println("기본 생성자 동작 확인");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매게변수 생성자 동작 확인");

    }

    public String getInfomation() {
        return this.name + " "  + this.price + " " +  Product.brand;
    }

}
