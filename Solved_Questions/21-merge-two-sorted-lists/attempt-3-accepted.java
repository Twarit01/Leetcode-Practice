class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode old = new ListNode(0);
        ListNode neww = old;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                neww.next = list1;
                list1 = list1.next;
            } else {
                neww.next = list2;
                list2 = list2.next;
            }
            neww = neww.next;
        }
        if (list1 != null) {
            neww.next = list1;
        } else {
            neww.next = list2;
        }
        return old.next;
    }
}