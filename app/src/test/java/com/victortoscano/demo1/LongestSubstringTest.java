package com.victortoscano.demo1;

import junit.framework.TestCase;
import org.junit.Test;

public class LongestSubstringTest extends TestCase {
    LongestSubstring longestSubstring;

    @Override
    public void setUp() throws Exception {
        longestSubstring = new LongestSubstring();
    }

    @Test
    public void testAbcabcbb() {
        String input = "abcabcbb";
        int expected = 3;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testAbcabcdb() {
        String input = "abcabcdb";
        int expected = 4;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testPwwkew() {
        String input = "pwwkew";
        int expected = 3;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testBbbbbbbbbb() {
        String input = "bbbbbbbbbbbb";
        int expected = 1;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSpace() {
        String input = " ";
        int expected = 1;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDvdf() {
        String input = "dvdf";
        int expected = 3;
        int actual = longestSubstring.longestSubstring(input);
        assertEquals(expected, actual);
    }
}