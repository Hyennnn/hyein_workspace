package example.section01.polyorphism;

public class Application4 {
    public static void main(String[] args) {
        // 리턴 타입을 활용하여 다형성 적용

        Application4 a = new Application4();
        a.getRandomAnimal().cry();

    }

    // 다형성을 적용하지 않으면 각 동물을 반환하는 메소드를 별도로 작성하기
    public Animal getRandomAnimal() {
        int random = (int) (Math.random() * 2);
        return random == 0 ? new Rabbit() : new Tiger();
    }
}
