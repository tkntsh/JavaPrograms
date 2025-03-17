public class deliveryFeeCalculator 
{
    public static double calculateFee(double weight, double distance) 
    {
        //base fee in ZAR
        double fee = 50.00; 
        
        if(weight > 5) 
        {
            double extraKilograms = Math.floor(weight - 5);
            //add R10 per extra kg
            fee += 10 * extraKilograms;
        }
        
        if(distance > 10) 
        {
            double extraKilometers = Math.floor(distance - 10);
            //add R5 extra km
            fee += 5 * extraKilometers;
        }
        return fee;
    }
}
