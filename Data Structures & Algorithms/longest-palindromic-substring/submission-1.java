class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<2) return s;
        String str="";
        for(int i=0;i<s.length();i++){
            String oddlen=helper(s,i,i);
            String evenlen=helper(s,i,i+1);
            if(oddlen.length()>str.length()){
                str=oddlen;
            }
            if(evenlen.length()>str.length()){
                str=evenlen;
            }
        }
        return str;
    }
    public String helper(String s,int i, int j){
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp, -1);
        if(i<0||j>=s.length()||s.charAt(i)!=s.charAt(j)){
            return s.substring(i+1, j);
        }else{
            return helper(s,i-1,j+1);
        }
    }
}
