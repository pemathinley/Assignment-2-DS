import java.util.*;
class Node{
	
	int data;

	Node next;

	boolean flag;
	Node(int data){
		this.data =  data;
		flag = false;
	}
}

class Cancel{
	
	Node head;

	public void insert(int data){

		Node node = new Node(data);

		if(head == null){
			head = node; 
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void traverse(){

		System.out.println();
		
		if(head == null){
			System.out.println("empty list");
		}
		else{
			Node node = head;

			while(node != null){
				System.out.print(node.data+"  ");
				node = node.next;
			}
		}
	}
	public void deleteElements(){
		Node outter = head;
		Node inner, prev, outterprev = head;

		while(outter.next != null){
			
			boolean flag = false;

			inner = outter.next;
			prev = outter;
			
			while(inner != null){
				if(outter.data + inner.data == 0){
					flag = true;
					break;
				}
				else{
					prev = inner;
					inner = inner.next;
				}
			}
			if(flag == true){
				prev.next = inner.next;
				outterprev.next = inner.next;
				
			}
			else{
				outterprev = outter;
				outter = outter.next;
			}		
		}
}
}
public class CancelList{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Cancel c = new Cancel()	;

		int n= sc.nextInt();
		
		for(int i=0; i<n; i++){
			int x  = sc.nextInt();
			c.insert(x);
		}

		c.traverse();
		c.deleteElements();
		c.traverse();
	}
}