// Iterative Java program to reverse a linked list
class Node{
    int data;
    Node next;
    Node(int new_data){
        data = new_data;
        next = null;
    }
}

public class ReverseLinkedList {
    static Node reverseList(Node head){
        Node curr = head,prev = null,next;
        while (curr != null){
            next=curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    //This function prints the contents of the linked list starting from the head
    static void printList(Node node){
        while (node != null){
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        //create a hard-coded linked list
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.print("Given Linked list:");
        printList(head);
        head = reverseList(head);
        System.out.print("\n Reversed Linked List:");
        printList(head);
    }
}
