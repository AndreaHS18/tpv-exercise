package oop.inheritance.verifone.v240m;

import java.util.Properties;

public class VerifoneV240mStorageSystem {
    private static VerifoneV240mStorageSystem instance;

    private VerifoneV240mStorageSystem(){
    }

    public static VerifoneV240mStorageSystem getInstance(){
        if(instance==null){
            instance=new VerifoneV240mStorageSystem();
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
