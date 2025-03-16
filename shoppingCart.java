public class shoppingCart 
{
    public static void main(String[] args) 
    {
        //prices in ZAR excluding VAT
        double[] prices = {45.50, 60.25, 20.75}; 
        double total = 0;
      
        for(int counter = 1; counter <= prices.length; counter++) 
        {
            //adjust for 0-based index
            total += prices[counter - 1];
        }

        double discount = 0;
        if(total > 100) 
        {
            //10% of subtotal
            discount = total * 0.10;
            total -= discount;
        }

        double vat = 0.15;
        //adding 15% VAT to discounted total
        total = total + (total * vat);
        System.out.printf("Discounted total: R%.2f", total);
    }
}
