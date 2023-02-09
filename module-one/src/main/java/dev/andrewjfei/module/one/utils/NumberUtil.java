package dev.andrewjfei.module.one.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberUtil {

    private static Logger logger = LoggerFactory.getLogger(NumberUtil.class);

    private static final String debugString = "Inputs [ a = {}, b = {} ]";

    public static int add(int a, int b) {
        logger.debug(debugString, a, b);
        return a + b;
    }

    public static int subtract(int a, int b) {
        logger.debug(debugString, a, b);
        return a - b;
    }

    public static int max(int a, int b) {
        logger.debug(debugString, a, b);
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        logger.debug(debugString, a, b);
        return a < b ? a : b;
    }

    public static int zeroChecker(int a) {
        logger.debug("Inputs [ a = {} ]", a);

        int value = 0;

        if (a < 0) {
            return -1;
        } else if (a > 0) {
            return 1;
        }

        return value;
    }

    public static boolean isZero(int a) {
        logger.debug("Inputs [ a = {} ]", a);

        return a == 0 ? true : false;
    }

}
