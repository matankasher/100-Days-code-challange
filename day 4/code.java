
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode nNode = head;
        if(head.next == null && n == 1)
            return null;
        int i = 0 ;
        while ( i < n && head != null)
        {
            head = head.next;
            i++;
        }
        if(head == null)
            return temp.next;
        head = head.next;
        while (head != null)
        {
            head = head.next;
            nNode = nNode.next;
        }
       if(nNode.next == null)
           nNode.next = null;
        else
       nNode.next = nNode.next.next;
    return temp;
    }
}