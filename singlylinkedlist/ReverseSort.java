package singlylinkedlist;

public class ReverseSort {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;

	void addNode(int data) {
		Node current = new Node(data);
		if (head == null) {
			head=current;
			tail = head;
		} else {
			tail.next=current;
			tail=current;
		}
	}
	void reverse(Node current) {
		if(current!=null) {
			reverse(current.next);
			System.out.println(current.data+" ");
		}
	}

	public static void main(String[] args) {
			ReverseSort list=new ReverseSort();
			list.addNode(1);
			list.addNode(5);
			list.addNode(7);
			list.addNode(9);
			list.reverse(list.head);
	}

}
