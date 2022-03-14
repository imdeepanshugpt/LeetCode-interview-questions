package LongestPalindromeSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        String substring = "";
        int dp[][] = new int[s.length()][s.length()];
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < s.length(); i++, j++) {
                if (g == 0) {
                    dp[i][j] = 1;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                } else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1){
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }

                if(dp[i][j] == 1 ){
                    substring = s.substring(i,j+1);
                }
            }
        }
        return substring;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("babad"));
    }
}
