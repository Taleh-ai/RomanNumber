package LeetCodeSolution.RemoveElement;

import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> i = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=val){
                i.add(nums[j]);
            }else{
                continue;
            }

        }
        return i.size();
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3},3));
    }
}
