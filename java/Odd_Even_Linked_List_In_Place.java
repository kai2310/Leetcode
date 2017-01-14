package leetcode;

public class Odd_Even_Linked_List_In_Place {
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null) {
			return head;
		}
		
		ListNode res = head;
		ListNode switchNode = head.next.next;
		ListNode nextSwitchNode = switchNode.next;
		ListNode prevSwitchNode = head.next;
		ListNode nextHeadNode = head.next;
		
		while(true){
			head.next = switchNode;
			switchNode.next = nextHeadNode;
			prevSwitchNode.next = nextSwitchNode;
			
			head = head.next;
			nextHeadNode = head.next;
			if(prevSwitchNode.next == null || prevSwitchNode.next.next == null)
				break;
			prevSwitchNode = prevSwitchNode.next;
			switchNode = prevSwitchNode.next;
			nextSwitchNode = switchNode.next;
		}
		
		return res;
	}

}
