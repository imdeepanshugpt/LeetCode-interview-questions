package ReverseInteger;

// https://leetcode.com/problems/reverse-integer/
public class Solution {
        public int reverse(int x) {
            long d=0,sum=0;
            while(x!=0){
                d = x%10;
                sum = (sum*10)+d;
                x /= 10;
            }
            if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
            return (int)sum;
        }
}
