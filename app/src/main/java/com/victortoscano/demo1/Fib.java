package com.victortoscano.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Fib {
    public static int fibonacci(int n) {
        //List<Integer> values = new ArrayList<Integer>(Collections.nCopies(n + 1, -1));

        List<Integer> values = Collections.synchronizedList(new ArrayList<Integer>(Collections.nCopies(n + 1, -1)));

        return fib(n, values);
    }

    private static int fib(int n, List<Integer> values) {
        if (n == 0) {
            values.set(n, 0);
            return 0;
        }
        if (n <= 2) {
            values.set(n, 1);
            return 1;
        }

        if(values.indexOf(n) > 0) {
            return values.indexOf(n);
        }

        int a = fib(n - 1, values);
        int b = fib(n - 2, values);

        //int sum = fib(n - 1, values) + fib(n - 2, values);
        int sum = a + b;
        values.set(n, sum);
        return sum;
    }
}
