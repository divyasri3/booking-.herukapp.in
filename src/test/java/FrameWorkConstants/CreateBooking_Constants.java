package FrameWorkConstants;

import Properties.PropertiesManager;

public class CreateBooking_Constants {
    public static String id() {


        PropertiesManager propertiesManager = new PropertiesManager(FilePath_Constants.getResponseJsonPath() + "Id.properyies");
        propertiesManager.loadProperties();
        String value = propertiesManager.getProperty("id");
        return value;
    }
}
