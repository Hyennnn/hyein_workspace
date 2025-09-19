package example.section02.extend.run;

import example.section02.extend.*;

public class Application3 {
    public static void main(String[] args) {
        // wildcard 테스트

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 매개타입 제약 없음
        // 토끼 타입을 보유할 경우 전달 가능
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        // 바니 이거나 바니 후손
//        wildCardFarm.extendType(new RabbitFarm<>(new Rabbit())); // 컴파일 에러
        wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));

        // 바니 이거나 바니 부모
        wildCardFarm.superType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        // 타입 추론해서 가져옴 > 상위 타입으로 생각함
        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny()));
        // 명시적으로 적어줬을 때 후상 타입이므로 컴파일 에러남
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
