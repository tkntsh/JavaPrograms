public class stringMethod7
{
    public static void main(String[] args)
    {
        String sentence = "Don't Worry. Be happy!";
        String words[] = sentence.split(" ");

        for(String word : words)
        {
            System.out.println(word);
        }
    }
}
