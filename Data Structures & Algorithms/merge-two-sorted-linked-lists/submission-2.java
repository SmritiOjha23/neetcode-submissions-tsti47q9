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
        ListNode curr1 = list1,curr2 = list2;
        ListNode res=new ListNode(0);
        ListNode rescurr = res;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val <= curr2.val)
            {
                rescurr.next=new ListNode(curr1.val);
                rescurr=rescurr.next;
                curr1=curr1.next;
            }
            else
            {
                rescurr.next=new ListNode(curr2.val);
                rescurr=rescurr.next;
                curr2=curr2.next;
            }
        }
        while(curr1!=null)
        {
            rescurr.next=new ListNode(curr1.val);
            rescurr=rescurr.next;
            curr1=curr1.next;
        }
        while(curr2!=null)
        {
            rescurr.next=new ListNode(curr2.val);
            rescurr=rescurr.next;
            curr2=curr2.next;
        }
        return res.next;
    }
}