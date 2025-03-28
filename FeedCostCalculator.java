public class FeedCostCalculator 
{ 
  /*
  Calculates the total cost of feed.
  @param
  kilograms the weight of the feed in kilograms
  @param
  pricePerKilogram the price per kilogram in ZAR
  @return
  the total cost in ZAR
  */
  public double calculateTotalCost(int kilograms, double pricePerKilogram) 
  {
    if(kilograms <= 0) 
    {
      return 0.0;
    } 
    double baseCost = kilograms * pricePerKilogram;
    baseCost = applyBulkDiscount(baseCost, kilograms);
    baseCost = applyDeliveryFee(baseCost); return baseCost;

 } 
 /*Applies a bulk discount if the purchase is over 100 kg.
 @param
   cost the initial cost
 @param
   kilograms the weight of the feed in kilograms
 @return
   the cost after applying the bulk discount
  */
  private double applyBulkDiscount(double cost, int kilograms) 
  {
    if(kilograms > 100) 
    {
      // Apply a 15% discount for bulk purchases
      return cost * 0.85;
    }
    return cost;
  }

 /**Applies a delivery fee if the cost exceeds R500.00.

@param
 cost the cost after any discounts
@return
 the cost after applying the delivery fee
  */
  private double applyDeliveryFee(double cost) 
  {
    if (cost > 500) 
    {
    // Add a R25.00 delivery fee
      return cost + 25.00;
    }
    return cost;
  }
}
