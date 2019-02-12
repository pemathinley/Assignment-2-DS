class Node{

	Node pre;
	
	int data;
	
	Node next;

	Node(int data){
		this.data = data;
	}
}

class DoublyList{
	
	Node head;
	
	Node tail;

	public void traverse(){

		if(head == null)
			System.out.println("empty list");
		
		else{
			Node current = head;
			
			while(current != null){
				System.out.println(current.data);
				current = current.next;
				
			}
		}
	}

	public void traverseReverse(){
		if(tail ==  null)
			System.out.println("empty list");
		else{
			Node current = tail;

			while(current != null){
				System.out.println(current.data);
				current = current.pre;
			}
		}
	}

	public void insertBeg(int data){
		
		Node node = new Node(data);

		if(head == null){
			head = node;
			tail = node;
		}
		else{
			head.pre = node;
			node.next = head;
			head = node;
		}
	}

	public void insertEnd(int data){

		Node node = new Node(data);

		if(head == null){
			head = node;
			tail = node;
		}
		else{
			tail.next = node;
			node.pre = tail;
			tail = node;
		}
	}

	public void deleteBeg(){
		if(head == null){
			System.out.println("empty list");
		}
		else{
			if (head == tail) {
				head = null;
				tail = null;
			}
			else{
				head.next.pre = head;
				head = head.next;
			}
		}
	}

	public void deleteEnd(){
		if(head == null)
		{
			System.out.println("empty list");
		}
		else{
			tail.pre.next = null;
			tail = tail.pre.pre; 
		}
	}
}
public class MyLinkedList{
	public static void main(String[] x){
		
		DoublyList d = new DoublyList();

		for(int i=1; i<4; i++){
			//d.insertBeg(i*10);
			d.insertEnd(i*10);
		}
		d.traverse();
		//d.deleteBeg();
		d.deleteEnd();
		d.traverse();
		

	}
}