package singlylinkedlist;

public class FindMiddleElement extends CreatingList {
	public static void findMiddle(Node head) {
		Node current = null;
		current = head;
		System.out.println("Head is " + current.data);
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		int mid = count / 2;
		int i = 0;
		current = head;
		while (i < mid && current != null) {
			current = current.next;
			i++;
		}
		System.out.println("The middle node is " + current.data);
	}

	public static void main(String[] args) {
		FindMiddleElement list = new FindMiddleElement();

		list.addNode(2);
		list.addNode(54);
		list.addNode(35);
		list.addNode(38);
		list.addNode(78);
		list.addNode(56);
		list.display();
		findMiddle(list.head);
	}

}
