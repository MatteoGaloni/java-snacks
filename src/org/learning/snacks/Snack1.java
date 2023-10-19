package org.learning.snacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPositive = true;

        while (isPositive){
            System.out.println("Insert number");
            int number = Integer.parseInt(scan.nextLine());

            if (number >= 0) {
                System.out.println(number % 2 == 0 ? number : number + 1);
            } else if (number < 0){
                isPositive = false;
            }
        }

        scan.close();
    }
}
