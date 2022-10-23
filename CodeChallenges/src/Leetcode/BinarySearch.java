package Leetcode;

/**
 * <a href="https://leetcode.com/problems/binary-search/">...</a>
 *Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high){
            int midIndex = (low + high)/2;
            if (nums[midIndex]==target) {
                return midIndex;
            }
            else if (target > nums[midIndex]){
                //mid will be recalculated to search on right side of array
                low= midIndex+1;
            }
            else {
                //mid will be recalculated to search on left side of array
                high = midIndex-1;
            }
        }
        return -1;
    }
}
