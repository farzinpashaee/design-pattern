package behavioural.chainOfResponsibility;

public class TestRun {

    public static void main(String[] args) {

        ServerApplication serverApplication = new ServerApplication();
        serverApplication.processRequest(new Request("X","/test"));

    }

}
