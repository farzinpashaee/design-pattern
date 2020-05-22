package creational.facrotyMethod;

import java.math.BigDecimal;

public class ShareValueCalculator implements ValueCalculatorInterface {

    @Override
    public BigDecimal calculateValue( int unit , short type ) {
        return new BigDecimal( unit * 1000 );
    }
}
