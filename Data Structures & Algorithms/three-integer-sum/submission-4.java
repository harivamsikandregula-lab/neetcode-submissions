class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lss = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set= new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int temp=-(nums[i]+nums[j]);
                if(set.contains(temp)){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(temp);
                    Collections.sort(ls);
                    s.add(ls);
                }
                set.add(nums[j]);
            }
        }
        lss.addAll(s);
        return lss;
    }
}
