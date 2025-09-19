package example.example;

public class IAddMain {
    public static void main(String[] args) {
        // 제네릭을 통해 람다 함수의 타입을 결정
        // 매개변수 x 와 y  그리고 반환형 타입이 int 형으로 결정
        IAdd<Integer> ex = (x,y) -> x + y;

        int result = ex.add(1,2);
        System.out.println(result);
    }
}
