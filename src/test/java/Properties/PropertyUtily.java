package Properties;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyUtily {

    private static final Properties properties = new Properties();
    private static final Map<String, String> map = new HashMap<>();

    static {
        try (FileInputStream reader = new FileInputStream("G:\\api project storage\\herukapp\\src\\test\\resources\\config.properties")) {
            properties.load(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
            System.exit(0);


        }


        for (Map.Entry<Object, Object> temp : properties.entrySet()) {

            String key = String.valueOf(temp.getKey());
            String value = String.valueOf(temp.getValue());
            map.put(key, value);

        }
    }

    public static String getValue(String key) {

        return map.get(key);
    }

}






