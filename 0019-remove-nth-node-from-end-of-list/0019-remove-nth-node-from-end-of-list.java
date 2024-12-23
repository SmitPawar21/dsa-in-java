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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;

        if(head == null) {
            return head;
        }

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        if(n == size) {
            return head.next;
        }

        int prev = size - n;
        int i=1;
        temp = head;

        while(i < prev) {
            temp = temp.next;
            i++;
        }

        ListNode target = temp.next;
        if(target.next == null) {
            temp.next = null;
        }
        temp.next = target.next;

        return head;
    }
}