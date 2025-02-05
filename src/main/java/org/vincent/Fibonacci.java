package org.vincent;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fibonacci {
    public static String fibonacciGenerator(int fibonacciLength){
        if(fibonacciLength < 1) {
            throw new IllegalArgumentException("Length must be bigger than 1");
        }
        ArrayList<Integer> fibonacciArray = new ArrayList<Integer>();

        fibonacciArray.add(0);
        if (fibonacciLength > 1) {
            fibonacciArray.add(1);
        }

        for(int i=2;i<fibonacciLength;i++){
            fibonacciArray.add(fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2));
        }
        return fibonacciArray.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
}
