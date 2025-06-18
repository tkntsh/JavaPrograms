public class stringMethod2
{
    public static void main(String[] args)
    {
        String sentence = "Please find this word. Be happy you find it!";
        String trimmedWord = sentence.trim();

        System.out.println("Index 12 and 20: '" + trimmedWord.charAt(12) + "' and '" + trimmedWord.charAt(20) + "'");
    }
}
