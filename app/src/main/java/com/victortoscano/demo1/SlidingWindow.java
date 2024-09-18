package com.victortoscano.demo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {
    int[] array;
    int windowSize;

    public SlidingWindow(int[] inputArray, int size) {
        this.array = inputArray;
        this.windowSize = size;
    }

    public int[] calculateWindow() {
        int[] result = new int[array.length - windowSize + 1];
        int resultPosition = 0;

        Deque<Integer> window = new ArrayDeque<>();

        for(int i=0; i<array.length; i++) {
            if(i >= windowSize && !window.isEmpty() && window.peekFirst().equals(array[i - windowSize])) {
                window.removeFirst();
            }

            while(!window.isEmpty() && array[i] > window.peekLast()) {
                window.removeLast();
            }

            window.addLast(array[i]);

            if(i >= windowSize - 1) {
                result[resultPosition] = window.peekFirst();
                resultPosition++;
            }
        }

        return result;
    }
}
