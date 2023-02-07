package LeetCodeSolution.ValidParentheses;

import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {

        Stack<Character> symbol= new Stack<>();
        for (char i:s.toCharArray()){
        switch (i){
            case '(':
            case '{':
            case '[':
                symbol.push(i);
                break;
            case ')':
                if (symbol.isEmpty() || symbol.pop() !='('){
                    return false;
                }
                break;
            case '}':
                if (symbol.isEmpty() || symbol.pop() !='{'){
                    return false;
                }
                break;
            case ']':
                if (symbol.isEmpty() || symbol.pop() !='['){
                    return false;
                }
                break;
        }
        }
        return symbol.isEmpty();

    }




    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
}
