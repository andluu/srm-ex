package com.github.andluu.exercise;

import java.util.ArrayList;
import java.util.List;

public final class FibonacciCalculator {

    private FibonacciCalculator() {
    }

    /**
     * Iterative implementation of Fibonacci sequence generator
     * Calculate Fibonacci sequence numbers depending on the seed
     * Where f(1)=f(2)=1
     * @param n seed of Fibonacci sequence
     * @return list of Fibonacci sequence numbers
     * @throws IllegalArgumentException in case of zero seed
     */
    public static List<Integer> f(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("0");

        List<Integer> fibSeqList = new ArrayList<>();

        fibSeqList.add(1);
        if (n == 1)
            return fibSeqList;

        fibSeqList.add(1);
        if (n == 2)
            return fibSeqList;

        int f = 1, prevf = 1;

        for (int i = 2; i < n; i++) {
            int currf = f;
            f += prevf;
            prevf = currf;

            fibSeqList.add(f);
        }

        return fibSeqList;
    }

}
