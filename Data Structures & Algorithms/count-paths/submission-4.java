class Solution {
    static int[][] dp = new int[101][101];
    static {
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
    }
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1) return 1;
        if(m<=0 || n<=0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
       int up=uniquePaths(m-1, n);
        int down=uniquePaths(m, n-1);
        dp[m][n]=up+down;
        return dp[m][n];
    //     return uniquePaths(m-1, n)+uniquePaths(m, n-1);
     }
}
