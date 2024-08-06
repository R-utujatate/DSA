import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        //Create a linkedlist to store integers
        LinkedList<Integer>linkedList1 = new LinkedList<>();

        //Add elements to the LinkedList
        linkedList1.add(40);
        linkedList1.add(50);
        linkedList1.add(60);
        linkedList1.add(70);
        linkedList1.add(80);

        //Print the LinkedList
        System.out.println("LinkedList:"+linkedList1);

        //Remove an element from the LinkedList
        linkedList1.removeFirst();
        System.out.println("LinkedList after removing first element:"+linkedList1);

        //Check if an element exists in the LinkedList
        boolean containsElement = linkedList1.contains(70);
        System.out.println("Is LinkedList contains element 70 ? ->" +containsElement);

        //Get the first and last element of the LinkedList
        int firstElement = linkedList1.getFirst();
        int lastElement = linkedList1.getLast();
        System.out.println("First element: "+firstElement);
        System.out.println("Last element: "+lastElement);

        //Clear the LinkedList
        linkedList1.clear();
        System.out.println("LinkedList after clearing:"+linkedList1);



    }
}
