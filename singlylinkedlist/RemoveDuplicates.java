package singlylinkedlist;

public class RemoveDuplicates extends SinglyLinkedList {
	public void removeDuplicates(Node head) {
		Node prev = null;
		Node current = null;
		Node compare = head;
		while (compare != null) {
			current = compare.next;
			prev = compare;
			while (current != null) {
				if (compare.data == current.data) {
					if (current.next == null) {
						prev.next = null;
						break;
					} else {
						prev.next = current.next;
					}
				} else {
					prev = prev.next;
				}
				current = current.next;
			}
			compare = compare.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicates list = new RemoveDuplicates();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(2);
		list.addNode(2);
		list.addNode(4);
		list.addNode(1);
		list.display();
		list.removeDuplicates(list.head);
		list.display();
	}

}
