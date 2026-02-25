/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode dum=head;
        while(dum!=null){
            if(set.contains(dum)){
                return dum;
            }
            else{
                set.add(dum);
                dum=dum.next;
            }
        }
return null;    }
}