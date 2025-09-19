package example.section06.finalkeyword;

public class FinalFieldTest {
    // final
    // non static field에 final 키워드 사용하는 경우
    // final은 선언 후에 값 변경 불가 하므로 값 설정을 꼭 해줘야 함
    // private final int NON_STATIC_NUM;   // 값을 선언하지 않아서 컴파일 에러

    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_STRING;


    // final을 생성자를 만들어 초기화 해 줄 수 있음
    public FinalFieldTest(String nonStaticString) {
        this.NON_STATIC_STRING = nonStaticString;
    }

    // satatic field에 final 키워드 사용하느 경우
    // static이 붙을 경우엔 생성자로 초기화 해줄수 없음

    private static final int STATIC_NUM = 2;
    private static final String STATIC_STRING;

    // 대신 static{} (static 블럭)으로 초기화를 해준다.
    // 블럭을 쓰는 이유 : 복잡한 연사, 외부 입력/조건에 따라 초기화를 해줌
    // ex) 환경 변수 읽기, 실행 시 계산
    static {
        STATIC_STRING = "홍길동";
    }

    // final과 static 키워드 나열 순서는 상관없지만
    // 통상적으로 static final로 작성함


}

// final 키워드를 사용할 수 있는 위치
// 1. 지역 변수 : 초기화 이후 값 변경 불가
// 2. 매게변수 : 호출 시 전달한 값 변경 불가
// 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후 값 변경 불가
// 4. 클래스 변수 (static) : 프로그램 시작 이후 값 변경 불가
// 5. non-static 매소드(상속과 관련) : 메소드 재작성(오버라이딩) 불가
// 6. static 메소드 : 메소드 재작성 (오버라이드) qmfrl
// 7. 클래스 : 상속 불가
