/**53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


Example 2:
Input: nums = [1]
Output: 1


 */
class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int globalMax = nums[0];
        for(int i =1; i< nums.length;i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(currMax, globalMax);
        }
        
        return globalMax;
    }
}