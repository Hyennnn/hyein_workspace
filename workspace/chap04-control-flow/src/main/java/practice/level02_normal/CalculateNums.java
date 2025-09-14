package practice.level02_normal;

public class CalculateNums {

    public void calculateNums(int num1 , int num2, String operation) {

       int resultNum = 0;
       switch (operation) {
           case "+": resultNum = num1 + num2;
           break;
           case "-": resultNum = num1 - num2;
           break;
           case "*": resultNum = num1 * num2;
           break;
           case "/": resultNum = num1 / num2;
           break;
           case "%": resultNum = num1 % num2;
           break;
           default:
               System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
       }

        System.out.println(num1 + operation + num2 + " = " + resultNum);


    }
}
