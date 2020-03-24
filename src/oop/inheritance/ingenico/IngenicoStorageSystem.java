package oop.inheritance.ingenico;

import java.util.Properties;

public class IngenicoStorageSystem {
    private static IngenicoStorageSystem instance;

    private IngenicoStorageSystem(){
    }

    public static IngenicoStorageSystem getInstance(){
        if(instance==null){
            instance=new IngenicoStorageSystem();
        }
        return instance;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
