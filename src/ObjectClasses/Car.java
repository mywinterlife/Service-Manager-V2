package ObjectClasses;
import Enums.OilTypeEnum;

public class Car extends Vehicle
{
    int passengerCount;

    //Similar to Vehicle:
    //Write an explicit constructor
    //Add all required properties as parameters
    //Assign local values to class properties!!! This initializes them with base values.
    public Car(String make, String model, OilTypeEnum recommendedOilType, double oilCapacity, int passengerCount)
    {
        super(make, model, recommendedOilType,oilCapacity,4);
        this.passengerCount = passengerCount;
    }













}
