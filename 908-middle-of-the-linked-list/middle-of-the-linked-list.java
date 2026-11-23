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
    public ListNode middleNode(ListNode head) {
      ListNode tem=head;
      int size=0;
      while(tem!=null){
        size++;
        tem=tem.next;
      }  
      ListNode corrent=head;
      if(size%2!=0){
        for(int i=1;i<=(int)size/2;i++){
            corrent=corrent.next;
        }
      }
      else{
        for(int i=1;i<=(int)(size+1)/2;i++){
            corrent=corrent.next;
        }
      }
      return corrent ;
    }
}