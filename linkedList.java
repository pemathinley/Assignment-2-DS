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
	
	public void insertBeg(int data){
		Node node =  new Node(data);
		if(head == null){
			head = node;
		}
		else{
			node.next = head;
			head = node;
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
	public void reverse(Node n){

		if(n == null){
			return;
		}
		reverse(n.next);
		System.out.println(n.data);
	}			
	public void alternate(){
		
		Node current = head;
		
		System.out.println("Alternate!");
		
		while(current != null){
			
			System.out.print(current.data+" ");
			
			current = current.next;
			
			if(current != null)
				current = current.next;
		}
	}
	
	public void middle(){
		Node h = head;
		int c = 0;
		while(h != null){
			c++;
			h = h.next;
		}
		
		h = head;
		c=c/2;
		
		while(c>0){
			h=h.next;
			c--;
		}
		System.out.println("middle = "+h.data );
	
	}
	
	public void slowAndFast(){
		
		Node slow = head;
		
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}
		

public void insertAt(int pos, int data){
	
	Node cur = head;
	
	Node temp = new Node(data);
	
	int count = 0;
	if (pos < 0) {
		System.out.println("invalid position");
				return;
	}
	while(cur != null){
		count++;
		cur = cur.next;
	}

	if(count<pos+1 ){
			{
				System.out.println("invalid position");
				return;
			}
	}
	else{
		if(pos == 1 ){
	 		temp.next = head;
	 		head = temp;
		}

	else{
		for(int i = 1; i < pos-1; i++){
			cur = cur.next;
		}

		temp.next = cur.next;
	
		cur.next = temp;
		}
	}
}
}


public class linkedList{
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
		l.traverse();
		l.reverse(l.head);
		l.alternate();
		l.middle();
		l.slowAndFast();
		int pos = sc.nextInt();
		l.insertAt(pos,40);
		l.traverse();
	}

}