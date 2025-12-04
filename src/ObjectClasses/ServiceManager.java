package ObjectClasses;

import Enums.OilTypeEnum;

import java.util.HashMap;

public class ServiceManager
{
    //Rather than ad pricing parameters in oiltypehelper,do it in ServiceManager for now
    int currentRecordId = 99;
    double oilPriceRegular = 5;
    double semiSynthetic = 6;
    double synthetic = 7;
    double tireRotationPrice = 40;

    //Figure out hashmap usage here. Remember dictionaries and key value pairs.
    HashMap<Integer, ServiceRecord> serviceRecords = new HashMap<>();

    // Compute a single id, calculate cost, create a ServiceRecord and store it.
    public void doOilChange(Vehicle vehicle)
    {

        //serviceRecords.put(getNextId(),new ServiceRecord(getNextId(), oilChange, "Completed oil change", cost));
        //Call once so key and record id match, remember dictionary usage key/value pairs.
        double pricePerQuart = getOilPricePerQuart(vehicle.getOilType());
        int quarts = vehicle.getOilQuartsNeeded();
        double cost = pricePerQuart * quarts;

        ServiceRecord record = new ServiceRecord(id, vehicle.getOilType(), "Completed oil change", cost);
        serviceRecords.put(id, record);

    }

    public int getNextId()
    {
        currentRecordId++;   // or: return ++currentRecordId;
        return currentRecordId;
    }

        // Where I have not yet made the oilTypeHelper class implemented, I may have to do price lookup here for now.



    //doTireRotation(Vehicle)
    public void doTireRotation(Vehicle vehicle)
    {

    }

    public double getOilPriceRegular() {
        return oilPriceRegular;
    }

    public double getSemiSynthetic() {
        return semiSynthetic;
    }

    public double getSynthetic() {
        return synthetic;
    }

    //getOilPricePerQuart(OilType)
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



    }
    //getRevenueForTheDay()
    public double getRevenueForTheDay()
    {

        return 0;
    }

    //displayServiceRecords()
}


//public int getNextId()

    // return currentRecordId++;
