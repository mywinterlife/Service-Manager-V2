package ObjectClasses;

import Enums.OilTypeEnum;

//Define, declare and initialize requirements for Vehicles
//Inheritance will play a crucial role with this class.
public class Vehicle
{
    String make;
    String model;
    int wheelCount;
    OilTypeEnum recommendedOilType;
    double oilCapacity;

    //Write an explicit constructor
    //Add all required properties as parameters
    //Assign local values to class properties!!! This initializes them with base values.
    public Vehicle(String make, String model, OilTypeEnum recommendedOilType, double oilCapacity, int wheelCount)
    {
        this.make = make;
        this.model = model;
        this.recommendedOilType = recommendedOilType;
        this.oilCapacity = oilCapacity;
        this.wheelCount = wheelCount;
    }
}
