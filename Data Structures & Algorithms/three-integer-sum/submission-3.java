class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        int n=nums.length;
        if(nums==null || n<3) return res;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                set.add(nums[j]);
            }
        }
        res.addAll(st);
    return res;
    }
}