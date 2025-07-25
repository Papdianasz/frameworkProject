package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaders {
    public static String read(String key) {
        return read(key, Constants.CONFIG_FILE_PATH);
    }

    public static String read(String key, String path) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(path)) {
            properties.load(fis);
            return properties.getProperty(key); // May return null if key is not found
        } catch (IOException e) {
            e.printStackTrace(); // Consider logging instead for production use
        }
        return null;
    }
}
