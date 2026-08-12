class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        if(s.length()<=1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int start=0;
        int end=0;
        while(end<=s.length()-1){
            int len=0;
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                len=end-start+1;
                maxlen=Math.max(len, maxlen);
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;
    }
}
