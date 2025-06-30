import java.util.Arrays;

public class math1
{
    public static void main(String[] args)
    {
        //creating array of numbers
        int[] var = {50, 56, -30, 99, 8, -200};
        //creating and storing min value in array
        int min = Arrays.stream(var).min().getAsInt();

        //printing array
        System.out.println("Min number in array: " + min);
    }
}
