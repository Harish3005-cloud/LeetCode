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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int count=0;
        while(count<k && curr!=null){
            curr=curr.next;
            count++;
        }
        if(count==k){
            ListNode reversedhead=reversedll(head,k);
            head.next=reverseKGroup(curr,k);
            return reversedhead;
        }
        return head;
    }
    private ListNode reversedll(ListNode head,int n){
        ListNode prev=null;
        ListNode curr=head;
        while(n>0){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            n--;
        }
        return prev;
    }
}