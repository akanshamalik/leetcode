/**69. Sqrt(x)
 Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
 */
class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        long ans =0;
        while(left <= right){
            long mid = left + (right - left)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid > x){
                right = (int)mid-1;
            }
            else{
                left = (int)mid +1;
                ans = mid;
            }
        }
        return (int)ans;
    }
}