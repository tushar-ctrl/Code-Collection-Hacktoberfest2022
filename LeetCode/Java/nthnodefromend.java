
//this is a simple soltion for removing nth node from the end of a linkedlist

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode rmv = head;
        ListNode tmp = head;
        int i = 0;
        while (i++ <n) if ((tmp = tmp.next) == null) return head.next;
        while ((tmp = tmp.next) != null) rmv = rmv.next;
        rmv.next = rmv.next.next;
        return head;
    }
}
