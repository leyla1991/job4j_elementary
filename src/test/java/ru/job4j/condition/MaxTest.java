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
}
