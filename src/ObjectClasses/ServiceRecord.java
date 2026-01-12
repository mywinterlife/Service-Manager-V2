package ObjectClasses;

import Enums.ServiceEnums;

import java.time.LocalDateTime;

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
    ServiceEnums service;
    String notes;
    LocalDateTime serviceDate;
    double totalCost;

    //Create Constructor for ServiceRecord. Similar to car/truck/vehicle add
    public ServiceRecord(int id, ServiceEnums service, String notes, double totalCost)
    {
        this.id = id;
        this.service = service;
        this.notes = notes;

        //Create service date as now. Dont pass it in as parameter because its always now for a new record.
        this.serviceDate = LocalDateTime.now();
        this.totalCost = totalCost;
    }
}
