class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ansHead = new ListNode(0);
        ListNode ansTail = ansHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ansTail.next = list1;
                list1 = list1.next;
            } else {
                ansTail.next = list2;
                list2 = list2.next;
            }
            ansTail = ansTail.next;
        }

        if (list1 != null) ansTail.next = list1;
        if (list2 != null) ansTail.next = list2;

        return ansHead.next;
    }
}
