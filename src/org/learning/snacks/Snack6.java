package org.learning.snacks;

public class Snack6 {
    public static void main(String[] args) {
        int onlySeconds = 100;

        int hours = onlySeconds / 3600;
        int minutes = (onlySeconds % 3600) / 60;
        int seconds = onlySeconds % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(formattedTime);


    }
}
