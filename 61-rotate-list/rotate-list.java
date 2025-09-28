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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dum=head;
        if(dum==null) return null;
        int c=0;
        while(dum.next!=null){
            c++;
            dum=dum.next;
        }
        while(k>c+1){
            k-=c+1;
        }
        if(k==c+1)return head;
        dum.next=head;
        ListNode dum1=head;
        int p=0;
        while(dum1!=null && p<c-k){
            dum1=dum1.next;
            p++;
        }
        head=dum1.next;
        dum1.next=null;
        return head;
    }
}