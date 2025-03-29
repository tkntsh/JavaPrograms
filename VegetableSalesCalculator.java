public class VegetableSalesCalculator 
{
    public double calculateTotalSales(int quantityKg, double pricePerKg) 
    {
        double total = quantityKg * pricePerKg;
        if (quantityKg >= 10) 
        {
            //10% disocunt for bulk sales
            total = total * 0.9; 
        }
        return total;
    }
}
