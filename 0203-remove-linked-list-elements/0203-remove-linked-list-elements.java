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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        while(curr!=null){
            if(head.val==val){
                head = head.next;
            }
            curr = curr.next;
        }
        ListNode pre=head;
        curr=head;
        while(curr!=null){
            if(curr.val==val){
                pre.next = curr.next;
                curr = pre.next;
            }
            else{
                pre = curr;
                curr=curr.next;
            }
        }
        return head;
    }
}