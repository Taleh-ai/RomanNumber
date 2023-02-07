package LeetCodeSolution.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String prefix = "";
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];

        for (int i = 0; i <firstWord.length() ; i++) {
            if (firstWord.charAt(i)== lastWord.charAt(i)){
                prefix= prefix+firstWord.charAt(i);
            }else {
                return prefix;
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
