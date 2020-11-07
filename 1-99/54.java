/**54. Spiral Matrix
 * 
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length ==0){
            return list;
        }
        int left =0;
        int right = matrix[0].length-1;
        int top =0;
        int bottom = matrix.length-1;
        int len =  matrix.length*matrix[0].length;
        while(list.size() < len){
            for(int i = left; i<=right && list.size() < len; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<=bottom && list.size() < len;i++){
                list.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left && list.size() < len; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i >=top && list.size() < len;i--){
                list.add(matrix[i][left]);       
            }
            left++;
          
        }
        
        return list;
    }
}
