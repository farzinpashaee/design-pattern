package creational.prototype;

import java.math.BigDecimal;
import java.util.HashMap;

public class TravelPackageFactory {

    public static HashMap<String, TravelPackage> packageCache = new HashMap<>();
    static {
        // expensive class preparation from db
        TravelPackage travelPackage = new TravelPackage();
        travelPackage.setFlight(new Flight("AirFrance",new BigDecimal(250)));
        travelPackage.setHotel(new Hotel("Hilton",new BigDecimal(400),5));
        packageCache.put("pakage1",travelPackage);
    }

    public static TravelPackage getPrototype( String type ){
        try {
            return packageCache.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }

}
