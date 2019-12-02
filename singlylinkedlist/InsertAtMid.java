package singlylinkedlist;

public class InsertAtMid extends SinglyLinkedList {
	@SuppressWarnings("unused")
	public void addAtMiddle(Node head,int data) {
		Node current = head, prev = current, temp = current.next;
		Node newNode = new Node(data);
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
		current = head;
		count /= 2;
		//System.out.println(current.data);
		int count1 = 1;
		while (count1 != count) {
			//System.out.print(current.data+" ");
			prev = current;
			temp = current.next;
			current=current.next;
			count1++;
		}
		newNode.next=current.next;
		current.next=newNode;
	}

	public static void main(String[] args) {
		InsertAtMid list = new InsertAtMid();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(10);
		list.display();
		list.addAtMiddle(list.head,7);
		list.display();
		list.addAtMiddle(list.head, 5);
		list.display();
		list.addAtMiddle(list.head, 8);
		list.display();
	}

}
