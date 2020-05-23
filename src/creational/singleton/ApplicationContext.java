package creational.singleton;

import java.util.HashMap;

public class ApplicationContext {

    private String applicationName = "App";
    private HashMap<String,String> properties = new HashMap<>();

    private static ApplicationContext applicationContext;

    private ApplicationContext(){}

    public static synchronized ApplicationContext getContext(){
        if(applicationContext == null)
            applicationContext = new ApplicationContext();
        return applicationContext;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getProperties(String key) {
        return properties.get(key);
    }

    public void setProperties(String key, String value){
        properties.put(key,value);
    }
}
