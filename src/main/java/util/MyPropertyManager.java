package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyPropertyManager {
    private final Properties properties;
    public static final String PATH_CONFIG = "src/main/resources/config.properties";
    public static final String PATH_USER_DATA = "src/main/resources/userData.csv";


    public MyPropertyManager(String pathToFile) {
        properties = new Properties();
        try {
            FileReader reader = new FileReader(pathToFile);
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }


}
