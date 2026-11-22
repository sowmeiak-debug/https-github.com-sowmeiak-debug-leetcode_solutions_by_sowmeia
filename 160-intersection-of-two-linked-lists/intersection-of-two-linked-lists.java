/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tem1=headA;
        ListNode tem2=headB;
        int size1=0,size2=0;
        while(tem1!=null){
            size1++;
            tem1=tem1.next;
        }
        while(tem2!=null){
            size2++;
            tem2=tem2.next;
        }
        tem1=headA;
        tem2=headB;
       if(size1>size2){
        int n=size1-size2;
        for(int i=1;i<=n;i++){
            tem1=tem1.next;
        }
       }
        else{
            int n=size2-size1;
         for(int i=1;i<=n;i++){
            tem2=tem2.next;
         }
        }
        while(tem1!=tem2){
            tem1=tem1.next;
            tem2=tem2.next;
        }
        return tem1;
    }
}