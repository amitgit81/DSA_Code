import java.util.Scanner;

class Node<T>
{
	T data;
	Node<T> next;
	Node(T data)
	{
		this.data = data;
	}
}

public class LinkedListClass {

	public static Node<Integer> createLiinkedList()
	{
		Scanner s=new Scanner(System.in);
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	public static void main(String[] args) {
		
		Node<Integer> head = createLiinkedList();
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
