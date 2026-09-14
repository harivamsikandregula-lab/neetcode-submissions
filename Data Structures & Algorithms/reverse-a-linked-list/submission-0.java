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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer> arr =new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        Collections.reverse(arr);
        ListNode node = new ListNode(arr.get(0));
        ListNode temp=node;
        for(int i=1;i<arr.size();i++){
           temp.next = new ListNode(arr.get(i));
           temp=temp.next;
        }
        return node;
    }
}
