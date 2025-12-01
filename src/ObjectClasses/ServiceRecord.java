package ObjectClasses;

import Enums.ServiceEnum;

import java.time.LocalDateTime;
import java.util.Locale;

public class ServiceRecord
{

    //Define, declare and initialize requirements for ServiceRecord.
    //Inheritance will *NOT* play a crucial role with this class.
    //Similar to Car/Vehicle/Truck:
    //Write an explicit constructor.
    //Add all required properties as parameters.
    //Assign local values to class properties!!! This initializes them with base values.
    //If inheriting then super.
    //If not extending another class then this.<>property> = <property name>; for each property.

    int id;
    ServiceEnum service;
    String notes;
    LocalDateTime serviceDate;
    double totalCost;

    public ServiceRecord(int id, ServiceEnum service, String notes, double totalCost)
    {
        this.id = id;
        this.service = service;
        this.notes = notes;
        this.serviceDate = LocalDateTime.now();
        this.totalCost = totalCost;
    }
}
