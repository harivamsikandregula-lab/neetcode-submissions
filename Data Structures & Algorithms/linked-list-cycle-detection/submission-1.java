/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head!=null && head.next==head) return true;
        if(head==null) return false;
        HashSet<ListNode> set = new HashSet<>();
        while(head.next!=null){
            set.add(head);
            head=head.next;
            if(set.contains(head)){
                return true;
            }
        }
        return false;
    }
}
