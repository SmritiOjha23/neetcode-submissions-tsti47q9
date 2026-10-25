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
        if(head==null || head.next ==null)
            return;
        ListNode prev=middle(head);
        ListNode newList=prev.next;
        prev.next=null;
        ListNode list2=reverse(newList);

        ListNode list1=head;

        while(list2!=null)
        {
            ListNode curr1=list1.next;
            ListNode curr2=list2.next;

            list1.next=list2;
            list2.next=curr1;

            list2=curr2;
            
            list1 = curr1;
            if (list1 == null) break; 
            
        }


    }
    public ListNode middle(ListNode head)
    {
        ListNode slow=head,fast=head, prev=slow;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, curr=head;

        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
