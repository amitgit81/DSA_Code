import java.util.Scanner;

class Node
{
	int data;
	Node next;
	public Node(int val)
	{
		data = val;
	}
}

//it can be customized means you can make this as seperate class and main method in different class

public class CreatingLinkedList_byTakingUserInput {
	
	public static Node inputLL(){
		Node head = null;
		Node tail = null;
		
		Scanner sc=new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = tail.next;
			}
			
			data = sc.nextInt();
		}
		
		sc.close();
		return head;
	}
	
	public static void printLL(Node head)
	{
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("CreatingLinkedList_byTakingUserInput ");
		Node head = inputLL();
		printLL(head);
	}

}
