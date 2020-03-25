package com.github.andluu.exercise;

import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        List<Integer> fibSeqList = FibonacciCalculator.f(20);
        fibSeqList.forEach(value -> System.out.print(value + " "));
        OptionalDouble average = fibSeqList.stream().mapToInt(Integer::intValue).average();
        System.out.println("\nAverage is: " + average.getAsDouble());
    }
}
