package singlylinkedlist;

public class PalindromeTest extends SinglyLinkedList{
	public void checkPalindrome(Node head,PalindromeTest dup) {
		Node current=head,prev=null;
		if(head!=tail) {
		while(current!=null) {
		if(current.next==null) {
			dup.addNode(current.data);	
			tail=prev;
			tail.next=null;
		}
		prev=current;
		current=current.next;
		}
		checkPalindrome(head, dup);
		}else {
			dup.addNode(head.data);
		}
	}

	public static void main(String[] args) {
		PalindromeTest list = new PalindromeTest();
		PalindromeTest dup=new PalindromeTest();
		list.addNode(2);
		list.addNode(4);
		list.addNode(4);
		list.addNode(2);
		list.display();
		list.checkPalindrome(list.head, dup);
		dup.display();
		Node first=list.head,second=dup.head;
		while(first!=null) {
			if(first.data!=second.data) {
				System.out.println("The list is not palindrome");
				System.exit(0);
			}else {
				first=first.next;
				second=second.next;
			}
		}
		System.out.println("The list is palindrome");
	}

}
