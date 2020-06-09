package behavioural.command;

import java.math.BigDecimal;

public class TaxProcessCommand extends OrderCommand {

    public TaxProcessCommand(Order order){
        super(order);
    }

    @Override
    public void execute() {
        BigDecimal totalAmount = this.order.getProducts().stream().map(product -> product.getPrice()).reduce(BigDecimal::add).get();
        order.setTax(totalAmount.multiply(new BigDecimal(0.15)));
    }
}
