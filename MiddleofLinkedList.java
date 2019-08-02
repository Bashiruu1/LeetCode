/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int listSize = 0; //We do not know how big the LinkedList is so must keep track of it
        ListNode temp = head;
        
        while(temp != null) { // Traverse the LinkedList... incremenet the size while you're at it
            listSize++;
            temp = temp.next;
        }
        for (int i = 0; i < listSize / 2; i++) { //Go through the LinkedList again, but this time only go to the middle and return the head.
            head = head.next;
        }
        return head;
    }
}

/*
  Time Complexity = O(n)
  Space Complexity = O(1)
  Honestly I should have made temp = head; after the while loop to preserve the head Node.
*/
