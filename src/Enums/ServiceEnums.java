package Enums;

public enum ServiceEnums
{
    //Define what services are offered. oilChange, inspectionEmissions, inspectionSafety, tireRotation
    oilChange("Oil Change: Replace engine oil and filter."),
    inspectionEmissions("Emissions Inspection: Check vehicle emissions system."),
    inspectionSafety("Safety Inspection: Check safety-related components."),
    tireRotation("Tire Rotation: Rotate tires for even wear.");

    private final String description;

    ServiceEnums(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

//         serviceRecords.put(id, record);

