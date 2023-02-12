package ru.clevertec.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {
    @Test
    void isPositiveNumber() {
        assertFalse(Utils.isAllPositiveNumbers("-1", "-2", "-3"));
        assertFalse(Utils.isAllPositiveNumbers("-1", "-2"));
        assertFalse(Utils.isAllPositiveNumbers("-1"));
        assertFalse(Utils.isAllPositiveNumbers("0"));
        assertTrue(Utils.isAllPositiveNumbers("1"));
        assertTrue(Utils.isAllPositiveNumbers("1", "2"));
        assertTrue(Utils.isAllPositiveNumbers("1", "2", "3"));

        assertFalse(Utils.isAllPositiveNumbers("-1", "0", "1", "2", "3"));

    }
}

