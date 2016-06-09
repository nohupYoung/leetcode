/**
 * Definition for singly-linked list.
 * public class ListNode {
 * 		int val;
 * 		ListNode next;
 * 		ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null || head.next==null) return null;
		ListNode fast=head;
		ListNode slow=head;
		for(int i=0;i<n;i++) {
			fast=fast.next;
		}
		if(fast==null) {
			head=head.next;
			return head;
		}
		while(fast.next != null) {
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		return head;
        
	}
}