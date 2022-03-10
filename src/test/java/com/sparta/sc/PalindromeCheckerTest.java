package com.sparta.sc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {


    @Test
    @DisplayName("Given a palindrome should return true")
    void givenAPalindromeShouldReturnTrue() {
        Assertions.assertEquals(true, PalindromeChecker.isPalindrome("rotator"));
    }

    @Test
    @DisplayName("Given a no palindrome should return false")
    void givenANoPalindromeShouldReturnFalse() {
        Assertions.assertEquals(false, PalindromeChecker.isPalindrome("music"));
    }

    @Test
    @DisplayName("Given a sentence should return longest palindrome")
    void givenASentenceShouldReturnLongestPalindrome() {
        String sentence = "level radar with a repaper";
        Assertions.assertEquals("repaper", PalindromeChecker.findLongestPalindrome(sentence));
    }

    @Test
    @DisplayName("Given a sentence should return two longest palindromes")
    void givenASentenceShouldReturnTwoLongestPalindromes() {
        String sentence = "level radar with a repaper and wow rotator";
        Assertions.assertEquals("repaper rotator", PalindromeChecker.findLongestPalindrome(sentence));
    }

}
