public class MaizeCostCalculator 
{
    public double calculateTotalCost(int bagsSold, double pricePerBag) 
    {
        if(bagsSold < 0 || pricePerBag < 0) 
        {
            throw new IllegalArgumentException("Bags sold and price per bag must be non-negative.");
        }
        double totalCost = bagsSold * pricePerBag;
        return Math.round(totalCost * 100.0) / 100.0;
    }
}
