package example.section02.extend.run;

import example.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        // extends 키워드를 사용해 특정 타입만 사용 제한

        // Rabbic 보다 상위 Class 선언 >> 컴파일 에러
//        RabbicFarm<Animal> farm1 = new RabbicFarm<>();
//        RabbicFarm<Mammal> farm2 = new RabbicFarm<>();
//        RabbicFarm<Snake> farm3 = new RabbicFarm<>();

        // RabbicFarm은 Rabbit 이거나 하위 클래스만 선언 가능
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setRabbit(new Rabbit());
        farm4.getRabbit().cry();

        farm5.setRabbit(new Bunny());
        farm5.getRabbit().cry();

        farm6.setRabbit(new DrunkenBunny());
        farm6.getRabbit().cry();

    }
}
