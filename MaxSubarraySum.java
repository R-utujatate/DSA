public class MaxSubarraySum {
    static int maxSubarraySum(int []a){
        int maxSoFar = Integer.MIN_VALUE,maxEindingHere = 0;
        for (int i=0;i < a.length;i++){
            maxEindingHere += a[i];

            //use Math.max to find the maximum
            //of maxSoFar and maxEndingHere
            maxSoFar = Math.max(maxSoFar,maxEindingHere);
            //Use Math.max to reset maxEndingHere
            //to 0 if it becomes negative
            maxEindingHere = Math.max(maxEindingHere , 0);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int [] a={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum contiguous sum is "+maxSubarraySum(a));
    }
}
