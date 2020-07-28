/**137. Single Number II
 Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
Example 1:
Input: [2,2,3,2]
Output: 3
 */

 
class Solution {
    public int singleNumber(int[] nums) {
        int sumOne = 0;
        int sumTwo =0;
        for(int i: nums){
            sumOne = ~sumTwo & ( sumOne ^ i);
            sumTwo = ~sumOne & ( sumTwo ^ i);
        }
        
        return sumOne;
    }
}