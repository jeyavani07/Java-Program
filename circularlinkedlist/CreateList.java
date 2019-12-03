package circularlinkedlist;

public class CreateList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;

		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("List is empty");
		}else {
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != head);
		System.out.println();
		}
	}

	public static void main(String[] args) {
		CreateList list = new CreateList();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		list.addNode(10);
		list.display();
	}

}
