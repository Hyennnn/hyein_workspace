package example.section01.exception;

public class ExceptionTest {
    public void checkEnougMoney(int price, int money) throws Exception {
        System.out.println("보유하신 금액은 " + money + "원 입니다.");
        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            // 강제로 예외를 발생
            // 예외가 발생되면 예외 처리가 필요
            // 첫 번째 예외 처리 방법 : 메소드 시그니처에 throws 구문을 작성
            // 예외에 대한 책임을 메소드 호출부로 위임하여 예외 처리를 강제화 한다.
            throw new Exception();  // throw : 예외를 발생시킨다.
        }

        System.out.println("즐거운 쇼핑 하세요.");
    }
}
