package com.sparta.sc;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char letter = word.charAt(i);
            reversedWord = reversedWord.concat(String.valueOf(letter));
        }

        return word.equals(reversedWord);
    }


    public static String findLongestPalindrome(String sentence) {

        String[] words = sentence.split(" ");

        String longestPalindrome = "";
        String manyLongestPalindromes = "";
        int palindromesCounter = 0;

        for (String word : words) {

            if (isPalindrome(word) && longestPalindrome.length() < word.length()) {
                longestPalindrome = word;
                manyLongestPalindromes = "";
                palindromesCounter = 1;
            }

            if (isPalindrome(word) && longestPalindrome.length() == word.length()) {
                if (palindromesCounter == 1) {
                    manyLongestPalindromes = word;
                } else {
                    manyLongestPalindromes = manyLongestPalindromes.concat(" " + word);
                }
                palindromesCounter++;
            }
        }

        if(palindromesCounter > 1){
            return manyLongestPalindromes;
        } else {
            return longestPalindrome;
        }
    }
}
