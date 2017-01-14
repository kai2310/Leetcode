function ListNode(val) {
     this.val = val;
     this.next = null;
}
 
var oddEvenList = function(head) {
  if(!head || !head.next || !head.next.next) {
     return head;
  }
  var res = head;
  var nextHeadNode = head.next;
  var switchNode = head.next.next
  var prevSwitchNode = head.next;
  var nextSwitchNode = switchNode.next;
  
  while(true) {
  	  head.next = switchNode;
			switchNode.next = nextHeadNode;
			prevSwitchNode.next = nextSwitchNode;
			
			head = head.next;
			nextHeadNode = head.next;
			if(!prevSwitchNode.next || !prevSwitchNode.next.next)
				break;
			prevSwitchNode = prevSwitchNode.next;
			switchNode = prevSwitchNode.next;
			nextSwitchNode = switchNode.next;
  }
  return res;    
};