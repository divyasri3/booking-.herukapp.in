package FrameWorkConstants;

import Properties.PropertiesManager;

public class Authentication_Constants {

    public static String auth_Constant() {
        PropertiesManager propertiesManager = new PropertiesManager(FilePath_Constants.getResponseJsonPath() + "Authentication");
        propertiesManager.loadProperties();
        String value = propertiesManager.getProperty("generated_Token");
        return value;
    }

}
