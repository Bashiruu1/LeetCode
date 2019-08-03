/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null; 
        ListNode tempNode = null; //next Node
        
        
        /* While the current node != null traverse the LinkedList,
           while traversing I want to store the currentNode.next in some variable
           so when I change the currentNode.next position the the preceding node I can access the next/tempNode again.*/
        while(currentNode != null) {
            tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        return previousNode;
    }
}

/*
  Time Complexity is O(n), where n is number of nodes
  Space Complexity is O(1), overriding the tempNode;
*/
