import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

class List{
	
	Node head;
	
	public void insertEnd(int data){
		
		Node node = new Node(data);
		
		if(head == null){
			head = node; 
		}
		
		else{
			Node current = head;
			
			while(current.next != null){
				current = current.next;
			}
		current.next = node;			
		}
	}
	
	public void traverse(){
		
		if(head == null){
			System.out.println("empty list");
		}
		else{
			System.out.println("list elements are: ");
			Node current = head;
			while(current != null){
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
	}

	public void deleteBeg(){
		if(head == null)
		{
			System.out.println("empty list");
		}
		else{
		Node cur = head;
		head = cur.next;
		cur.next = null;
	}
	}

	public void deleteEnd(){
		if(head == null){
			System.out.println("empty list");	
		}
		else{
			Node cur = head;
			Node prev = head;
			if(head.next == null){
				head = null;
			}
			else{
				while(cur.next != null){
				prev = cur;
				cur = cur.next;
			}
			prev.next = null;	
			}
				
		}
		
	}
}


public class Delete{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List l = new List();
		l.insertEnd(5);
		l.insertEnd(10);
		l.insertEnd(15);
		l.insertEnd(20);
		l.insertEnd(25);
		l.insertEnd(30);
		l.insertEnd(35);
		l.deleteBeg();
		l.deleteEnd();
		l.traverse();
	}

}