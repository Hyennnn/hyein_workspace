package example.example01;

public class FruitMain {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();

        // 제네릭스 타입 당향성 원리
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Banana());

    }
}
