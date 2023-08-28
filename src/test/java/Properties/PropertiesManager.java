package Properties;

import java.io.*;
import java.util.Properties;

public class PropertiesManager {
    private final Properties properties;
    private final String fileName;

    public PropertiesManager(String fileName) {
        this.fileName = fileName;
        properties = new Properties();
    }

    public void loadProperties() {
        try (InputStream input = new FileInputStream(fileName)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    public void setPropertyInt(String key, int value) {
        properties.setProperty(key, Integer.toString(value));
    }

    public void saveProperties() {
        try (OutputStream output = new FileOutputStream(fileName)) {
            properties.store(output, "New Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


