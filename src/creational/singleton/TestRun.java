package creational.singleton;

public class TestRun {

    public static void main(String[] args) {

        ApplicationContext app = ApplicationContext.getContext();

        System.out.println(app.getApplicationName());
        app.setProperties("p1","value1");

        System.out.println(ApplicationContext.getContext().getProperties("p1"));

    }
}
