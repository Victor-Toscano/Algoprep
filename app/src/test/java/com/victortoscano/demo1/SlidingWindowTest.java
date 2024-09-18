package com.victortoscano.demo1;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SlidingWindowTest {
    @Test
    public void Array_1_WindowSize_1_shouldReturn_1() {
        int[] inputArray = new int[]{1};
        int inputWindowSize = 1;
        int[] expectedOutput = new int[]{1};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [1] windowSize 1 should return [1]", expectedOutput, actualOutput);
    }

    @Test
    public void Array_3_6_8_WindowSize_2_shouldReturn_6_8() {
        int[] inputArray = new int[]{3,6,8};
        int inputWindowSize = 2;
        int[] expectedOutput = new int[]{6,8};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [3, 6, 8] windowSize 2 should return [6, 8]", expectedOutput, actualOutput);
    }

    @Test
    public void Array8Positions_WindowSize_3_shouldReturn_3_3_5_5_6_7() {
        int[] inputArray = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int inputWindowSize = 3;
        int[] expectedOutput = new int[]{3, 3, 5, 5, 6, 7};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [1, 3 , -1, -3, 5, 3, 6, 7] windowSize 3 should return [3, 3, 5, 5, 6, 7]", expectedOutput, actualOutput);
    }

    @Test
    public void Array_1_negative5_WindowSize_1_shouldReturn_1_negative5() {
        int[] inputArray = new int[]{1, -5};
        int inputWindowSize = 1;
        int[] expectedOutput = new int[]{1, -5};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [1, -5] windowSize 3 should return [1, -5]", expectedOutput, actualOutput);
    }

    @Test
    public void Array_test_2() {
        int[] inputArray = new int[]{1,3,1,2,0,5};
        int inputWindowSize = 3;
        int[] expectedOutput = new int[]{3,3,2,5};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [1,3,1,2,0,5] windowSize 3 should return [3,3,2,5]", expectedOutput, actualOutput);
    }

    @Test
    public void Array_test_3() {
        int[] inputArray = new int[]{-7,-8,7,5,7,1,6,0};
        int inputWindowSize = 4;
        int[] expectedOutput = new int[]{7,7,7,7,7};

        SlidingWindow slidingWindow = new SlidingWindow(inputArray, inputWindowSize);
        int[] actualOutput = slidingWindow.calculateWindow();
        Assert.assertArrayEquals("Array [-7,-8,7,5,7,1,6,0] windowSize 4 should return [7,7,7,7,7]", expectedOutput, actualOutput);
    }

}
