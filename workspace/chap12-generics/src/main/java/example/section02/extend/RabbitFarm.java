package example.section02.extend;

// 와일드 카드
// Rabbit을 extends 하는 아이들만 가져올 수 있음
public class RabbitFarm<T extends Rabbit> {
    private T rabbit;

    public RabbitFarm() {}

    public RabbitFarm(T rabbit) {
        this.rabbit = rabbit;
    }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}
