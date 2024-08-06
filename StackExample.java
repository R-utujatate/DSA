import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //Create Stack
        Stack<String>names=new Stack<>();

        //Push elements onto the stack
        names.push("Rutuja");
        names.push("Radha");
        names.push("Pratik");
        names.push("Aaradhana");
        names.push("Shubhada");

        //Print the top element of the stack
        System.out.println("Top element:"+names.peek());

        //Pop elements from the stack
        String poppedElement = names.pop();
        System.out.println("Popped Element:"+poppedElement);

        //Check if the stack is empty
        System.out.println("Is stack empty? ->"+names.isEmpty());

        //Get the size of the stack
        System.out.println("Stack size:"+names.size());

        //Iterate over the stack
        System.out.println("Stack elements:");

        for (String element:names)
        {
            System.out.println(element);
        }
    }
}
