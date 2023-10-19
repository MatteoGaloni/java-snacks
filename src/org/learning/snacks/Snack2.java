package org.learning.snacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        String [] names = {"Mario", "Franco", "Gianni", "Francesco", "Claudia", "Maria", "Giovanna", "Sara"};
        String [] surnames = {"Rossi", "Verdone", "Giallini", "Serra", "Monti", "Zazzaroni", "Mentana", "De Angelis"};

        Random randomGenerator = new Random();
        for (int i = 0; i < names.length ; i++) {
        int randomNumber = randomGenerator.nextInt(0, names.length);
        int otherRandomNumber = randomGenerator.nextInt(0, names.length);
        System.out.println(names[randomNumber] + " " + surnames[otherRandomNumber]);
        }
    }
}
