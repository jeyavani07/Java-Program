package circularlinkedlist;

public class DeleteFromMiddle extends CreateList {
	public void deleteFromMid() {
		Node current = head, prev = null;
		int count = 0, count1 = 0;
		do {
			count++;
			current = current.next;
		} while (current != head);
		count /= 2;
		current = head;
		prev = null;
		if (head == null) {
			return;
		} else {
			while (count1 != count) {
				prev = current;
				current = current.next;
				count1++;
			}
			if (current.next == prev) {
				prev.next = head;
				head = prev;
				tail = head;
			} else if (current.next == current) {
				head = null;
			} else {
				prev.next = current.next;
			}
		}
	}

	public static void main(String[] args) {
		DeleteFromMiddle list = new DeleteFromMiddle();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		list.addNode(10);
		list.display();
		while (list.head != null) {
			list.deleteFromMid();
			list.display();

		}
	}

}
