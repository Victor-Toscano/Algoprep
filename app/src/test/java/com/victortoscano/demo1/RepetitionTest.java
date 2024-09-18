package com.victortoscano.demo1;

import org.junit.Assert;
import org.junit.Test;

public class RepetitionTest {

    @Test(timeout = 3600000)
    public void whenRepeating() {
        Repetition rep = new Repetition();
        int result = rep.repeat();
        Assert.assertEquals(1, result);
    }
}