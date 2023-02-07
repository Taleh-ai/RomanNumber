package LeetCodeSolution.AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        long binary  = Integer.parseInt(a,2)+ Integer.parseInt(b,2);
        return Integer.toBinaryString(Math.toIntExact(binary));
    }
}