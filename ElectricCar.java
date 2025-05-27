public class ElectricCar extends Car 
{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int year, int batteryCapacity) 
    {
        //reuse constructor of Car object
        super(brand, model, year);
        //updating the Car object
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() 
    {
        return batteryCapacity;
    }
}
