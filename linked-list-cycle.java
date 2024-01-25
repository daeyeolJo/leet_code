/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == null)
                return false;
            if(hare.val == tortoise.val && hare == tortoise){
                return true;
            }
        }
        return false;
    }
}
