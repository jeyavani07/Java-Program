package circularlinkedlist;

public class RemoveDuplicates extends CreateList{
	public void removeDuplicates() {
		Node compare=head;
		Node current=null;
		Node prev=null;
		while(compare!=tail) {
			current=compare.next;
			prev=compare;
		while(current!=head) {
			if(compare.data==current.data) {
				if(current.next==head) {
					prev.next=head;
					tail=prev;
				}else {
					prev.next=current.next;
				}
			}
			prev=current;
			current=current.next;
		}
		compare=compare.next;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicates list=new RemoveDuplicates();
		list.addNode(1);
		list.addNode(2);
		list.addNode(2);
		list.addNode(4);
		list.addNode(3);
		list.addNode(4);
		list.addNode(4);
		list.display();
		list.removeDuplicates();
		list.display();
	}

}
