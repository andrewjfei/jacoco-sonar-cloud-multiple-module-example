package dev.andrewjfei.module.one.utils;

import org.junit.jupiter.api.Test;

import static dev.andrewjfei.module.one.utils.NumberUtil.add;
import static dev.andrewjfei.module.one.utils.NumberUtil.max;
import static dev.andrewjfei.module.one.utils.NumberUtil.min;
import static dev.andrewjfei.module.one.utils.NumberUtil.subtract;
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
    public void testSubstract_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = -1;

        int result = subtract(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMax_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 3;

        int result = max(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testMin_returnsCorrectResult() {
        int a = 2;
        int b = 3;
        int expected = 2;

        int result = min(a, b);

        assertEquals(expected, result);
    }

}
