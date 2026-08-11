class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tsum=n*(n+1)/2;
        int esum=0;
        for(int i:nums){
            esum+=i;
        }
        return tsum-esum;
    }
}
