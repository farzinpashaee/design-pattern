package creational.prototype;

public class TestRun {

    public static void main(String[] args) {

        TravelPackage t1 = TravelPackageFactory.getPrototype("pakage1");
        t1.setName("1");
        System.out.println( t1 );

        TravelPackage t2 = TravelPackageFactory.getPrototype("pakage1");
        System.out.println( t2 );
    }

}
