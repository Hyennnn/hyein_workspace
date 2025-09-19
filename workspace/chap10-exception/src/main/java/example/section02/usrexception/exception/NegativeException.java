package example.section02.usrexception.exception;
// 사용자 정의 Exception
// Exception을 상속 받아야함
public class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message); //
    }
}
