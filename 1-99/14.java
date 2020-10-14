/**14. Longest Common Prefix

 Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if(strs.length ==0){
            return s;
        }
        int index =0;
        for(char c: strs[0].toCharArray()) {
            for(int i=1; i < strs.length; i++){
                if(index >= strs[i].length() || c != strs[i].charAt(index)){
                    return s;
                }
            }
                s += c;
                index++;
        }
        
        return s;
    }
}