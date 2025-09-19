package com.example.section01.jupiter;

import example.section01.jupiter.Calculator;
import example.section01.jupiter.NumberValidation;
import example.section01.jupiter.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JupiterAssertionTests {

     //JUnit5에서 제공하는 Assertions 메소드

     @Test
     void testAssertEquals() {
         // given
         int firstNum = 10;
         int secondNum = 20;
         int excepted = 29;

         // when
         Calculator calc = new Calculator();
         int result = calc.plus(firstNum, secondNum);

         // then
         // assertEquals() : 예상 값과 실제 값의 일치 여부 동일성 판단
//         Assertions.assertEquals(excepted, result);
         Assertions.assertEquals(excepted, result, 1);

     }
    @Test
    @DisplayName("Null 여부 테스트")
    void testAssertNull() {
         String str = null;
         Assertions.assertNotNull(str);

         str= "Hello Junit";
         Assertions.assertNotNull(str);

    }

    @Test
    @DisplayName("동시에 여러 값 검증")
    void testAssertAll() {
         String firstName ="길동";
         String lastName = "홍";

         Person person = new Person(firstName, lastName);

         Assertions.assertAll(
                "그룹화 된 테스트의 이름(테스트 실패 시 보여주는 부분"
                , () -> Assertions.assertEquals(firstName, person.getFirstName())
                , () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }

    @Test
    @DisplayName("exception 발생 테스트")
    void testAssertThrow() {
         int num1 = 10;
         int num2 = 0;

        NumberValidation validator = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                IllegalAccessException.class,
                () -> validator.checkDividableNumbers(num1, num2)
        );
    }
}
