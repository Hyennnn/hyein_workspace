package example.section01.extexd;

public class RacingCar extends Car {

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    // 레이싱 카에는 필요한 기능 아님
    // 상속 구조로 불 필요한 기능이 추가 될 수 있음
    @Override
    public void soundHorn() {

    }
}
