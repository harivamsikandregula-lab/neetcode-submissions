class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int idx=nums.length-1;
        Arrays.fill(dp, -1);
        return solve(dp,nums,idx);
    }
    public int solve(int[] dp ,int[] nums, int idx){
        if(idx==0) return nums[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = nums[idx]+solve(dp, nums, idx-2);
        int notpick = solve(dp, nums, idx-1);
        return dp[idx]=Math.max(pick, notpick);
    }
}
