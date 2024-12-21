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
    public ListNode reverseList(ListNode head) {
        int[] stack = new int[5000];
        int top = -1;

        ListNode temp = head;

        // pushing each elements into stack
        while(temp != null) {
            top++;
            stack[top] = temp.val;
            temp = temp.next;
        }

        // popping each element from the stack
        temp = head;
        while(temp != null) {
            temp.val = stack[top--];
            temp = temp.next;
        }

        return head;
    }
}