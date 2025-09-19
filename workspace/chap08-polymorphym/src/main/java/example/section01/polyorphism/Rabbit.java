package example.section01.polyorphism;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("풀 먹기");
    }

    @Override
    public void run() {
        System.out.println("깡총깡총");
    }

    @Override
    public void cry() {
        System.out.println("끼기이기깅ㄱ");
    }

    public void jump() {
        System.out.println("토끼 점프");
    }
}
