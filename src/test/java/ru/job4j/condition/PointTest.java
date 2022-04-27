package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        a.distance(b);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        a.distance(b);
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when110to113then3() {
        double expected = 3;
        Point x = new Point(1, 1, 0);
        Point y = new Point(1, 1, 3);
        x.distance3d(y);
        Assert.assertEquals(expected, x.distance3d(y), 0.01);
    }

    @Test
    public void when113to111then2() {
        double expected = 2;
        Point x = new Point(1, 1, 3);
        Point y = new Point(1, 1, 1);
        x.distance3d(y);
        Assert.assertEquals(expected, x.distance3d(y), 0.01);
    }
}
