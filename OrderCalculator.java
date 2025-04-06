public class OrderCalculator 
{
    public static double getTotal(double prices[], int qty[]) 
    {
        double total = 0;
        for(int i=0; i<prices.length; i++) 
        {
            total = total + (prices[i]*qty[i]);
        }
        return total;
    }
}
