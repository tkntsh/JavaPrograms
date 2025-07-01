import java.util.Arrays;

public class math2
{
    public static void main(String[] args)
    {
        //creating array of numbers
        int[] varArray = {50, 56, -30, 99, 8, -200};
        //creating and storing min value in array
        int max = Arrays.stream(varArray).max().getAsInt();

        //printing array
        System.out.println("Min number in array: " + max);
    }
}
