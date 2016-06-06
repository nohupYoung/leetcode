/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) {
			return null;
		}
		int lengthA=getLength(headA);
		int lengthB=getLength(headB);

		if(lengthA>lengthB) {
			while(lengthA>lengthB) {
				headA=headA.next;
				lengthA--;
			}
		} else {
			while(lengthA<lengthB) {
				headB=headB.next;
				lengthB--;
			}
		}

		while(headA != null) {
			if(headA==headB) {
				return headA;
			}
			headA=headA.next;
			headB=headB.next;
		}

		return null;
	}

	private int getLength(ListNode node) {
		int len=0;
		while(node!=null) {
			len++;
			node=node.next;
		}
		return len;
	}
}