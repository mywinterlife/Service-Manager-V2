package ObjectClasses;

import Enums.OilTypeEnum;
import Enums.ServiceEnum;

//Define, declare and initialize requirements for Vehicles
//Inheritance will play a crucial role with this class.
public class Vehicle
{
    private String make;
    private String model;
    private int wheelCount;
    private OilTypeEnum recommendedOilType;
    private double oilCapacity;

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

    public Vehicle(String make, String model, int wheelCount, OilTypeEnum recommendedOilType, double oilCapacity) {
        this.make = make;
        this.model = model;
        this.wheelCount = wheelCount;
        this.recommendedOilType = recommendedOilType;
        this.oilCapacity = oilCapacity;
    }

    //Getters or superfluous? public ServiceEnum getOilType()?

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public OilTypeEnum getRecommendedOilType() {
        return recommendedOilType;
    }

    public double getOilCapacity() {
        return oilCapacity;
    }

    /*
    public OilTypeEnum getRecommendedOilType()
    {
        return recommendedOilType;
    }



    //Vehicle "getters" for properties?
    public double getOilCapacity()
    {
        return oilCapacity;
    }
    */

}
