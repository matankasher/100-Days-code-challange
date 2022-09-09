class Solution {
    // Add Two Numbers (Java improved)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
     {
        ListNode Head = new ListNode(0);
        ListNod c = Head;
        int carry = 0;
        while (l1 != null || l2 != null || c != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = c + x + y;
            carry = sum / 10;
            c.next = new ListNode(sum % 10);
            c = c.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return Head.next;
    }
}