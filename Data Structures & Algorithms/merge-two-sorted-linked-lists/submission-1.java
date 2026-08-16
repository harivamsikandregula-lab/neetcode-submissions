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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!=null) return list2;
        if(list2==null && list1!=null) return list1;
        if(list1==null && list2==null) return null;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            arr1.add(temp.val);
            temp=temp.next;
        }
        ListNode temp2=list2;
        while(temp2!=null){
            arr2.add(temp2.val);
            temp2=temp2.next;
        }
        arr1.addAll(arr2);
        Collections.sort(arr1);
        ListNode head=new ListNode(arr1.get(0));
        ListNode tail=head;
        for(int i=1;i<arr1.size();i++){
            tail.next=new ListNode(arr1.get(i));
            tail=tail.next;
        }
        return head;
    }
}