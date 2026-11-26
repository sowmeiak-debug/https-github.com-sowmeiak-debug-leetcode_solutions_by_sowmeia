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
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode head=new ListNode(10);
        ListNode tem=head;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                tem.next=t1;
                tem=t1;
                t1=t1.next;
            }
            else{
                tem.next=t2;
                tem=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            tem.next=t2;
        }
        else{
            tem.next=t1;
        }
        return head.next;
    }
}