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
        ListNode dum=head;
        ListNode dum1=head;
        int c=0;
        while(dum!=null){
            c++;
            dum=dum.next;
        }
        if(c==n)return head.next;
        int k=0;
        while(dum1!=null && k<c-n-1){
                k++;
                dum1=dum1.next;
        }
        dum1.next=dum1.next.next;
        return head;
    }

}