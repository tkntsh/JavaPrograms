public class InventoryValue 
{
    public static void main(String[] args) 
    {
        //item prices in ZAR
        double[] prices = {125.50, 89.99, 450.00};
        //quantities of each item
        int[] quantities = {10, 5, 2};
        
        double totalValue = calculateStockValue(prices, quantities);
        //formating output as South African Rand
        System.out.printf("Total stock value: R%.2f%n", totalValue);
    }

    public static double calculateStockValue(double[] prices, int[] quantities) 
    {
        //initializing total
        double total = 0.0;
        for(int i = 0; i < prices.length; i++) 
        {
            //accumulate price x quantity
            total += prices[i] * quantities[i];
        }
        return total;
    }
}
