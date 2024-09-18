package com.victortoscano.demo1;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public int longestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int substrStart = 0;
        int substrLength = 0;

        for(int i = 0; i < chars.length; i ++) {
            int j = substrStart;

            while(j <= i) {
                if(i != j && chars[i] == chars[j]) {
                    j ++;
                    substrStart = j;
                    break;
                }

                j ++;
            }

            substrLength = i - substrStart + 1;
            max = substrLength > max ? substrLength : max;
        }

        return max;
    }

    public int longestSubstring2(String s) {
        int max = 0;
        StringBuilder substr = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            boolean repeated = false;
            StringBuilder substr2 = new StringBuilder();

            for(int j=0; j<substr.length(); j++) {
                if(repeated){
                    substr2.append(substr.charAt(j));
                }

                if(s.charAt(i) == substr.charAt(j)) {
                    repeated = true;
                }
            }

            if(repeated) {
                substr = substr2;
            }
            substr.append(s.charAt(i));

            max = substr.length() > max ? substr.length() : max;
        }

        return max;
    }

    public int longestSubstring1(String input) {
        List<Character> window;
        int longest = 0;

        for(int i=0; i < input.length(); i++) {
            int counter = 0;
            window = new ArrayList<>();

            for(int j=i; j < input.length(); j++) {
                if (!window.contains(input.charAt(j))) {
                    Character c = input.charAt(j);
                    window.add(input.charAt(j));
                    counter++;
                } else {
                    longest = counter > longest ? counter : longest;
                    break;
                }
            }
        }

        return longest;
    }
}
