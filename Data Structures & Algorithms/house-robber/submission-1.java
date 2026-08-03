class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length<=2) {
            ArrayList<Integer> ls= new ArrayList<>();
            for (int n : nums) {
                ls.add(n);
            }
            return Collections.max(ls);
        }
        int a=nums[0];
        int b=Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp= Math.max(b, a+nums[i]);
            a=b;
            b=temp;
        }
        return b;
    }
}
