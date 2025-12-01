package ObjectClasses;

import Enums.OilTypeEnum;

public class Truck extends Vehicle
{
    int towingCapacity;

    //Similar to Car/Vehicle:
    //Write an explicit constructor
    //Add all required properties as parameters
    //Assign local values to class properties!!! This initializes them with base values.

    public  Truck(String make, String model, OilTypeEnum recommendedOilType, double oilCapacity, int towingCapacity)
    {
        super(make,model,recommendedOilType,oilCapacity, 4);
        this.towingCapacity = towingCapacity;
    }
}
