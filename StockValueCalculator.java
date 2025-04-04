public class StockValueCalculator 
{
    public static double calculateStockValue(double[] unitPrices, int[] quantities) 
    {
        double totalValue = 0.0;
        for(int i = 0; i < unitPrices.length; i++) 
        {
            totalValue += unitPrices[i] * quantities[i];
        }
        return totalValue;
    }
}
