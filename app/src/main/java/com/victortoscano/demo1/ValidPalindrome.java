package com.victortoscano.demo1;

import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // Traverse the array from both extremes to the middle, comparing each element
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i < j) {
            if(!isAlphanumeric(chars[i])) {
                i ++;
                continue;
            }

            if(!isAlphanumeric(chars[j])) {
                j --;
                continue;
            }

            chars[i] = toLowercase(chars[i]);
            chars[j] = toLowercase(chars[j]);

            if(chars[i] != chars[j]) {
                return false;
            }

            i ++;
            j --;
        }

        return true;
    }

    // Check if the character is an alphanumeric value
    private boolean isAlphanumeric(Character c) {
        int charCode = (int) c;

        if(charCode < 48 || charCode > 122) {
            return false;
        }
        if(charCode > 57 && charCode < 65) {
            return false;
        }
        if(charCode > 90 && charCode < 97) {
            return false;
        }

        return true;
    }

    private char toLowercase(char c) {
        int charCode = (int) c;

        if(isUppercase(c)) {
            return (char) (charCode + 32);
        }
        return c;
    }

    // Check if the character is an alphanumeric value
    private boolean isUppercase(Character c) {
        int charCode = (int) c;

        if(charCode > 64 && charCode < 91) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome1(String s) {
        String inputString = s.toLowerCase(Locale.ROOT);
        StringBuilder convertedString = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // Remove spaces and non-char characters
        Pattern pattern = Pattern.compile("[a-z0-9]");
        for(int i=0; i < inputString.length(); i++) {
            Character character = inputString.charAt(i);
            Matcher matcher = pattern.matcher(character.toString());
            if(matcher.matches()) {
                convertedString.append(character);
                stack.add(character);
            }
        }

        StringBuilder inverse = new StringBuilder();
        while(stack.iterator().hasNext()) {
            inverse.append(stack.pop());
        }

        return convertedString.toString().equals(inverse.toString());
    }
}
