/**159. Longest Substring with At Most Two Distinct Characters

 Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

Example 1:
Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.

Example 2:
Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.


 */

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length() < 3){
            return s.length();
        }
        int max =2;
        Map<Character, Integer> hash = new HashMap<>();
        int i=0;
        int j =0;
        while(j < s.length()){
            if(hash.size() < 3){
                hash.put(s.charAt(j), j++);
            }
            if(hash.size() == 3){
                int del = Collections.min(hash.values());
                hash.remove(s.charAt(del));
                i = del +1;
            }
            max = Math.max(max, j-i);
        }
        return max;
    }
}

