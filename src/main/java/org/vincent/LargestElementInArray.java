package org.vincent;

public class LargestElementInArray {
    public static int findLargestElement(int[] numbersArray){

        int tempLargestElement = numbersArray[0];
        for (int number : numbersArray) {
            if (number > tempLargestElement) {
                tempLargestElement = number;
            }
        }
        return tempLargestElement;
    }
}
