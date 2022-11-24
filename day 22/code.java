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
  public int RecOddEven(ListNode odd, ListNode even)
  {
      if(odd.next == null || even.next == null)
      {
          odd.next = null;
          return 0;
      }
      odd.next =  odd.next.next;
      even.next = even.next.next;
      return RecOddEven(odd.next, even.next);
  }
  public ListNode oddEvenList(ListNode head) {
      if(head == null)
          return head;
      ListNode even = head.next , temp = head;
      RecOddEven(head,even);
      while(temp.next!= null)
          temp = temp.next;
      temp.next = even;
      return head;
  }
}