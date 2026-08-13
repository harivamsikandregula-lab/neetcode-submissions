class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp, -1);
        return solve(0, s,set,dp);
    }
    public boolean solve(int st, String s, Set<String> set, int[] dp){
        if(st==s.length()) return true;
        if(dp[st]!=-1) return dp[st]==1;
        for(int i=st+1;i<=s.length();i++){
            String str=s.substring(st,i);
            if(set.contains(str) && solve(i,s,set,dp)){
                 dp[st]=1;
                 return true;
            }
        }
        dp[st]=0;
        return false;
    }
}
