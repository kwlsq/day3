package org.vincent;

import java.util.Objects;

public class Anagrams {
    public static boolean isAnagrams(String mainWord, String comparedWord){
        if (mainWord.length() != comparedWord.length()) {
            return false;
        }

        String[] mainWordArray = mainWord.split("");
        String[] comparedWordArray = comparedWord.split("");

        for(int i=0;i< mainWordArray.length;i++){
            boolean wordMatchFlag = false;

            for(int j=0;j<comparedWord.length();j++){
                if(Objects.equals(mainWordArray[i], comparedWordArray[j])){
                    comparedWordArray[j]="";
                    wordMatchFlag=true;
                    break;
                }
            }

            if (!wordMatchFlag) {
                return false;
            }
        }
        return true;
    }

}
