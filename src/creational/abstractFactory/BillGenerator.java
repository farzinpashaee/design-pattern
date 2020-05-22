package creational.abstractFactory;

public class BillGenerator {

    CostCalculatorFactory costCalculatorFactory;

    public BillGenerator( CostCalculatorFactory costCalculatorFactory ){
        this.costCalculatorFactory = costCalculatorFactory;
    }

    public String prepareBill( int w, int d){
        return "by air transport: " + costCalculatorFactory.getAirTransportCost().cost(w,d)
                + " by road transport: " + costCalculatorFactory.getRoadTransport().cost(w,d);
    }

}
