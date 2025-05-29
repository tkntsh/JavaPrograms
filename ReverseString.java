public class ReverseString 
{
    public static void main(String[] args) 
    {
        String original = "Impact";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
