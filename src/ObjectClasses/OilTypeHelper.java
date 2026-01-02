package ObjectClasses;

import Enums.OilTypeEnum;

public class OilTypeHelper
{

    //public static String getOilTypeDescription()
    public static String getOilTypeDescription(OilTypeEnum oilType)
    {
        if (oilType == null)
        {
            return "Unknown oil type.";
        }

        switch (oilType)
        {
            case regular:
                return "Regular: conventional mineral-based oil. Budget friendly and suitable for older engines or standard driving conditions.";
            case semiSynthetic:
                return "SemiSynthetic: a blend of conventional and synthetic oils offering improved protection and longer drain intervals than regular oil.";
            case synthetic:
                return "Synthetic: full synthetic oil providing the best protection, stability at extreme temperatures, and longer service life.";
            default:
                return "Unknown oil type.";
        }
    }


}
