package example.section02.usrexception;

import example.section02.usrexception.exception.MoneyNegativeException;
import example.section02.usrexception.exception.NegativeException;
import example.section02.usrexception.exception.NotEnongMoneyException;
import example.section02.usrexception.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {
        // 사용자 정의 예외 클래스 사용할 수 있다.
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            // 정상 수행
            exceptionTest.checkEnougMoney(2000, 1000);

            // 예외처리에 걸리는 경우
            // 상품가격이 음수
//            exceptionTest.checkEnougMoney(-2000, 1000);

            // 가진돈이 음수
            exceptionTest.checkEnougMoney(2000, -1000);

            // 가진 금액보다 큰 금액
            exceptionTest.checkEnougMoney(2000, 4000);

            // catch 블럭 작성밥법
            // 1. 상위 타입의 Exception으로 통합적으로 처리할 수 있음
            // 2. 서술 순서는 하위타입 => 상위타입으로 기술하기
            

//        } catch (PriceNegativeException e) {
//            System.out.println(e.getMessage());
//        } catch (MoneyNegativeException e ) {
//            System.out.println(e.getMessage());
//        } catch (NotEnongMoneyException e) {
//            System.out.println(e.getMessage());
//        }
        } catch(Exception e) {
                System.out.println(e.getMessage());
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
