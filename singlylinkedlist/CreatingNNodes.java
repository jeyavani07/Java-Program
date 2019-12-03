package singlylinkedlist;


public class CreatingNNodes {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
			//count++;
		}
	}
	//static int count=0;
	public Node head = null;
	public Node tail = null;

	void addNode(int data) {
		Node current = new Node(data);
		if (head == null) {
			head = current;
			head.next = null;
			tail = head;
		} else {
			tail.next = current;
			tail = current;
		}
	}
	void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			System.exit(0);
		}
		else
		{
			while(current!=null) {
				System.out.println(current.data+" ");
				current=current.next;
			}
		}
	}
	int countNodes() {
		Node current=head;
		int count=0;
		if(head==null) {
			return 0;
		}
		else
		{
			while(current!=null) {
				count++;
				current=current.next;
				
			}
			return count;
		}
	}
	public static void main(String[] args) {
		CreatingNNodes c = new CreatingNNodes();
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		c.addNode(4);
		c.display();
		System.out.println("The count of nodes is : "+c.countNodes());
	}
}
