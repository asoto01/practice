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
		// create a reference to the head which will serve as current node
		Node current = list.head;
		// if current is null display message
		if (current == null) {
			System.out.println("There are no items print.");
		} else {
			while (current.next != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println(current.data);
		}
	}
	// delete element in list by value
	public static LinkedList delete(LinkedList list, int data) {
		// store head node, and previous node reference
		Node currNode = list.head, prev = null;
		// check if data is found in head
		if (currNode != null && currNode.data == data) {
			list.head = currNode.next; // changed head
			System.out.println(data + " found and deleted");
			return list;
		}
		// check if current node is not null and not the data being searched
		// keep track of previous node by storing current and setting current node to next node
		while (currNode != null && currNode.data != data) {
			prev = currNode;
			currNode = currNode.next;
		}
		// current 
		if (currNode != null) {
			prev.next = currNode.next;
			System.out.println(data + " found and deleted");
		}
		if(currNode == null) {
			System.out.println(data + " not found");
		}
		
		return list;
	}

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		LinkedList list = new LinkedList();
		ls = insert(ls, 1);
		ls = insert(ls, 2);
		ls = insert(ls, 3);
		ls = insert(ls, 4);
		print(ls);
		ls = delete(ls,2);
		System.out.println();
		print(ls);
	}
}
