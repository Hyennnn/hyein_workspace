package example.section02.usrexception;

import example.section02.usrexception.exception.MoneyNegativeException;
import example.section02.usrexception.exception.NotEnongMoneyException;
import example.section02.usrexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        // F2 :
        // alt + enter

        // try-catch
        try {
            // try : 예외 발생 가능성이 있는 코드
            exceptionTest.checkEnougMoney(10000, 50000);
            exceptionTest.checkEnougMoney(50000,10000);


            System.out.println("=======상품 구입 완료=========");
            
            // | : 동일한 레벨의 다른 타입의 예외를 하나의 catch 블록에 처리할 수 없다.
            // 상위 타입의 Exception 과 하위타입 Exception을 함계 서술하면 안된다.
        } catch (PriceNegativeException | MoneyNegativeException | NotEnongMoneyException e) {
            // catch : try 블럭 안에서 예외 발생하고 던져질 경우 catch 블럭에서 잡아
            // 코드 실행
            //throw new RuntimeException(e);
            System.out.println("===== 상품 구입 불가=======");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 예외가 발생하더라도 catch 블럭 실행 후 프로세스의 수행 흐름으로 돌아와 정상 종료
        System.out.println("프로그램을 종료합니다.");
    }
}
