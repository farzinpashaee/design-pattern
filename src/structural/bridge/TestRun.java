package structural.bridge;

public class TestRun {

    public static void main(String[] args) {

        OnlineServices onlineServices = new InternetBankingServices( new CurrentAccountService() );
        onlineServices.payBill("12345","11111");

    }
}
