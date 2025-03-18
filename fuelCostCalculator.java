public class FuelCostCalculator 
{
    public static double calculateFuelCost(int distanceKm, boolean isEfficient) 
    {
        double cost = 0;
        if(distanceKm <= 50) 
        {
            //base rate = R2.50 per km
            cost = distanceKm * 2.50;
        } 
        else 
        {
            //additional rate = R1.80 per km
            cost = (50 * 2.50) + ((distanceKm - 50) * 1.80);
        }
        if(isEfficient) 
        {
            //fuel efficiency discount, rounded
            cost = Math.round((cost * 0.9) * 100.0) / 100.0; 
        }
        return cost;
    }
}
