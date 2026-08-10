class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        int[][] dp = new int[arr1.length+1][arr2.length+1];
            return bubs(arr1, arr2, dp);
    }
    public int bubs(char[] arr1, char[] arr2, int[][] dp){
        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[arr1.length][arr2.length];
    }
}
