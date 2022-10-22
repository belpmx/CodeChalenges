package Leetcode;
/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">...</a>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * */


public class Palindrome {
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        //note: using a StringBuilder will make use less memory
        //Using String, will be faster, but it will use more memory.
        StringBuilder strBuffer = new StringBuilder(s.toLowerCase());

        int left = 0;
        int right = strBuffer.length()-1;

        while (left<right){
            //This will while will look for next valid char
            while (left <right && !((strBuffer.charAt(left)>='a')&&(strBuffer.charAt(left)<='z')||(strBuffer.charAt(left)>='0') && (strBuffer.charAt(left)<='9'))){
                left ++;
            }
            while (left <right && !((strBuffer.charAt(right)>='a')&&(strBuffer.charAt(right)<='z')||(strBuffer.charAt(right)>='0') && (strBuffer.charAt(right)<='9'))){
                right --;
            }
            if (strBuffer.charAt(left)!= strBuffer.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}
