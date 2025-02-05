package org.vincent;

public class StringReverse {
    public static String reverse(String inputText){
        if(inputText.isEmpty()){
            throw new IllegalArgumentException("Input can't be empty");
        }

        StringBuilder tempResult = new StringBuilder();
        String[] inputTextArray = inputText.split("");
        for(String text : inputTextArray){
            tempResult.insert(0,text);
        }
        return tempResult.toString();
    }
}
