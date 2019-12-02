package singlylinkedlist;

public class DeleteFromMid extends SinglyLinkedList {
	public void deleteFromMid() {
		int count =0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		count/=2;int count1=0;
		current=head;
		Node temp=null,prev=null;
		while(count1!=count) {
			prev=current;
			temp=current.next;
			current=current.next;
			count1++;
		}
		if(prev==null) {
			head=null;
			return;
		}
		else if(temp==null) {
			prev.next=null;
			prev=head;
			return;
		}
		prev.next=temp.next;
		
	}
	public static void main(String[] args) {
		DeleteFromMid list=new DeleteFromMid();
		list.addNode(2);
		list.addNode(4);
		list.addNode(6);
		list.addNode(8);
		list.display();
		while(list.head!=null) {
		list.deleteFromMid();
		list.display();
		}
		
	}

}
