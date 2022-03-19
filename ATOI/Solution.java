package ATOI;

// https://leetcode.com/problems/string-to-integer-atoi/
public class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        int result = 0;
        int n = s.length();
        int index = 0;
        
        while(index < n){
            if(s.charAt(index) == '+' && index == 0){
                    sign = 1;
                    index++;
                    continue;
            } else if(s.charAt(index) == '-' && index == 0){
                    sign = -1;
                    index++;
                    continue;
            }
            Boolean isDigit = Character.isDigit(s.charAt(index));
            if(isDigit){
                int digit = s.charAt(index) - '0'; 
                if((result > Integer.MAX_VALUE / 10) || 
                (
                    result == Integer.MAX_VALUE / 10 
                    && digit > Integer.MAX_VALUE % 10)
                ){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                } else {
                    result = 10 * result + digit;     
                }
            } else {
                return sign * result;
            }
            index++;
        }
        return sign * result;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.myAtoi("-13+8"));
    }
}
