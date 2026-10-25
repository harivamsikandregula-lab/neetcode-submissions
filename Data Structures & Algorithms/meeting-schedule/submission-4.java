/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n=intervals.size();
        if(n==0||n==1) return true;
        boolean ans=false;
                intervals.sort((a, b) -> a.start - b.start);
        Interval a = intervals.get(0);
        int t1=a.start;
        int t2=a.end;
        for(int i=1;i<n;i++){
            Interval b=intervals.get(i);
            int x=b.start;
            int y=b.end;
            if(x>=t2){
                ans=true;
                t1=b.start;
                t2=b.end;
            }else{
                return false;
            }
        }
        return ans;
    }
}
