package singlylinkedlist;

public class DeleteFromStart extends CreatingList {
	public void delete(Node current) {
			head=head.next;
	}

	public static void main(String[] args) {
		DeleteFromStart list = new DeleteFromStart();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		while(list.head!=null) {
			System.out.println("Old list");
		list.display();
		System.out.println("Updated list");
		list.delete(list.head);
		list.display();
		}
	}

}
