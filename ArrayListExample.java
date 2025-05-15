import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        //creating ArrayList to store fruit names
        ArrayList<String> fruits = new ArrayList<>();
        
        //adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        //retrieving elements using a for-each loop
        for(String fruit : fruits) 
        {
            System.out.println(fruit);
        }

        //accessing specific element by index (Output = Apple)
        System.out.println("First fruit: " + fruits.get(0));

        //removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
