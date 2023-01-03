import java.util.Scanner;

class Node2{
	int data;
	Node2 next;
	
	public Node2(int val)
	{
		data = val;
	}
}

public class ReverseLinkedList
{
	public static Node2 reverseList(Node2 head) {
        if(head == null || head.next == null)
        return head;
        
        Node2 curr = head;
        Node2 prev = null;
        Node2 forw = null;

        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }

        return prev;
    }
	
	public static Node2 inputLL()
	{
		Node2 head = null;
		Node2 tail = null;
		
		Scanner sc=new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node2 newNode = new Node2(data);
			
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
	
	public static void printLL(Node2 head)
	{
		Node2 temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String argss[])
	{
	Node2 head = inputLL();
	//reverseList(head);
	printLL(head);
	}
}