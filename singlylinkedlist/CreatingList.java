package singlylinkedlist;

public class CreatingList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	void addNode(int data) {
		Node current = new Node(data);
		if (head == null) {
			head = current;
			head.next = null;
			tail = head;
		} else {
			tail.next = current;
			tail = current;
		}
	}
	void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			System.exit(0);
		}
		else
		{
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CreatingList c = new CreatingList();
		c.addNode(1);
		c.addNode(2);
		c.display();
	}

}
