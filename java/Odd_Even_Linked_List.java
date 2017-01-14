package leetcode;


public class Odd_Even_Linked_List {
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null)
			return head;
		ListNode odd = new ListNode(head.val);
		ListNode even = new ListNode(head.next.val);
		ListNode odd_temp = odd;
		ListNode even_temp = even;
		
		head = head.next.next;
		int count = 1;
		
		while(head != null) {
			ListNode node = new ListNode(head.val);
			if(count % 2 == 1){
				odd.next = node;
				odd = odd.next;
			}else {
				even.next = node;
				even = even.next;
			}
			head = head.next;
			count = count + 1;
		}
		odd.next = even_temp;
		
		return odd_temp;
        
    }

}
