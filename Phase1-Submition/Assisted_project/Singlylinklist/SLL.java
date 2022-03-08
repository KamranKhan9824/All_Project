package Assistepractise;


public class SLL{
	Node head;
	
	class Node{
		String data;
		Node next;
	
	Node(String data){
		this.data=data;
		this.next=null;
	}
	}
	

public void AddFirst(String data)
{
	Node newNode = new Node(data);
    if (this.head == null) {
        this.head = newNode;
        return;
    }
    newNode.next = this.head;
    this.head = newNode;
}

public void AddLast(String data) {
    final Node newNode = new Node(data);
    if (this.head == null) {
        this.head = newNode;
        return;
    }
    Node curNode;
    for (curNode = this.head; curNode.next != null; curNode = curNode.next) {}
    curNode.next = curNode;
}

public void print() {
    if (this.head == null) {
        System.out.println("List is Empty");
        return;
    }
    for (Node curNode = this.head; curNode != null; curNode = curNode.next) {
        System.out.print(String.valueOf(curNode.data) + "->");
    }
    System.out.println("Null");
}

public void DelFirst() {
    if (this.head == null) {
        System.out.println("List is empty");
        return;
    }
    this.head = this.head.next;
}

public void DelLast() {
    if (this.head == null) {
        System.out.println("List is empty");
        return;
    }
    Node Secondlast = this.head;
    Node Lastnode = this.head.next;
    if (this.head.next == null) {
        this.head = null;
        return;
    }
    while (Lastnode != null) {
        Lastnode = Lastnode.next;
        Secondlast = Secondlast.next;
    }
    Secondlast.next = null;
}

public static void main(final String[] args) {
     SLL sll = new SLL();
    sll.AddFirst("Khan");
    sll.AddFirst("Kamran");
    sll.print();
    sll.DelFirst();
    sll.print();
}

}
