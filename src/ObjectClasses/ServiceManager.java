package ObjectClasses;
import Enums.OilTypeEnum;
import Enums.ServiceEnums;
import ObjectClasses.Vehicles.Vehicle;

import java.util.HashMap;

public class ServiceManager
{
    int currentRecordId = 99;
    double oilPriceRegular = 5;
    double semiSynthetic = 6;
    double synthetic = 7;
    double tireRotationPrice = 40;

    //Figure out hashmap usage here. Remember dictionaries and key value pairs.
    HashMap<Integer, ServiceRecord> serviceRecords = new HashMap<>();

    public int getNextIdIncrementNumber()
    {
        currentRecordId++;
        return currentRecordId;
    }

    public double getOilPricePerQuart(OilTypeEnum oiltype)
    {
        switch (oiltype)
        {
            case regular:
                return oilPriceRegular;
            case semiSynthetic:
                return semiSynthetic;
            case synthetic:
                return synthetic;
            default:
                throw new IllegalStateException("Unexpected value: " + oiltype);
        }
        //Close this method before moving on! Think about return types!
    }
    // Compute a single id, calculate cost, create a ServiceRecord and store it.
    public void performService(Vehicle vehicle, ServiceEnums serviceType)
    {
        int id = getNextIdIncrementNumber();
        double cost;
        String notes;

        switch (serviceType) {
            case oilChange:
                double pricePerQuart = getOilPricePerQuart(vehicle.getRecommendedOilType());
                double quarts = vehicle.getOilCapacity();
                cost = pricePerQuart * quarts;
                notes = "Completed oil change";
                break;
            case tireRotation:
                cost = tireRotationPrice;
                notes = "Completed tire rotation";
                break;
            default:
                throw new IllegalArgumentException("Unknown service type");
        }

        ServiceRecord record = new ServiceRecord(id, serviceType, notes, cost);
        serviceRecords.put(id, record);
    }
}