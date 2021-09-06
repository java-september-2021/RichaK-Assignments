public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList(int data) {
    	// Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
    	
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    
    public Node remove() {
    	if(!isEmpty()) {
    		return null;
    		
    	}
    	
    	Node removedNode = head;
    	head = head.getNext();
		size--;
        removedNode.setNext(null);
        return removedNode;
    	
    }
    
    
    public boolean isEmpty() {
    	return head == null;
    }
    
    
    public void printValues() {
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
