public class SalesTracker 
{
    public static double calculateTotalSales(double[] transactions) 
    {
        double sum = 0.0;
        for (double transaction : transactions) 
        {
            sum += transaction;
        }
        return sum;
    }
}
