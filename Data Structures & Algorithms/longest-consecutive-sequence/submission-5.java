class Solution {
    public int longestConsecutive(int[] nums) {
     int count=1;
     int maxlen=1;
     if(nums.length==0) return 0;
     HashMap<Integer, Integer> map= new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
     }
     ArrayList<Integer> ls= new ArrayList<>(map.keySet());
     Collections.sort(ls);
     for(int j=1;j<ls.size();j++){
        if(ls.get(j)-ls.get(j-1)==1) {
            count++;
            }
        else{
            maxlen=Math.max(maxlen, count);
            count=1;
        }
     }
     maxlen=Math.max(maxlen, count);
     return maxlen;  
    }
}
