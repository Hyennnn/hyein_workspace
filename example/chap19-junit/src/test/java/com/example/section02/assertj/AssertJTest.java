package com.example.section02.assertj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertJTest {

    @Test
    @DisplayName("문자열 테스트")
    void testStringValidation() {
        // given
        String excepted = "hello world";

        // when
        String actual = new String(excepted);

        // then
        Assertions.asssertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("haha")
                .startWith("h")
                .startWith("h")
                .endWith("d")
                .isEqualTo(excepted);

    }

    void testIntegerValidation() {
        double pi = Math.PI;
        Double actual = pi;

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }






}
