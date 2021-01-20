/**6. ZigZag Conversion
 * 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
 */

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1  || numRows > s.length() ){
            return s;
        }
        StringBuilder[] result = new StringBuilder[numRows];
        for(int i=0;i<result.length;i++){
        result[i]=new StringBuilder("");   //init every sb element **important step!!!!
    }
        int count = 0;
        int demo = -1;
        for( int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            result[count].append(c);
            if(count ==0 || count == numRows-1 ){
                demo *= -1;
            }
            count += demo;
        }
        String fil="";
        for(int i = 0; i < result.length;i++ ){
            fil +=result[i];
        }
        
        return fil;
    }
}