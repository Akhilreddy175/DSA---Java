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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        ListNode reverse = dummy; 
        int count = 1;

        ListNode curr = head;
        while(count < left){
            reverse.next = curr;
            curr = curr.next;
            reverse = reverse.next;
            count++;
        }

        ListNode prev = null;
        ListNode tail = curr;
        while(count <= right){ 
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }

        reverse.next = prev;
        tail.next = curr;

        return dummy.next;
    }
}