package example.section02.extend;

public class WildCardFarm {
    // 변수 선언된 RabbitFarm 객체를 생성할 때 보다 유연하게 WildCard 활용

    public void anyType(RabbitFarm<?> farm) {
        farm.getRabbit().cry();
    }

    public void extendType(RabbitFarm<? extends Bunny> farm) {

        farm.getRabbit().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }
}
