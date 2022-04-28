package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax21To15Then21() {
        int left = 21;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 21;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To14Then14() {
        int first = 12;
        int second = 14;
        int result = Max.max(first, second);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To8Then8() {
        int first = 8;
        int second = 8;
        int result = Max.max(first, second);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To8To10Then10() {
        int first = 10;
        int second = 8;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To12To10TO33Then33() {
        int first = 2;
        int second = 12;
        int third = 10;
        int four = 33;
        int result = Max.max(first, second, third, four);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}
