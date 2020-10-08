/**424. Longest Repeating Character Replacement

 Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.

In one operation, you can choose any character of the string and change it to any other uppercase English character.

Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:

Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
 */
class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int max =0;
        int mOA =0;
        int[] freq = new int[26];
        for(int right =0; right < s.length(); right++){
            freq[s.charAt(right) -'A']++;
            mOA = Math.max(mOA, freq[s.charAt(right) -'A']);
            int temp = (right -left +1) - mOA;
            
            if(temp > k){
               freq[s.charAt(left) -'A']--;
                left++;
            }
        max = Math.max(max, right - left +1);
        }
        
        return max;
    }
}