package example.section02.abstractclass;

public class Application {
    // 추상 클래스, 추상 메소드 사용

    public static void main(String[] args) {

//      추상 클래스라서 인스턴스로 만들 수 없어 에러남
//      Product product = new Product()
//      상속 받은 클래스에서 추상 메소드를 완성해야 자식 클래스가 인스턴스 하는 것은 가능
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof SmartPhone);

        // 추상 클래스를 래퍼러스 타입으로 사용 가능
        Product product = new SmartPhone();
        product.abstractMethod();   // product와 정적 바인딩 되어 있지만 런타임 이후에 SmartPhone과 동적 바인딩 됨

        // 일반적인 메소드 호출
        // Product 추상 클래스의 일반 메소드도 호출이 가능
        //
        product.nonSataticMethod();
        Product.staticMethod();



    }






}
