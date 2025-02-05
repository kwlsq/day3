package org.vincent;

public class PrimeNumberValidator {
    public static boolean isPrime(int number){
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for(int i=5;i*i<=number;i+=2){
            if(number % i == 0) return false;
        }

        return true;
    }
}
