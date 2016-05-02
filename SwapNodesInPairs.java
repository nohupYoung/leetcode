/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
    	ListNode tmp = new ListNode(0);
    	tmp.next=head;
    	head=tmp;
    	while (head.next!=null && head.next.next!=null){
    		ListNode p1=head.next;
    		ListNode p2=head.next.next;

    		head.next=p2;
    		p1.next=p2.next;
    		p2.next=p1;
    		//move to next pair ListNodes
    		head=p1;
    	}
    	return tmp.next;
        
    }
}