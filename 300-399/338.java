/**338. Counting Bits
 Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example 1:

Input: 2
Output: [0,1,1]
Example 2:

Input: 5
Output: [0,1,1,2,1,2]
 */

class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        //Fact: If a number(n) is odd then no. of set bits is 1+n/2; else n/2.
        for(int i=0; i <=num ; i++){
            if(i%2 ==0){
                dp[i] = dp[i/2];
            }
            else{
                dp[i] = 1 + dp[i/2];
            }
        }
        return dp;
    }
}