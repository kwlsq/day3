package org.vincent;

public class SumOfNumbers {
    public static int sum(String inputDigits){
        if(inputDigits == null || inputDigits.isEmpty()){
            throw new IllegalArgumentException("Input can't be empty");
        }
        if (!inputDigits.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid input: must contain only digits!");
        }

        int tempOutput=0;
        for(char inputDigit : inputDigits.toCharArray()){
            tempOutput = tempOutput + (inputDigit-'0');
        }
        return tempOutput;
    }
}
