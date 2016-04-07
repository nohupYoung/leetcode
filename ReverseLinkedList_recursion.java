/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList_recursion {
    	public ListNode reverseList(ListNode head) {
		return reverseAll(head);
	}

	private ListNode reverseAll(ListNode node) {
		if (node == null) return null;
		if (node.next==null) return node;		
		ListNode tmp = node.next;
		ListNode n = reverseAll(tmp);
		node.next.next=node;
		node.next=null;
		return n;
	}
}