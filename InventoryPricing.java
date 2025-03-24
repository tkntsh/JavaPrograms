public class InventoryPricing 
{
    public double calculateTotalWithMarkup(double[] prices) 
    {
        double total = 0;
        for(double price : prices) 
        {
            total += price;
        }
        if(total > 500) 
        {
            //apply 20% markup
            total *= 1.20; 
        }
        return total;
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryPricingTest 
{
    private final InventoryPricing pricing = new InventoryPricing();

    @Test
    public void testBelowThreshold() 
    {
        //total: R350.00
        double[] prices = {200.00, 150.00};
        assertEquals(350.00, pricing.calculateTotalWithMarkup(prices), "Expected R350.00");
    }

    @Test
    public void testAboveThreshold() 
    {
        //total: R550.00
        double[] prices = {300.00, 250.00}; 
        assertEquals(660.00, pricing.calculateTotalWithMarkup(prices), "Expected R660.00");
    }

    @Test
    public void testEmptyArray() 
    {
        double[] prices = {};
        assertEquals(0.00, pricing.calculateTotalWithMarkup(prices), "Expected R0.00");
    }

    @Test
    public void testNegativePrices() {
        double[] prices = {-100.00, 300.00}; // Total: R200.00
        assertEquals(200.00, pricing.calculateTotalWithMarkup(prices), "Expected R200.00");
    }
}
