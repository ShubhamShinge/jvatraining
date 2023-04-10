import java.util.*;
class LLnode{
	int data;
	LLnode next;
	
	LLnode(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList {
	LLnode top;
	
	LLnode push(int key,LLnode top) {
		LLnode temp= new LLnode(key);
		if(top==null) {
			top=temp;
		}
		else {
			top.next=temp;
			top=temp;
		}
		return top;
	}
	void pop(LLnode top) {
		if(top==null) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println(top.data+" is popped.");
			top=top.next;
		}
		//return top;
	}
	void display(){
		LLnode temp=top;
		if(temp==null) {
			System.out.println("Stack is empty.");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	boolean isempty() {
		if(top==null) {
			return true;
		}
		else {
			return false;
		}
	}
	void peek(LLnode head) {
		if(head==null) {
			System.out.println("Stack is empty.");
		}
		else {
			System.out.println("The peek element of the stack is "+head.data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		 do
			{
			 System.out.println("\n******** MENU *******");
			 System.out.println("\n1.PUSH");
			 System.out.println("\n2.POP");
			 System.out.println("\n3.PEEK");
			 System.out.println("\n4 IS EMPTY");
			 System.out.println("\n5 DISPLAY");
			 System.out.println("\n6.EXIT");
			 System.out.println("\n enter ur choice : ");
			 n=sc.nextInt();
			 switch(n) {
			 
			 
			 
			 
			 
			}
			}while(n!=6);
	}

}
