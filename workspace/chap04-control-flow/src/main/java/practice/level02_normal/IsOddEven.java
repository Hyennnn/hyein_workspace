package practice.level02_normal;

public class IsOddEven {

    public void isOddEven(int number) {

        if ( 0 < number &&  number<= 10 ) {
            if(number % 2 == 0){
                System.out.println("짝수다.");
            } else {
                System.out.println("홀수다.");
            }
        } else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }
}
