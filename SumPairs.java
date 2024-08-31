import java.util.HashSet;

public class SumPairs{
    //Function to check weather any pair exists whose sum is equal to the given target value
    static boolean twoSum(int[] arr,int target)
    {
        //Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();
        //Iterate through each element in the array
        for (int i=0;i< arr.length;i++)
        {
            //Calculate the complement that added to arr[i], equals the target
            int complement=target-arr[i];
            //check if the complement exists in the set
            if(set.contains(complement)){
                return true;
            }
            //Add the current element to the set
            set.add(arr[i]);
        }
        //if no pair is found
        return false;
    }
    public static void main(String[] args) {
        int [] arr={0,-1,2,-3,1};
        int target = -2;
        //Call the twoSum function and print the result
        System.out.println(twoSum(arr,target));
    }
}


//liner time complexity i.e O(n)