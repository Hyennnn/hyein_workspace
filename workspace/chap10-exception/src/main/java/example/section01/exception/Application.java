package example.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {
        ExceptionTest exceptionTest = new ExceptionTest();
        // 컴파일 에러가 난다.
        // 호출하는 부분에서 반드시 예외 처리를 해줘야 한다.
        // 예외처리 하면서 :  메인 메소드에 throws Exception 추가가 되가 함
        // 여기서 throws로 다시 책임을 메소드 호출부로 위임함,
        // main 메소드에 throws를 사용하게 되면 프로세스는 비정상 종료됨
        exceptionTest.checkEnougMoney(10000, 50000);
        exceptionTest.checkEnougMoney(50000, 10000);
    }
}
