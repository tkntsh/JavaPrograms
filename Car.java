public class Car 
{
    //encapsulation, private fields to protect data
    private String brand;
    private String model;
    private int year;

    //constructor, initializes the Car object with specific values
    public Car(String brand, String model, int year) 
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //getter for brand
    public String getBrand() 
    {
        return brand;
    }

    //setter for brand
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    //getter for model
    public String getModel() 
    {
        return model;
    }

    //setter for model
    public void setModel(String model) 
    {
        this.model = model;
    }

    //getter for year
    public int getYear() 
    {
        return year;
    }

    //setter for year
    public void setYear(int year) 
    {
        this.year = year;
    }

    //displaying car details
    public void displayCarDetails() 
    {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }

    //main method
    public static void main(String[] args) 
    {
        //creating an object of Car
        Car myCar = new Car("Toyota", "Corolla", 2021);

        //accessing object properties via methods
        System.out.println("Brand: " + myCar.getBrand());
        myCar.displayCarDetails();

        //modifying properties
        myCar.setModel("Camry");
        System.out.println("Updated model: " + myCar.getModel());
    }
}
