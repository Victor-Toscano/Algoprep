package com.victortoscano.demo1;

import org.junit.Assert;
import org.junit.Test;

public class FibTest {

    @Test
    public void when0_then0() {
        int input = 0;
        int expected = 0;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when1_then1() {
        int input = 1;
        int expected = 1;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when2_then1() {
        int input = 2;
        int expected = 1;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when3_then2() {
        int input = 3;
        int expected = 2;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when4_then3() {
        int input = 4;
        int expected = 3;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when5_then5() {
        int input = 5;
        int expected = 5;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when6_then8() {
        int input = 6;
        int expected = 8;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test
    public void when10_then55() {
        int input = 10;
        int expected = 55;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test(timeout=100)
    public void when19_then4181() {
        int input = 19;
        int expected = 4181;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test(timeout=100)
    public void when30_then832040() {
        int input = 30;
        int expected = 832040;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }

    @Test(timeout=1000)
    public void when44_then701408733() {
        int input = 44;
        int expected = 701408733;
        int actualResult = Fib.fibonacci(input);
        Assert.assertEquals(expected, actualResult);
    }
}