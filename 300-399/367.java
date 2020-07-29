/**367. Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False. 
Example 1:

Input: num = 16
Output: true
 */
class Solution {
    public boolean isPerfectSquare(int num) {
       if(num < 2){
           return true;
       }
        long left = 1;
        long right = num;
        // System.out.println(right);
        while(left <= right){
            long mid = left + (right - left)/2;
            // System.out.println(mid);
            if( mid*mid == num){
                return true;
            }
            else if(mid*mid < num){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}