package com.victortoscano.demo1;

import java.util.*;

public class SlidingWindow_res {
    private int[] array;
    private int windowSize;

    public SlidingWindow_res(int[] array, int windowSize) {
        this.array = array;
        this.windowSize = windowSize;
    }
}

    // Same method using arrays
/*    public int[] calculateWindow() {
        int[] resultList = new int[array.length - windowSize + 1];
        Deque<Integer> windowDoubleQueue = new ArrayDeque<>();

        int maxValue = -2147483648;
        for (int i = 0; i < array.length; i++) {
            windowDoubleQueue.addLast(array[i]);


            if (array[i] > maxValue) {
                maxValue = array[i];
            }

            if (i >= windowSize - 1) {
                if (windowDoubleQueue.stream().maxValue)
                    //resultList.add(windowDoubleQueue.stream().max(Integer::compare).get());
                    resultList.add(windowDoubleQueue.stream().max(Integer::compare).get());
                windowDoubleQueue.removeFirst();
            }
        }

        return resultList;
    }
}

    /*public List<Integer> calculateWindow() {
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i <= array.size() - windowSize; i ++) {
            int maxValue = -2147483648;
            // -2147483648
            for(int j = i; j < (i + windowSize); j++) {
                if(array.get(j) > maxValue)
                    maxValue = array.get(j);
            }
            resultList.add(maxValue);
        }

        return resultList;
    }*/

    // Same method using Deque
    /*public List<Integer> calculateWindow() {
        List<Integer> resultList = new ArrayList<>();
        Deque<Integer> windowDoubleQueue = new ArrayDeque<>();

        int maxValue = -2147483648;
        for(int i = 0; i < array.size(); i ++) {
            windowDoubleQueue.addLast(array.get(i));
            if(i >= windowSize - 1) {
                if(windowDoubleQueue.stream(). maxValue)
                //resultList.add(windowDoubleQueue.stream().max(Integer::compare).get());
                resultList.add(windowDoubleQueue.stream().max(Integer::compare).get());
                windowDoubleQueue.removeFirst();
            }
        }

        return resultList;
    }*/