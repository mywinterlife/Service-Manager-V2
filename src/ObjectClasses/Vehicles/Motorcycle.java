package ObjectClasses.Vehicles;

import Enums.OilTypeEnum;

public class Motorcycle extends Vehicle
{
    private int passengerCount = 2;
    public int wheelCount = 2;

    //Similar to Vehicle:
    //Write an explicit constructor
    //Add all required properties as parameters
    //Assign local values to class properties!!! This initializes them with base values.
    public Motorcycle(String make, String model, OilTypeEnum recommendedOilType, double oilCapacity, int passengerCount)
    {
        super(make, model, recommendedOilType,oilCapacity,2);
        this.passengerCount = passengerCount;
    }
}
