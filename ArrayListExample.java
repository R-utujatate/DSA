import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //crate an ArrayList to store integers
        ArrayList<Integer> numbers =new ArrayList<>(List.of(10,30,40,55,60,80));

        //Access and print elements from the Arraylist
        System.out.println("Element at index 1:" +numbers.get(1));
        System.out.println("Element at index 3:" +numbers.get(3));

        //Calculate and print the sum of all elements in the ArrayList
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements:" +sum);

        //Update an element in the ArrayList
        numbers.set(2,35);
        System.out.println("Update element at index 2"+numbers);

        //Iterate through the Arraylist using a for-each loop and print the elements
        System.out.println("Elements in the ArrayList:");
        for (int number:numbers)
        {
            System.out.println(number);
        }



    }
}
