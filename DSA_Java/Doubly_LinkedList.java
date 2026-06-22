class Node {

	int data;
	Node next;
	Node back;

	Node (int data, Node next, Node back) {
		this.data = data;
		this.next = next;
		this.back = back;
	}

	Node (int data) {
		this.data = data;
		this.next = null;
		this.back = null;
	}
}

class Main {

	// convert array into Linkedlist.
	private static Node convertarrToLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node prev = head;
		
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
    
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    private static Node headDelete(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        Node temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        
        return head;
    }
    
    private static Node headDeleteLast(Node head) {
        
        if (head == null || head.next == null) return head;
        
        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            temp = temp.next;
        }
        prev = temp.back;
        prev.next = null;
        temp.back = null;
        
        return head;
    }
    
    private static Node headDeleteKthElement(Node head, int k) {
        
        Node temp = head;
        
        int count = 0;
        
        while (temp != null) {
            count++;
            if (count == k) break;
            
            temp = temp.next;
        }
        
        Node prev = temp.back;
        Node forword = temp.next;
        
        if (prev == null && forword == null) {
            temp = null;
            return head;
        }
        
        if (prev == null) {
            return headDelete(head);
        }
        
        if (forword == null) {
            return headDeleteLast(head);
        }
        
        prev.next = forword;
        forword.back = prev;
        
        temp.next = null;
        temp.back = null;
        
        return head;
    }
    
    private static void headDeleteNodeElement(Node temp) {
        Node prev = temp.back;
        Node forwad = temp.next;
        
        if (forwad == null) {
            prev.next = null;
            temp.back = null;
            return;
        }
        
        prev.next = forwad;
        forwad.back = prev;
        
        temp.next = null;
        temp.back = null;
    }
    
    private static Node Inserthead(Node head, int val) {
        Node temp = new Node(val, head, null);
        head.back = temp;
        return temp;
    }
    
    private static Node InsertHeadLast(Node head, int val) {
        
        Node tail = head;
        
        while (tail.next != null) {
            tail = tail.next;
        }
        
        Node newHead = new Node(val, null, tail);
        tail.next = newHead;
        
        return head;
    }
    
	// Main function.
	public static void main(String args[]) {
		int[] arr = {2,4,6,9};

		Node y = convertarrToLinkedList(arr);


		Node yy = InsertHeadLast(y, 78);
		Node temp = yy;
        
		print(yy);

	}

}
