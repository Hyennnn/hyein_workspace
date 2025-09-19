package example.section07.initblock;

public class Application {
    public static void main(String[] args) {
        System.out.println("main 실행");
        Product product = new Product();
        System.out.println(product.getInfomation());


        Product product2 = new Product("대론폰", 500000, "샤우미");
        System.out.println(product2.getInfomation());
    }
}
