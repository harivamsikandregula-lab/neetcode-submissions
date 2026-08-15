class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            int temp=target-nums[i];
            if(map.containsKey(temp) && map.get(temp)!=i){
                res[1]=i;
                res[0]=map.get(temp);
                break;
            }
        }
        return res;
    }
}
