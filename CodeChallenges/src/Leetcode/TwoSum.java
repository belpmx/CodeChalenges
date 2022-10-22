package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/solutions/127810/two-sum/">...</a>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they
 *
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: int array [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public int [] sumOfTwo (int [] nums, int target){
        //move the nums array as [element, index]
        //we will be searching by element, then set this as key
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int remaning =0;
        //move the nums array as [element, index]
        for (int i=0; i< nums.length; i++){
            remaning = target - nums[i];
            //search on the HashMap to see if remaining is already inserted
            if (myMap.containsKey(remaning)){
                int[] ints = {myMap.get(remaning), i};
                return ints;
            }
            myMap.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        //use this main method in case to try local testing

    }

}
