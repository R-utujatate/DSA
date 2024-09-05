/*
Java program to find maximum product sub array using minimum
and maximum product ending at every index
 */

public class MaxProductSubarray {

    static long max(long a, long b, long c){
        return Math.max(a,Math.max(b,c));

    }
    static long min (long a, long b, long c){
        return Math.min(a,Math.min(b,c));
    }

    //Function to find the product of max product subarray
    static long maxProduct(int [] arr){
        int n= arr.length;

        //max product ending at the current index
        long currMax = arr[0];

        //min product ending at the current index
        long currMin = arr[0];

        //Initialize overall max product
        long maxProd = arr[0];

        //Iterate through the array
        for (int i=1;i < n;i++){
            //Temporary variable to store the maximum
            //product ending at the current index
            long temp = max(arr[i] * 1L ,arr[i] * currMax,arr[i] * currMin);

            //Update the minimum product ending at the current index
            currMin = min(arr[i] * 1L,arr[i] * currMax, arr[i] * currMin);

            //Update the maximum product ending at the current index
            currMax = temp;

            //Update the overall maximum product
            maxProd = Math.max(maxProd,currMax);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int [] arr = {-2,6,-3,-10,0,2};
        System.out.println(maxProduct(arr));
    }
}
