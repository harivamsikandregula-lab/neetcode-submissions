class Solution {
    public int countSubstrings(String s) {
        if(s.length()==1) return 1;
        int[][] dp = new int[s.length()+1][s.length()+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
            int count=0;
        for(int i=0;i<s.length();i++){
            count+=helper(s,i,i, dp);
            count+=helper(s,i,i+1, dp);
        }
        return count;
    }
    public int helper(String s,int i,int j, int[][] dp){
        if(i<0 || j>=s.length() || s.charAt(i)!=s.charAt(j)){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        else{
            return dp[i][j]=1+helper(s,i-1, j+1,dp);
        }
    }
}
