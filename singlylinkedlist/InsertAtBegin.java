package singlylinkedlist;

public class InsertAtBegin extends SinglyLinkedList {
	@SuppressWarnings("unused")
	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		Node current=head;
		newNode.next=head;
		head=newNode;

	}

	public static void main(String[] args) {
		InsertAtBegin list = new InsertAtBegin();
		list.addNode(3);
		list.addNode(4);
		list.display();
		list.insertAtBegin(2);
		list.display();
	}

}
