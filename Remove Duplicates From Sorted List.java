/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head; // 
        while(current != null && current.next != null) {
            if(current.val == current.next.val) { // check to see if the current node I am looking at and the next node values are the same
                current.next = current.next.next; // skips over the ListNode effectively removing it from the list.
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

/*
  Time Complexity for this is O(n)
  Space Complexity would be O(1)
*/
