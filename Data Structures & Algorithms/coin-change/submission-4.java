class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        int ans=solve(coins, amount, n-1,dp);
        return (ans>=1e9)?-1:ans;
    }
    public int solve(int[] coins, int amount, int n,int[][] dp){
        if(amount==0) return 0;
        if(n==0){
            if(amount%coins[n]==0) return amount/coins[n];
            else return Integer.MAX_VALUE;
        }
        if(dp[n][amount]!=-1) return dp[n][amount];
        int notTake=solve(coins, amount, n-1,dp);
        int take=(int)1e9;
        if(coins[n]<=amount){
            take=1+solve(coins, amount-coins[n],n,dp);    
        }
        return dp[n][amount]=Math.min(take, notTake);
    }
}
