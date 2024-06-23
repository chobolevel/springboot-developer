package com.chobolevel.springbootdeveloper;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {

    @AfterAll
    static void afterAll() {
        System.out.println("Bye!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @Test
    public void junitTest1() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);

        assertThat(name3).isNotEqualTo(name1);
        assertThat(name3).isNotEqualTo(name2);
    }

    @Test
    public void junitTest2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        assertThat(number1).isPositive();
        assertThat(number2).isZero();
        assertThat(number3).isNegative();

        assertThat(number1).isGreaterThan(number2);
        assertThat(number3).isLessThan(number2);
    }

    @Test
    public void junitTest3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitTest4() {
        System.out.println("This is second test");
    }

}
