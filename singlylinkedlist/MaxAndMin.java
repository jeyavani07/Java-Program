package singlylinkedlist;

public class MaxAndMin extends SinglyLinkedList {
	public int maxNode(Node head) {
		int max = head.data;
		Node current = head;
		while (current != null) {
			if (max < current.data) {
				max = current.data;
			}
			current = current.next;
		}
		return max;
	}

	public int minNode(Node head) {
		int min = head.data;
		Node current = head;
		while (current != null) {
			if (min > current.data) {
				min = current.data;
			}
			current = current.next;
		}
		return min;
	}

	public static void main(String[] args) {
		MaxAndMin list = new MaxAndMin();
		list.addNode(81);
		list.addNode(12);
		list.addNode(91);
		list.addNode(4);
		list.addNode(15);
		System.out.println("The maximum value node is " + list.maxNode(list.head) + "\nThe minimum value node is "
				+ list.minNode(list.head));
	}

}
