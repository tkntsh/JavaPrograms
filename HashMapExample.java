import java.util.HashMap;

public class HashMapExample 
{
    public static void main(String[] args) 
    {
        //creating HashMap to store names and ages
        HashMap<String, Integer> ages = new HashMap<>();

        //adding key-value pairs
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 22);

        //retrieving value by key (output = 25)
        System.out.println("Alice's age: " + ages.get("Alice"));

        //iterating through HashMap
        for(String name : ages.keySet()) 
        {
            System.out.println(name + " is " + ages.get(name) + " years old");
        }

        //removing an entry by key
        ages.remove("Charlie");
        System.out.println("After removal: " + ages);
    }
}
