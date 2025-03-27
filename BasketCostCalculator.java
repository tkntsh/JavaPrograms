/**
 * A utility class to calculate the total cost of items in a shopping basket,
 * applying discounts and service fees based on quantity and total cost thresholds.
 */
public class BasketCostCalculator 
{    
    /**
     * Computes the total cost for a specified quantity of items at a given price per item.
     * Applies a 10% discount if quantity exceeds 10 and adds a R5.00 service fee if the
     * total exceeds R100.00. Returns R0.00 for non-positive quantities.
     *
     * @param quantity the number of items in the basket
     * @param price the cost per item in ZAR
     * @return the total cost in ZAR as a double
     */
    public double calculateTotalCost(int quantity, double price) 
    {
        if(quantity <= 0) 
        {
            //handle invalid or zero quantities
            return 0.00; 
        }
        //base cost calculation
        double totalCost = quantity * price; 

        if(quantity > 10) 
        {
            //apply 10% discount
            totalCost *= 0.9;
        }

        if(totalCost > 100.00) 
        {
            //add R5.00 service fee
            totalCost += 5.00; 
        }
        return totalCost;
    }
}
