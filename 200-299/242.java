/**242. Valid Anagram

 Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0; i<x.length;i++){
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
}