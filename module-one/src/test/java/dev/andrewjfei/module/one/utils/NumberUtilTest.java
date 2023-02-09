package dev.andrewjfei.module.one.utils;

import org.junit.jupiter.api.Test;

import static dev.andrewjfei.module.one.utils.NumberUtil.add;
import static dev.andrewjfei.module.one.utils.NumberUtil.isZero;
import static dev.andrewjfei.module.one.utils.NumberUtil.max;
import static dev.andrewjfei.module.one.utils.NumberUtil.min;
import static dev.andrewjfei.module.one.utils.NumberUtil.subtract;
import static dev.andrewjfei.module.one.utils.NumberUtil.zeroChecker;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilTest {

    @Test
    public void testAdd_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 5;

        int result = add(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testSubtract_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = -1;

        int result = subtract(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMax_valueAMax_returnsCorrectResult() {
        int a = 6;
        int b = 1;
        int expected = 6;

        int result = max(a, b);

        assertEquals(expected, result);
    }


    @Test
    public void testMax_valueBMax_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 3;

        int result = max(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMin_valueAMin_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 2;

        int result = min(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMin_valueBMin_returnsCorrectResult() {
        int a = 9;
        int b = 6;
        int expected = 6;

        int result = min(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testZeroChecker_lessThanZero_returnsCorrectResult() {
        int a = -9;
        int expected = -1;

        int result = zeroChecker(a);

        assertEquals(expected, result);
    }

    @Test
    public void testZeroChecker_isZero_returnsCorrectResult() {
        int a = 0;
        int expected = 0;

        int result = zeroChecker(a);

        assertEquals(expected, result);
    }

    @Test
    public void testZeroChecker_greaterThanZero_returnsCorrectResult() {
        int a = 5;
        int expected = 1;

        int result = zeroChecker(a);

        assertEquals(expected, result);
    }


    @Test
    public void testIsZero_isZero_returnsCorrectResult() {
        int a = 0;
        boolean expected = true;

        boolean result = isZero(a);

        assertEquals(expected, result);
    }

}
