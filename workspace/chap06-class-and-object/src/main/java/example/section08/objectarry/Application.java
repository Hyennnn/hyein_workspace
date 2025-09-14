package example.section08.objectarry;

public class Application {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        System.out.println(cars);   // 주소값 ( stack 영역에 생성 된 래퍼런스 변수)
        System.out.println(cars[0]);    // null (heep 영역에 생선 된 래퍼런스 배열이 값이 없으므로 null)
//        cars[0].driveMaxSpeed();    // NullPointerException

        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 300);
        cars[2] = new Car("롤스로이스", 300);
        cars[3] = new Car("부가타메이론", 300);
        cars[4] = new Car("포터", 300);

        // 배열은 반복문을 통해 일괄 처리가 가능
        for(int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        System.out.println();

        // 향상된 for문 사용
        for(Car car : cars) {
            car.driveMaxSpeed();
        }

        // 할당과 동시에 초기화 기능
        Car[] car2 = {
                  new Car("자동차1" , 300)
                , new Car("자동차2", 200)
                , new Car("자동차3", 400)
        };


    }
}
