class Node {

	int data;
	Node next;

	Node (int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node (int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList_code {

	// convert array into Linkedlist.
	private static Node convertarrToLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

	// delete the head element in the linkedList.
	private static Node deleteFirstEle(Node head) {
		if (head == null) return head;

		head = head.next;
		return head;
	}

	// delete the last element in the linkedlist.
	private static Node deleteLastEle(Node head) {

		if (head == null || head.next == null) return head; 

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	// delete the particular element in linkedlist.
	private static Node deleteKthEle(Node head, int k) {

		if(head == null) return null;

		if(head.data == k) {
			head = head.next;
			return head;
		}

		Node temp = head;
		Node prev = null;
		int count  = 0;

		while (temp != null) {
			count++;
			if (temp.data == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}

		return head;

	}

	// Insert the value in first in linked
	private static Node insertvale(Node head, int val) {
		Node temp = new Node(val, head);
		return temp;

	}  

	// Insert the value in last element in the node.
	private static Node insertLastVal(Node head, int val) {

		Node temp = head;
		while (temp != null) {
			if (temp.next == null) {
				Node t = new Node(val);
				temp.next = t;
				return head;
			}
			temp = temp.next;
		}
		return head;
	}


	// Insert the element in partticular index in linkedList.
	private static Node insertvaleInIndex(Node head, int val, int index) {

		if(head == null) {
			if (index == 1) {
				return new Node(val);
			}
			else {
				return null;
			}
		}

		if (index == 1) {
			Node temp = new Node(val, head);
			return temp;
		}

		Node temp = head;
		int count = 0;
		while (temp.next != null) {
			count++;
			if (count == index-1) {
				Node t = new Node(val);
				t.next = temp.next;
				temp.next = t;
				return head;
			}
			temp = temp.next;
		}

		Node f = new Node(val);
		f.next = temp.next;
		temp.next = f;

		return head;

	}

	// insert the element in x value position.
	private static Node insertvaleInKthValue(Node head, int val, int x) {

		if(head == null) {
			return new Node(val);
		}

		if (head.data == x) {
			Node temp = new Node(val, head);
			return temp;
		}

		Node temp = head;
		
		while (temp.next != null) {
			
			if (temp.data == x) {
				Node t = new Node(val);
				t.next = temp.next;
				temp.next = t;
				return head;
			}
			temp = temp.next;
		}

		Node f = new Node(val);
		f.next = temp.next;
		temp.next = f;

		return head;

	}

	// Main function.
	public static void main(String args[]) {
		int[] arr = {2,4,6,9,21};

		Node y = convertarrToLinkedList(arr);


		Node yy = insertvaleInKthValue(y,23, 6);
		Node temp = yy;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}