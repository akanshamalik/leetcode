/**136. Single Number
 Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 Example 1:

Input: [2,2,1]
Output: 1
 */
// Using Bit Manipulation 
class Solution {
    public int singleNumber(int[] nums) {
        int a =0;
        for(int i: nums){
            /**
             *  0 ^ x = x
             *  x ^ x = 0 
             */
            a ^=i;
        }
        
        return a;
    }
}

// Using Hash Table
class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> hash_table = new HashMap<>();
  
      for (int i : nums) {
        hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
      }
      for (int i : nums) {
        if (hash_table.get(i) == 1) {
          return i;
        }
      }
      return 0;
    }
  }