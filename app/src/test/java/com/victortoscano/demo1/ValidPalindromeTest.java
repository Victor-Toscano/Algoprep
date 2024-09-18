package com.victortoscano.demo1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeTest extends TestCase {
    ValidPalindrome validPalindrome;

    @Override
    @Before
    public void setUp() throws Exception {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void testRaceACar() {
        String input = "race a car";
        boolean expected = false;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("race a car, should be false", expected, actual);
    }

    @Test
    public void testPanama() {
        String input = "A man, a plan, a canal: Panama";
        boolean expected = true;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("A man, a plan, a canal: Panama, should be true", expected, actual);
    }

    @Test
    public void test0P() {
        String input = "0P";
        boolean expected = false;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("0P, should be false", expected, actual);
    }

    @Test
    public void testSpace() {
        String input = " ";
        boolean expected = true;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("(space), should be true", expected, actual);
    }

    @Test
    public void testMadam() {
        String input = "Madam, I'm Adam";
        boolean expected = true;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("Madam, I'm Adam, should be true", expected, actual);
    }

    @Test
    public void testKayak() {
        String input = "Kayak";
        boolean expected = true;

        boolean actual = validPalindrome.isPalindrome(input);
        assertEquals("Kayak, should be true", expected, actual);
    }
}