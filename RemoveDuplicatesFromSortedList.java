/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    	public ListNode deleteDuplicates(ListNode head) {
		if (head==null || head.next==null)		       
			return head;		
		ListNode node=head;
		while(node!=null && node.next != null) {
			if (node.val==node.next.val) {
				node.next=node.next.next;
			} else {
			    node=node.next;
			}
			
		}
		return head;		
	}
}