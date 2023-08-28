//package Properties;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//public class PropWrite {
//
//
//    private static Map<String,String> map= new HashMap<>();
//public static void writering(String keyk, String valuek) {
//    Properties properties1 = new Properties();
//    try (FileOutputStream fileOutputStream = new FileOutputStream("G:\\api project storage\\herukapp\\src\\test\\resources\\config.properties")) {
//        // FileOutputStream fileOutputStream = new FileOutputStream("G:\\api project storage\\herukapp\\src\\test\\resources\\config.properties");
//        properties1.store(fileOutputStream, "Updated API Configuration");
//        fileOutputStream.close();
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    for (Map.Entry<Object, Object> temp : properties1.entrySet()) {
//
//        String keyk = String.valueOf(temp.getKey());
//        String valuek = String.valueOf(temp.getValue());
//        map.put(key, value);
//        properties1.setProperty()
//}
//   properties1.
//    }
//
//
//
//}