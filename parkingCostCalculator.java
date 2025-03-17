public class parkingCostCalculator 
{
    public static double calculateCost(int hours, boolean hasDiscount) 
    {
        double cost = 0;
        
        if(hours <= 3) 
        {
            //base rate of R15.00 per hour
            cost = hours * 15.00; 
        } 
        else 
        {
            //R15.00 for first 3 hours
            //R10.00 for additional hours
            cost = (3 * 15.00) + ((hours - 3) * 10.00); 
        }
        
        if(hasDiscount) 
        {
            //20% discount, rounded down
            cost = Math.floor(cost * 0.80);
        }
        
        return cost;
    }
}
