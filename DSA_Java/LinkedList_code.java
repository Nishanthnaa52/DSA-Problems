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

class Linkedlist {

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
	
	// Helper function to get the k-th node from the current node.
	private static Node getKthNode(Node curr, int k) {
	    while (curr != null && k > 0) {
	        curr = curr.next;
	        k--; 
	    }
	    return curr;
	}
	
	// Reverse the linkedList in kth rotation
	private static Node kthNodeToReverseTheLinkedList(Node head, int k) {
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node groupPrev = dummy;
        
        while (true) {
            
            // Find the kth Node group.
            Node kth = getKthNode(groupPrev, k);
            if (kth == null) break;
            
            Node groupNext = kth.next;
              
            Node prev = groupNext;
            Node curr = groupPrev.next;
            
            // Reverse the kth Node group.
            for (int i = 0; i < k; i++) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            
            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        
        return dummy.next;
    }
    
    // Rotate the linkedlist in kth rotation.
    private static Node rotateTheLinkedListkthNode(Node head, int k) {
        
        if (head == null || head.next == null || k == 0) return head;
        
        Node tail = head;
        
        int len = 1;
        
        while (tail.next != null ) {
            len++;
            tail = tail.next;
        }
        
        tail.next = head;
        
        if (k % len == 0) return head;
        
        k = k % len;
        
        int steps = len - k - 1;
        
        Node kth = head;
        for (int i = 0; i < steps; i++) {
            kth = kth.next;
        }
        
        Node newHead = kth.next;
        
        kth.next = null;
        
        return newHead;
    }

	// Main function.
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};

		Node y = convertarrToLinkedList(arr);


		Node yy = rotateTheLinkedListkthNode(y,2);
		Node temp = yy;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

}
