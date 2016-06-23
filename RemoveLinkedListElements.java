/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode tmp=new ListNode(0);
		tmp.next=head;
		head=tmp;
		while(head.next != null) {
			if(head.next.val==val) {
				head.next=head.next.next;
			} else {
				head=head.next;
			}
		}
		return tmp.next;
        
	}
}