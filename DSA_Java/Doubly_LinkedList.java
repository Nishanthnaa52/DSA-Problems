import java.util.*;

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
    
    private static Node check(Node i , Node temp, int target) {
	   
	    while (temp != null) {
	        if (i.data + temp.data == target) {
	            return temp;
	        }
	        temp = temp.next;
	    }
	    
	    return null;
	}
	
	// The target sum pair from the Doubly Linkedlist.
	
	//
	
	private static List<List<Integer>> targetSumValueMatrix(Node head, int target) {
	    
	    List<List<Integer>> matrix = new ArrayList<>();
	    
	 
	    Node i = head;
	    
	    while (i != null) {
	        Node k = check(i, i.next, target);
	        if (k != null) {
	            List<Integer> row = new ArrayList<>();
	            row.add(i.data);
	            row.add(k.data);
	            matrix.add(row);
	        }
	       
	        i = i.next;
	       
	    }
	    
	    return matrix;
	    
	}
	
	// the HashSet solution for unsorted Doubly LinkedList.
	private static List<List<Integer>> hashMapTargetSum(Node head, int target) {
	    
	    Set<Integer> map = new HashSet<>();
	    
	    List<List<Integer>> matrix = new ArrayList<>();
	    
	    Node temp = head;
	    
	    while (temp != null) {
	        
	        int val = target - temp.data;
	        
	        if (map.contains(val)) {
	            
	            List<Integer> row = new ArrayList<>();
	            
	            row.add(val);
	            row.add(temp.data);
	            
	            matrix.add(row);
	        }
	        
	        map.add(temp.data);
	        temp = temp.next;
	    }
	    return matrix;
	}
    
    private static List<List<Integer>> taregetValueInDoublyLinkedList(Node head, int target) {
        
        List<List<Integer>> matrix = new ArrayList<>();
        
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        
        Node left = head;
        Node right = temp;
        
        while (left != right && right.back != left) { // left.data <= right.data - We can use any of this condition.
            
            int val = left.data + right.data;
            
            if (val > target) {
                right = right.back;
            }
            
            if (val < target) {
                left = left.next;
            }
            
            if (val == target) {
                List<Integer> row = new ArrayList<>();
                
                row.add(left.data);
                row.add(right.data);
            
                matrix.add(row);
                
                left = left.next;
                right = right.back;
            }
        }
        
        return matrix;
    }
    
    //
    
    
    // remove the duplicate from the dobly linkedlist.
    
    private static Node removeduplicateDLL(Node head) {
        
        Node temp = head;
        
        // Time complexity - O(n); Space complexity - O(1).
        
        while (temp != null && temp.next != null) {
            
            if (temp.data == temp.next.data) {
                
                Node duplicate = temp.next;
                
                temp.next = duplicate.next;
                
                if (duplicate.next != null) {
                    duplicate.next.back = temp;
                }
                
            }
            else {
                temp = temp.next;
            }
            
        }
        
        return head;
    }
    
	// Main function.
	public static void main(String args[]) {
		int[] arr = {1,1,1,3,3,3,4,5,5,5,6};

		Node y = convertarrToLinkedList(arr);


		Node yy = removeduplicateDLL(y);
		Node temp = yy;
        
		print(yy);

        // System.out.println(hashMapTargetSum(y,8));
	}

}
