/**131. Palindrome Partitioning

 Given a string s, partition s such that every substring of the partition is a palindrome.Return all possible palindrome partitioning of s.

Example:
Input: "aab"
Output:
[
  ["aa","b"],
  ["a","a","b"]
]
 */

 
class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> list = new ArrayList<>();
        bt(list, new ArrayList<>(), 0, s);
        return list;
    }
    
   private void bt(List<List<String>> list, List<String> temp, int p, String s){
        if(p>= s.length()){
            list.add(new ArrayList<>(temp));
        }
        
        for(int i=p; i<s.length();i++){
           if(palindrone(p,i,s)){
               temp.add(s.substring(p, i+1));
               bt(list,temp, i+1,s);
               temp.remove(temp.size()-1);
           } 
        }
    }
    
    private boolean palindrone(int left, int right, String s){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}