/**78. Subsets

 Given a set of distinct integers, nums, return all possible subsets (the power set).
Note: The solution set must not contain duplicate subsets.

Example:
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        bt(list, new ArrayList<>(), 0, nums);
        return list;
       }
        private void bt(List<List<Integer>> list, List<Integer> temp, int p, int[] nums){
            list.add(new ArrayList<>(temp));
            for(int i=p; i< nums.length; i++){
                temp.add(nums[i]);
                bt(list, temp, i+1, nums);
                temp.remove(temp.size()-1);
            }
        }
    }