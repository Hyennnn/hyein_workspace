package example.section01.polyorphism;

public class Application {
    public static void main(String[] args) {
        // rabbit, tiger 은 rabbit, tiger 이기도 하지만 Animal 이기도 하다.

        // 부모타입의 레퍼런스 변수를 통해 자식타입의 인스턴스 참조 가능
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        // 자식 타입의 래퍼런스 변수는 부모타입의 인스턴스 참조 불가능
//      Rabbit a = new Animal();
//      Tiger b = new Animal();

        // 동적 바인딩
        // Animal 메소드와 연결되어 있음 (정적 바인딩)
        // 런타임 시 Rabbit, Tiger (실제 객체) 가진 오버바인딩 된 메소드로 변경 후 동작 (동적 바인딩)
        rabbit.cry();  // 타고 들어가면 animal로 들어감
        tiger.cry();

        // 현재 래퍼런스 변수 타입은 rabbit은 Animal 타입이므로 rabbit이 가진 고유의 기능을 사용 못함
        // Rabbit 타입으로 형 변환 후에 사용이 가능함
        // rabbit.jump();
        ((Rabbit)rabbit).jump();

        // 래퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교
        // instanceof 연산자

        System.out.println("tiger instanceof Rabbit = " + (tiger instanceof Rabbit)); //false
        System.out.println("tiger instanceof Tiger = " + (tiger instanceof Tiger)); // true

        System.out.println();
        System.out.println("rabbit instanceof rabbit = " + (rabbit instanceof Rabbit)); // true
        System.out.println("rabbit instanceof Tiger = " + (rabbit instanceof Tiger));   //false

        // rabbit, tiger 클래스 의 부모 클래스 Animal, Object의 타입을 가지고 있으로 true
        System.out.println();
        System.out.println("tiger instanceof Animal = " + (tiger instanceof Animal));   // true
        System.out.println("rabbit instanceof Animal = " + (rabbit instanceof Animal)); // true

        System.out.println();
        System.out.println("tiger instanceof Object = " + (tiger instanceof Object));   // true
        System.out.println("rabbit instanceof Object = " + (rabbit instanceof Object)); // true

        // instance of 를 통해 타입이 맞을 경우에만 형변환 해주기
        if (rabbit instanceof Rabbit) {
            ((Rabbit)rabbit).jump();
        }

        // up casting , down casting
        // up casting : 상위 타입으로 변환 (묵시적, 자동 형변환)
        // down casting : 하위 타입으로 변환 (명시적, 강제 형변환)

        Animal animal = (Animal) new Rabbit(); // Rabbit -> Animal : up casting (자동)
        Rabbit rabbi = (Rabbit) animal; // Animal -> Rabbit : down casting (강제)



    }
}
