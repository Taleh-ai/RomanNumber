package LeetCodeSolution.Palindrome_Number;
import java.lang.*;

public class Solution {
    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        int flash = 0;
        int reverseFlash = xString.length()-1;
        while (reverseFlash>=flash){
        if (xString.charAt(flash)==xString.charAt(reverseFlash)){
            flash+=1;
            reverseFlash-=1;
        }else {
            return false;
        }

    }
    return true;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(-151));
    }
}
