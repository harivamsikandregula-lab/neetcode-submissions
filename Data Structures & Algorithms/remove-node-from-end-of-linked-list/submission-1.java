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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr);
            curr=curr.next;
        }
        arr.remove(arr.size()-n);
        ListNode node=new ListNode(arr.get(0).val);
        ListNode temp=node;
        for(int i=1;i<arr.size();i++){
            temp.next = new ListNode(arr.get(i).val);
            temp=temp.next;
        }
        return node;
    }
}
