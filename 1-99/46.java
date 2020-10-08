/**46. Permutations
 
 Given a collection of distinct integers, return all possible permutations.
 
Example:
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        bt(list, new ArrayList<>(), nums);
        return list;
    }
    
    private void bt(List<List<Integer>> list, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0; i< nums.length; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            else{
                temp.add(nums[i]);
                bt(list, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}   
}
