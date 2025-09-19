package example.section01.jupiter;

public class NumberValidation {
    public void checkDividableNumbers(int num1, int num2) {
        if (num2 == 0 ) throw new ArithmeticException("0으로 나눌 수 없습니다.");

    }
}
