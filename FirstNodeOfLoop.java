//Here we have given a linked list in which loop exists
//and we have to find the starting point or you can say
//first Node of Loop

//Problem is similar to detect and remove a loop
//only different thing is that we don't have to
//remove loop

//Basic approach is using Hashset


//Efficient approach using Two Pointers

Node detectAndRemoveLoop(Node head) {

	if (head == null || head.next == null)
		return null;

	Node slow = head, fast = head;

	slow = slow.next;
	fast = fast.next.next;

	while (fast != null && fast.next != null) {
		if (slow == fast)
			break;
		slow = slow.next;
		fast = fast.next.next;
	}

	if (slow != fast)
		return null;

	slow = head;

	while (slow != fast) {
		slow = slow.next;
		fast = fast.next;
	}
	return slow;
}


//Problem is available on geeksforgeeks