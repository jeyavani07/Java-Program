package singlylinkedlist;

public class DeleteFromEnd extends SinglyLinkedList {
	public void deleteFromEnd() {
		Node current = head;
		Node prev = head, temp = head.next;
		while (current.next != null) {
			prev = current;
			temp = current.next;
			current = current.next;
		}
		if (prev.next == null) {
			head = null;
		} else {
			tail = prev;
			tail.next = null;
		}
	}

	public static void main(String[] args) {
		DeleteFromEnd list = new DeleteFromEnd();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		list.addNode(10);
		while(list.head!=null) {
		list.deleteFromEnd();
		list.display();
		}

	}

}
