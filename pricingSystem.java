public class pricingSystem
{
    //method using parameters to keep track of item amounts
    public static double printPrice(int beers, int colas, int sandwiches)
    {
        //objects needed
        double beer = 1;
        double cola = 0.50;
        double sandwich = 1.50;
        double totalPrice = beer*beers + cola*colas + sandwich*sandwiches;

        //returning total price
        return totalPrice;
    }

    public static void main(String[] args)
    {
        //objects to handle item amounts
        int beers = 2;
        int cola = 1;
        int sandwich = 1;

        System.out.println("The total price for 2x beers, 1x cola, 1x sandwich: £" + printPrice(beers, cola, sandwich));
    }
}
