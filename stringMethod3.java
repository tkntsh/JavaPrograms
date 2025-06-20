public class stringMethod3
{
    public static void main(String[] args)
    {
        String sentence = "Please find this word. Be happy you find it!";
        int wordFind = sentence.lastIndexOf("find");

        System.out.println("The word find appears in index: " + wordFind);
    }
}
