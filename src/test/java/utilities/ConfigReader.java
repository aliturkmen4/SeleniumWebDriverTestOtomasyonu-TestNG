package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties; //her yerden erişilebilsin diye static!
    static {
        String dosyaYolu="configuration.properties"; //ilk önce bu çalışsın diye static!
        try{
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream); //fileInputStream deki bilgileri config reader a atıyor!
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){

       return properties.getProperty(key);
    }
}
