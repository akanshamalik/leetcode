/**1446. Consecutive Characters

Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.Return the power of the string.

Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

Example 3:
Input: s = "triplepillooooow"
Output: 5
 */
class Solution {
    public int maxPower(String s) {
        int i=0;
        int j =0;
        int max = 0;
        while(j < s.length()){
           if(s.charAt(i) == s.charAt(j)){
               if(max < (j-i+1)){
                   max = j-i+1;
               }
               j++;
           } 
            else{
                i =j;
            }
        }
        
        return max;
    }
}