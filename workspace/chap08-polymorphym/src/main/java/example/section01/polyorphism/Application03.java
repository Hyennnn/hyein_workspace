package example.section01.polyorphism;

public class Application03 {
    public static void main(String[] args) {
        // 매개변수 활용해 다형성 적용

        Application03 application03 = new Application03();
        application03.feed(new Rabbit());
        application03.feed(new Tiger());

    }

    // 다형성을 적용하지 않는다면 동물이 늘어날 경우 메소드를 추가해줘야함
    // Animal이라는 상위 타입이 있을 경우 동물이 늘어나도 코드 수정이 되지 않음
    public void feed(Animal animal) {   // 다형성
        animal.eat();
    }

}
