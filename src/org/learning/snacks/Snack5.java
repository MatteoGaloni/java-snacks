package org.learning.snacks;

public class Snack5 {
    public static void main(String[] args) {

        String stringNumber = "257898";
        int integerNumber = 0;

        for (int i = 0; i < stringNumber.length() ; i++) {
            char charNumber = stringNumber.charAt(i);
            int convertedNumber = charNumber - '0';
            integerNumber = integerNumber * 10 + convertedNumber;
        }
            System.out.println(integerNumber);

    }
}
