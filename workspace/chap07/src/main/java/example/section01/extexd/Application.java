package example.section01.extexd;

public class Application {
    public static void main(String[] args) {
        // Car 인스턴스 테스트
        Car car = new Car();    // 부모 클래스
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println();

        // IS-A 관계가 성립 상속
        // 소방차 (FireCar is a Car)
        FireCar fireCar = new FireCar();  // 부모클래스 생성자 호출 > 자식클래스 생성자 호출
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();   // 자식 클래스 기능 (부모는 접근 못함)


        // 레이싱카(RacingCar is a Car)
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();










    }
}
