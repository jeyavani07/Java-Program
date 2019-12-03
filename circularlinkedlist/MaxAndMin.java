package circularlinkedlist;

public class MaxAndMin extends CreateList {
	public void findMax() {
		int max = head.data;
		Node current = head;
		do {
			if (max < current.data) {
				max = current.data;
			}
			current = current.next;
		} while (current != head);
		System.out.println("The maximum value of node is : "+max);
	}

	public void findMin() {
		int min = head.data;
		Node current = head;
		do {
			if (min > current.data) {
				min = current.data;
			}
			current = current.next;
		} while (current != head);
		System.out.println("The minimum value of the node is : "+min);
	}

	public static void main(String[] args) {
		MaxAndMin list = new MaxAndMin();
		list.addNode(12);
		list.addNode(4);
		list.addNode(6);
		list.addNode(28);
		list.addNode(10);
		list.findMax();
		list.findMin();
	}

}
