import java.util.*;
//Program to find duplicates in array in java by using HashMap

public class FindDuplicates {
    public static List<Integer> duplicates(long[] arr){
        //Create an empty hashmap to store element frequencies
        Map<Long,Integer>freqMap = new HashMap<>();
        List<Integer>result = new ArrayList<>();

        //Iterate through the array and count element frequencies
        for (long num:arr){
            freqMap.put(num, freqMap.getOrDefault(num,0) + 1);
        }

        //Iterate through the hashmap to find duplicates
        for(Map.Entry<Long,Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > 1) {
                result.add(Math.toIntExact(entry.getKey()));
            }
        }

        //If no duplicates found, add -1 to the result
        if (result.isEmpty()){
            result.add(-1);
        }
        //Sort the result
        Collections.sort(result);

        //Return the result list containing duplicate elements or  -1
        return result;


    }


    public static void main(String[] args) {
        long[] a={1,6,5,2,3,3,2};
        List<Integer>duplicatesFound=duplicates(a);

        System.out.print("Duplicate elements: ");
        for (int element : duplicatesFound){
            System.out.print(element + " ");
        }
        System.out.println();
    }


}

//Time complexity: O(n log n)
//Space Complexity: O(n)
