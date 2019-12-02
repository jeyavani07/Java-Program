package singlylinkedlist;

public class ReverseOrder extends SinglyLinkedList {
	public void reverseOrder(Node node) {
		Node crt = node, prev = null, nxt = null;
		while (crt != null) {
			nxt = crt.next;
			crt.next = prev;
			prev = crt;
			crt = nxt;
		}
		head = prev;
		//return head;
	}

	public void displayList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ReverseOrder list = new ReverseOrder();
		list.addNode(2);
		//list.addNode(4);
		//list.addNode(6);
		list.addNode(8);
		list.display();
		list.reverseOrder(list.head);
		list.display();

	}

}
