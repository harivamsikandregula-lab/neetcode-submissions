class Solution {
    public int minDistance(String word1, String word2) {
        if(word1==word2) return 1;
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int[][] dp = new int[arr1.length+1][arr2.length+1];
        return solve(arr1, arr2, dp);
    }
    public int solve(char[] arr1, char[] arr2, int[][] dp){
        for(int i=0;i<=arr1.length;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=arr2.length;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[arr1.length][arr2.length];
    }
}
