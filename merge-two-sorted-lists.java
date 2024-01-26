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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        ListNode before = tail;

        if(list1 == null && list2 == null)
            return null; 
            
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                tail.val = list2.val;
                tail.next = new ListNode();
                before = tail;
                tail = tail.next;
                list2 = list2.next;
            } else {
                tail.val = list1.val;
                tail.next = new ListNode();
                before = tail;
                tail = tail.next;
                list1 = list1.next;
            }
        }

        if(list1 == null){
            while(list2 != null){
                tail.val = list2.val;
                tail.next = new ListNode();
                before = tail;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        if(list2 == null){
            while(list1 != null){
                tail.val = list1.val;
                tail.next = new ListNode();
                before = tail;
                tail = tail.next;
                list1 = list1.next;
            }
        }
        before.next = null;
        return head;
    }
}
