package org.learning.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int [] arrayOfNumbers = new int [10];
        int sum = 0;

        for (int i = 0; i < arrayOfNumbers.length ; i++) {
        int number = randomGenerator.nextInt(1,101);
            arrayOfNumbers[i] = number;
            if (i % 2 != 0){
                sum += arrayOfNumbers[i];
            }
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println(sum);


    }
}
