
package ExecutableClasses;
import ObjectClasses.ServiceRecord;
import ObjectClasses.Vehicle;
import java.util.HashMap;


public class Main
{
    
        //Rather than ad pricing parameters in oiltypehelper,do it in ServiceManager for now
        int currentRecordId = 99;
        double oilPriceRegular = 5;
        double semiSynthetic = 6;
        double synthetic = 7;
        double tireRotationPrice = 40;
        HashMap<Integer, ServiceRecord> serviceRecords = new HashMap<>();

        public void doOilChange(Vehicle vehicle)
        {

            //serviceRecords.put(getNextId(),new ServiceRecord(getNextId(), oilChange, "Did oil change", cost));
        }

        public int getNextId()
        {
            return currentRecordId++;
        }
        //doTireRotation(Vehicle)
        //getOilPricePerQuart(OilType)
        //getRevenueForTheDay()
        //displayServiceRecords()
}
