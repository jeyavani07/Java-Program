package circularlinkedlist;

public class InsertAtBegin extends CreateList{
public void insertAtBegin(int data) {
	Node node=new Node(data);
	if(head==null) {
		head=node;
		tail=node;
		node.next=head;
	}else {
	//tail.next=node;
	node.next=head;
	tail.next=node;
	head=node;
	}
}
	public static void main(String[] args) {
		InsertAtBegin list=new InsertAtBegin();
		//list.addNode(2);
		//list.addNode(4);
		//list.addNode(6);
		//list.addNode(8);
		//list.addNode(10);
		//list.display();
		list.insertAtBegin(15);
		list.insertAtBegin(20);
		list.display();
	}

}
