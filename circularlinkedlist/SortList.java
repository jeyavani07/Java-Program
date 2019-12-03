package circularlinkedlist;

public class SortList extends CreateList {
 public void sort() {
	 Node min=head;
	 Node temp=head;
	 Node compare=head;
	 Node current=head.next;
	 while(compare!=tail) {
		 current=compare.next;
		 temp.data=compare.data;
		 temp.next=compare.next;
	 while(current!=head) {
		 if(min.data > current.data) {
			 min.data=current.data;
		 }
		 current=current.next;
	 } 
	 compare.data=min.data;
	 compare.next=min.next;
	 min.data=temp.data;
	 min.next=temp.next;
	 compare=compare.next;
	 }
 }
	public static void main(String[] args) {
		SortList list=new SortList();
		list.addNode(19);
		list.addNode(6);
		list.addNode(21);
		list.addNode(4);
		list.addNode(3);
		list.display();
		list.sort();
		list.display();
		
	}

}
