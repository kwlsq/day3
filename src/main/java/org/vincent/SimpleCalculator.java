package org.vincent;

public class SimpleCalculator {
    public static int calculator(String operator, int[] operands){
        if(!operator.matches("[+\\-/*]")){
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        if (operands == null || operands.length < 2) {
            throw new IllegalArgumentException("At least two operands are required.");
        }

        int result = operands[0];

        for(int i=1; i<operands.length; i++){
            switch(operator){
                case "+":
                    result += operands[i];
                    break;
                case "-":
                    result -= operands[i];
                    break;
                case "*":
                    result *= operands[i];
                    break;
                case "/":
                    if(operands[i]==0){
                        throw new IllegalArgumentException("Division by zero is not allowed");
                    }
                    result /= operands[i];
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected operator");
            }
        }
        return result;
    }
}
