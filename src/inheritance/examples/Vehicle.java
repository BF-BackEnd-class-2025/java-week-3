package inheritance.examples;


// Superclass
public class Vehicle
{
    protected String brand;

    public Vehicle(String brand)
    {
        this.brand = brand;
    }

    public void drive() {
        System.out.println(brand + " is driving...");
    }
}
