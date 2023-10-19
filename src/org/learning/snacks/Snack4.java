package org.learning.snacks;

public class Snack4 {
    public static void main(String[] args) {
        String word = "mom";
        char[] chars = word.toCharArray();
        char[] revertedChars = new char[word.length()];

        for (int i = word.length() - 1, j = 0; i >= 0 ; i--, j++) {
            revertedChars[j] = chars[i];
        }
        System.out.println(revertedChars);
        System.out.println(word);
        String revertedWord = new String(revertedChars);

        if (word.equals(revertedWord)){
            System.out.println("The word " + word + " is a palindrome" );
        } else {
            System.out.println("The word " + word + " is not a palindrome" );
        }

    }
}
