public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 90, 20, 30, 45};
        System.out.println("Element at index 2:" + numbers[2]);
        System.out.println("Element at index 3:" + numbers[3]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of array elements:" + sum);

        //Update elements in the array
        numbers[1] = 60;

        System.out.println("Update an element at index 1:" + numbers[1]);
        System.out.println("Elements in the array:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
