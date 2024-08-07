import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        //Create a HashMap to store String keys and Integer values
        HashMap<String,Integer> hashMap = new HashMap<>();

        //Add key-value pairs to the HashMap
        hashMap.put("John",25);
        hashMap.put("Stephan",24);
        hashMap.put("Alice",30);
        hashMap.put("Bob",27);

        //Access and print values based on keys
        System.out.println("Age of Alice -> "+hashMap.get("Alice"));
        System.out.println("Age of John ->"+hashMap.get("John"));

        //Check if the HashMap contains specified value
        System.out.println(hashMap.containsValue(27));
        //Check if the HashMap contains specified key
        System.out.println("Is Bob present?"+hashMap.containsKey("Bob"));

        //Update the value associated with a key
        System.out.println("Updated value of Alice"+hashMap.put("Alice",32));

        //Remove a key-value pair from the HashMap
        hashMap.remove("John");

        //Print all key-value pairs in the HashMap
        System.out.println("Key-Value pairs in the HashMap:");
        for (String key: hashMap.keySet())
        {
            System.out.println(key+":"+hashMap.get(key));
        }

        //Check the size of the HashMap
        System.out.println("Size of the HashMap:"+hashMap.size());

    }
}
