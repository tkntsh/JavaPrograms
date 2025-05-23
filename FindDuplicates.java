import java.util.HashSet;

public class FindDuplicates 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : numbers) 
        {
            if(!seen.add(num)) 
            {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
