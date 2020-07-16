/**13. Roman to Integer
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000


Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
 */

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> number = new HashMap<>();
        number.put('I', 1) ;
        number.put('V' , 5);
        number.put('X' , 10);
        number.put('L', 50);
        number.put('C' , 100);
        number.put('D' , 500);
        number.put('M' , 1000);
        
        int sum = number.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i--){
            if(number.get(s.charAt(i)) >=number.get(s.charAt(i+1)) ){
                sum += number.get(s.charAt(i));
            }
            else{
                sum -= number.get(s.charAt(i));
            }
        }
        
        return sum;
    }
}