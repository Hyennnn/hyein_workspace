package example.section02.extend;

public class MethodFarm {
    // 메소드 매개변수로 전달 받는 타입 객체

    // 제약 없음
    public <T> void animalType(T t1, T t2) {}

    // Reptile 타입이거나, Reptile 하위타입만
    public <T extends Reptile> void reptileType(T t) {}

    // Mammal 타입이거나, Mammal 하위타입만
    public <T extends Mammal> void mammalType(T t) {}

}
