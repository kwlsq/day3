package org.vincent;

import java.util.Arrays;
import java.util.Objects;

public class CountVowels {
    static String[] VOWELS_ARRAY= {"a","i","u","e","o"};

    public static int vowelsCounter (String textInput){
        if(textInput.isEmpty()){
            throw new IllegalArgumentException("Input can't be empty");
        }

        String[] textInputArray = textInput.split("");
        int counter=0;
        for(String text: textInputArray){
            for(int j=0;j< VOWELS_ARRAY.length;j++){
                if(Objects.equals(VOWELS_ARRAY[j], text)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
