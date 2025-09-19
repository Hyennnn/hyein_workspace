package example.section01.extexd;

// Car 클래스의 모든 멤버(필드, 메소드)를 상속받을 수 있음
// 단, 생성자는 상속 받지 못한다.
public class FireCar extends Car{


    public  FireCar() {
        // 모든 생성자 첫절에 super() 컴파일러가 자동 생성 (명시적or묵시적 사용 가능)
        super(); // 생략가능
        System.out.println("FireCar 클래스 기본 생성자 호출");
    }

    // 부모의 기능을 재작성 (오버라이딩)
    // @Override : 어노테이션을 작성하면 오버라이딩 성립 요건을 체크해주는 역활
    // 부모 클래스의 메소드를 제정비한 건지 체크!
    // 다를 경우 컴파일 에러로 알려줌
    // 버그 예방, 가독성, 유지보수에 좋음
    @Override
    public void soundHorn() {
        // isRunning 메소드를 접근할 수 없음!
        // 부모클래스의 private 메소드는 접글할 수 없음
        // 접근제한자 protected 사용하면 자식 클래스 사용할 수 있음

        if(isRunning()) {
            System.out.println("빠이아아아아아!빠이아아아아아앙!");
        } else {
            System.out.println("초방차가 앞으로 갈 수 없습니다. 비키세요.");
        }
    }

    // 자식 클래스만의 기능
    public void sprayWater() {
        System.out.println("물을 뿌립니당.>>>>>>>>>>>>>>>>>>>>>>");
    }



}
