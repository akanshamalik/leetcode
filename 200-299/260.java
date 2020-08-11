/**260. Single Number III
 Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Example:

Input:  [1,2,1,3,2,5]
Output: [3,5]
 */

class Solution {
    public int[] singleNumber(int[] nums) {
       /**x ^ x =0
         0 ^ x = x
         First, we will take xor of all the numbers in the nums array so that the resultant xor consits of xor of only              those numbers which are only occuring once in the nums array */ 
        //Pass 1
        int sum =0;
        for(int i: nums){
            sum ^=i;
        }
        /** Truth table of XOR
          0 ^ 0 = 0
          0 ^ 1 = 1
          1 ^ 0 = 1
          1 ^ 1 = 0
          So the xor of two bit is 1 when they are distinctive. So now we want to capture the least significant set bit             in "sum" because at that bit the the two distinctive numbers(in the given array) are not same(that is why the             xor is coming out to be set at that bit); hence we will take the 2's compliment of "sum" and will perform &               opertor to get the least significant set bit.
          Performing & operation after taking 2's compliment of the same number always gives the least signifacnt set for           that number(both positive and negative numbers).
          */
        sum &= -sum;
        
        //Pass 2
        int[] res = new int[2];
        for(int i: nums){
            if((i & sum) == 0){ // the bit is not set
                res[0] ^= i; // we are taking xor so that we only get the distinctive number
            }
            else{ // the bit is set
                res[1] ^=i;
            }
        }
        return res;
    }
}