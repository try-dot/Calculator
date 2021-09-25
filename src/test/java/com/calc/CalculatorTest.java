package com.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void getSum() {
        assertAll(
                () -> assertEquals(5, calculator.getSum(2, 3)),
                () -> assertEquals(8.77469, calculator.getSum(3.2873456, 5.4873457)),
                () -> assertEquals(10.567, calculator.getSum(4, 6.567)),
                () -> assertEquals(7, calculator.getSum(0, 7)),
                () -> assertEquals(0, calculator.getSum(0, 0)),
                () -> assertEquals(-5, calculator.getSum(-2, -3)),
                () -> assertEquals(-9.38923, calculator.getSum(-4.1, -5.28923)),
                () -> assertEquals(-13.8, calculator.getSum(-6, -7.8)),
                () -> assertEquals(-8.1, calculator.getSum(0, -8.1)),
                () -> assertEquals(-9.3456, calculator.getSum(3, -12.3456))
        );
    }

    @Test
    void getSubtraction() {
        assertAll(
                () -> assertEquals(-2, calculator.getSubtraction(10, 12)),
                () -> assertEquals(8.46797, calculator.getSubtraction(20.8679654, 12.4)),
                () -> assertEquals(6.1, calculator.getSubtraction(8.1, 2)),
                () -> assertEquals(11, calculator.getSubtraction(11, 0)),
                () -> assertEquals(0, calculator.getSubtraction(0, 0)),
                () -> assertEquals(1, calculator.getSubtraction(-4, -5)),
                () -> assertEquals(-3.85, calculator.getSubtraction(-6.85, -3.0)),
                () -> assertEquals(-1.09, calculator.getSubtraction(-4, -2.91)),
                () -> assertEquals(7.9, calculator.getSubtraction(0, -7.9)),
                () -> assertEquals(15.29876, calculator.getSubtraction(11, -4.29876))
        );
    }

    @Test
    void getMultiplication() {
        assertAll(
                () -> assertEquals(10, calculator.getMultiplication(2, 5)),
                () -> assertEquals(127.7128, calculator.getMultiplication(10.52, 12.14)),
                () -> assertEquals(19.56931, calculator.getMultiplication(9.7846561, 2)),
                () -> assertEquals(0, calculator.getMultiplication(7, 0)),
                () -> assertEquals(0, calculator.getMultiplication(0, 0)),
                () -> assertEquals(24, calculator.getMultiplication(-2, -12)),
                () -> assertEquals(31.10514, calculator.getMultiplication(-4.98754, -6.23657)),
                () -> assertEquals(32.62473, calculator.getMultiplication(-9, -3.62497)),
                () -> assertEquals(0, calculator.getMultiplication(0, -15.985767)),
                () -> assertEquals(-65.26762, calculator.getMultiplication(12, -5.438968))
        );
    }

    @Test
    void getDivide() {
        assertAll(
                () -> assertEquals(4.5, calculator.getDivide(9, 2)),
                () -> assertEquals(1.36947, calculator.getDivide(12.529, 9.148764)),
                () -> assertEquals(4.89233, calculator.getDivide(9.7846561, 2)),
                () -> assertEquals(Double.POSITIVE_INFINITY, calculator.getDivide(456, 0)),
                () -> assertEquals(Double.NaN, calculator.getDivide(0, 0)),
                () -> assertEquals(Double.NEGATIVE_INFINITY, calculator.getDivide(-89, 0)),
                () -> assertEquals(0.07317, calculator.getDivide(-27, -369)),
                () -> assertEquals(0.61335, calculator.getDivide(-9.98754, -16.28357)),
                () -> assertEquals(5.5668, calculator.getDivide(-43, -7.72437)),
                () -> assertEquals(0, calculator.getDivide(0, -45.9865767)),
                () -> assertEquals(-2.57939, calculator.getDivide(634, -245.794357))
        );
    }
}