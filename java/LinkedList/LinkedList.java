public class LinkedList {
	Node head;
	public static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	// insert a node method.
	public static LinkedList insert(LinkedList list, int data) {
		// create a new node
		Node insertedNode = new Node(data);
		// check if head is null
		if (list.head == null) {
			list.head = insertedNode;
		} else {
			// create node to keep track of traversals
			Node last = list.head;
			// loop until next is null
			while (last.next != null) {
				last = last.next;
			}
			// set next to null since next did not update in while loop
			last.next = insertedNode;
		}
		return list;
	}
	// print elements in the list
	public static void print(LinkedList list) {
		// create a reference to the head
		Node current = list.head;
		// if current is null display message
		if (current == null) {
			System.out.println("There are no items in the list.");
		} else {
			while (current.next != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.print(current.data + " ");
		}
	}
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		insert(ls, 1);
		insert(ls, 2);
		insert(ls, 3);
		print(ls);
	}
}
