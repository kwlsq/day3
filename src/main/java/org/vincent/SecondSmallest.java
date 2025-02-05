package org.vincent;

public class SecondSmallest {
    public static int secondSmalelstValueFinder(int[] array){
        int[] sortedArray = BubbleSort.arraySorter(array);
        return sortedArray[1];
    }
}
