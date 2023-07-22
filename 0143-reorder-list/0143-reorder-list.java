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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode LH = head;
        ListNode RH = prev;
        ListNode nextLeft, nextRight;
        while (LH != null && RH != null) {
            nextLeft = LH.next;
            LH.next = RH;
            nextRight = RH.next;
            RH.next = nextLeft;
            
            RH = nextRight;
            LH = nextLeft;
        }
    }
}