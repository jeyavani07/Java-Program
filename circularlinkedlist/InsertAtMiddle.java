package circularlinkedlist;

public class InsertAtMiddle extends CreateList {
	public void insertAtMiddle(int data) {
		Node node = new Node(data);
		Node current = head;
		int count = 0, count1 = 0;
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			do {
				count++;
				current = current.next;
			} while (current != head);
		}
		current = head;
		Node prev = null;
		count /= 2;
		while (count1 != count) {
			prev = current;
			current = current.next;
			count1++;
		}
		if(current.next==head) {
			current.next=node;
			node.next=head;
			tail=node;
		}else if(prev.next==head) {
		prev.next=node;
		node.next=head;
		}else {
			node.next=prev.next;
			prev.next=node;
		}
	}

	public static void main(String[] args) {
		InsertAtMiddle list = new InsertAtMiddle();
		list.insertAtMiddle(2);
		list.display();
		list.insertAtMiddle(4);
		list.display();
		list.insertAtMiddle(6);
		list.display();
		list.insertAtMiddle(12);
		list.display();
		list.insertAtMiddle(18);
		list.display();

	}

}
