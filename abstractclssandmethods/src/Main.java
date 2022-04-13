
//acheiving abstraction using abstract class


abstract class Vehicle
{
    public abstract void engine();
}
class Car extends Vehicle {

    public void engine()
    {
        System.out.println("Car engine");

    }

    public static void main(String[] args)
    {
        Vehicle v = new Car();
        v.engine();
    }
}








