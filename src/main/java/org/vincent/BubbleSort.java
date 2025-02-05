package org.vincent;

public class BubbleSort {
    public static int[] arraySorter(int[] inputArray){
        int n = inputArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }

        return inputArray;
    }
}
