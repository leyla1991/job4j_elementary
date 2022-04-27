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
        int left = 12;
        int right = 14;
        int result = Max.max(left, right);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To8To10Then10() {
        int left = 10;
        int right = 8;
        int third = 10;
        int result = Max.max(left, right, third);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To12To10TO33Then33() {
        int left = 2;
        int right = 12;
        int third = 10;
        int four = 33;
        int result = Max.max(left, right, third, four);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}
