package Leetcode;
/**
 https://leetcode.com/problems/valid-parentheses/description/
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the same type.
*/

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        int pushCount =0;
        int popCount =0;
        //if String size is not pair then is automatically false
        if (s.length()%2!=0){
            return false;
        }
        for(int index= 0 ; index < s.length();index++){
            if (s.charAt(index)=='('||s.charAt(index)=='['||s.charAt(index)=='{') {
               myStack.push(s.charAt(index));
                pushCount++;
            } else if (myStack.size()>0){
                if (s.charAt(index)==')' && myStack.peek() =='(') {myStack.pop();}
                if (s.charAt(index)==']' && myStack.peek() =='[') {myStack.pop();}
                if (s.charAt(index)=='}' && myStack.peek() =='{') {myStack.pop();}
                popCount++;
            }
        }
        /**
         * At the end stack must be empty and
         * push count and pop count shall be equal and
         * the number of push operations must be equal to string length divided by two, corner scenario ()))
         */

        if (myStack.size()==0 && pushCount >0 && pushCount==popCount && pushCount==(s.length()/2)){
            return true;
        }
        return false;
    }
}
