//linkedlist example
class Node 
{
    //data stored in node
    int data;
    //pointed to the next node
    Node next; 

    //constructor creates new node
    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList 
{
    //head of linked list
    Node head;

    //add new node at the end of the list
    public void append(int data) 
    {
        Node newNode = new Node(data);

        //if list is empty, make new node = head
        if(head == null) 
        {
            head = newNode;
            return;
        }

        //traverse to the end of the list
        Node current = head;
        while(current.next != null) 
        {
            current = current.next;
        }

        //adding new node at the end
        current.next = newNode;
    }

    //print method for all nodes in the linked list
    public void printList() 
    {
        Node current = head;
        while(current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //main class
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();

        //adding elements into linked list
        list.append(10);
        list.append(20);
        list.append(30);

        //printing linked list
        System.out.println("Linked List: ");
        list.printList();
    }
}
