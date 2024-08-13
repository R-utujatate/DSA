import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //Create a TreeMap
        TreeMap<String,Integer> scores= new TreeMap<>();

        //Insert key-value pairs into the TreeMap
        scores.put("Charlie",90);
        scores.put("David",87);
        scores.put("Alice",90);
        scores.put("Bob",60);
        scores.put("Eve",70);

        //Access and print values from the TreeMap
        System.out.println("Score of Alice: "+scores.get("Charlie"));
        System.out.println("Score of David: "+scores.get("David"));

        //Update a value in the TreeMap
        scores.put("Bob",75);

        //Remove a key-value pair from the TreeMap
        scores.remove("Eve");

        //Iterate through the TreeMap using a for-each loop
        System.out.println("Scores in the TreeMap:");
        for (String name:scores.keySet())
        {
            int score= scores.get(name);
            System.out.println(name+ ":" +score);
        }
    }
}
