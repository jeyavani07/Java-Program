package singlylinkedlist;

public class ReverseList extends SinglyLinkedList{
public void reverse(Node current) {
	if(current!=null) {
		reverse(current.next);
		System.out.print(current.data+" ");
	}
	
}
	public static void main(String[] args) {
		ReverseList list=new ReverseList();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		list.display();
		list.reverse(list.head);
	}

}
