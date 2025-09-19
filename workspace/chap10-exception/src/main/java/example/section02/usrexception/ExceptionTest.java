package example.section02.usrexception;

import example.section02.usrexception.exception.MoneyNegativeException;
import example.section02.usrexception.exception.NotEnongMoneyException;
import example.section02.usrexception.exception.PriceNegativeException;

public class ExceptionTest {
    // 사용자 정의 Exception 사용을 할 수 있음
    public void checkEnougMoney(int price, int money)
    //        throws PriceNegativeException, MoneyNegativeException, PriceNegativeException
    throws Exception
    {


            // 음수가 들어올 경우 chek
            if (price < 0) {
                throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
            }
            if (money < 0) {
                throw new MoneyNegativeException("보유 금액은 음수일 수 없습니다.");
            }
            if (money < price) {
                throw new NotEnongMoneyException("보유 금액보다 상품 가격이 더 비쌉니다.");
            }



    }
}
