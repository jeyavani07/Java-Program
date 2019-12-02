package singlylinkedlist;

public class SinglyLinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public  Node head=null;
	public Node tail=null;
	public void addNode(int data) {
		Node current=new Node(data);
		if(head==null) {
			head=current;
		}
		else {
			tail.next=current;
		}
		tail=current;
	}
public void display() {
	Node current=head;
	if(head==null) {
		System.out.println("List is empty");
	}
	while(current!=null) {
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.display();

	}

}
