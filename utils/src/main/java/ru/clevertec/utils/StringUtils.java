package ru.clevertec.utils;

import java.math.BigDecimal;

public final class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)){
            return new BigDecimal(str).compareTo(BigDecimal.ZERO) > 0;
        }

        return  false;
    }
}