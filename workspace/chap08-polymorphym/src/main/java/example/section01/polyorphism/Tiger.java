package example.section01.polyorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("고기먹기");
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }

    @Override
    public void run() {
        System.out.println("우다다다다");
    }

    public void bite() {
        System.out.println("호랑이!!!");
    }
}
