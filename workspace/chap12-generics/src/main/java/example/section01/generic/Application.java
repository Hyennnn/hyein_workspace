package example.section01.generic;

public class Application {
    public static void main(String[] args) {
        // 제네릭 프로그래밍
        // 데이터 형식에 의존 없이 여러 다른 데이터 타입 기술 >> 재사용

        // 장점
        // 1. 컴파일 시 타입 검사 >> 타입 안정성 확보
        // 2. 변환 값 타입 변환 코드 생략


        // 타입을 Integer로 생성
        // 래퍼런스 변수 선언으로 인해 타입 추론이 가능해 인스턴스 생성 시 <>안에 타입 명시하지 않아도 됨
        //
        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setValue(10);
//        gt1.setValue("hello");  // 컴파일 에러
        Integer num = gt1.getValue();

        // 타입을 String으로 생성
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("hello");
//        gt2.setValue(10); // 컴파일 에러
        String str = gt2.getValue();

        // 제네릭 없이 생성
        // 문제점
        // 1. setValue시 아무 타입이나 들어감
        // 2. 반환 값을 받을 때 다운 캐스팅 필요
        GenericTest gt3 = new GenericTest();
        gt3.setValue(10);
        gt3.setValue("hello");
        String str2 = (String)gt3.getValue(); // get3 타입은 Object, 다운 캐스팅 필요
    }
}
