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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head; 
        if(head == null) {
            return head;
        }

        int size = 0;

        // traversing the end
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        
        int target = (size/2) + 1;

        temp = head;
        while(target > 1) {
            temp = temp.next;
            target--;
        }

        return temp;
    }
}