class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res= new int[nums.length];
        for(int j=0;j<nums.length;j++){
            int mul=1;
        for(int i=0;i<nums.length;i++){
            if(i==j) continue;
            mul*=nums[i];
        }
        res[j]=mul;
    }
        return res;
    }
}  
