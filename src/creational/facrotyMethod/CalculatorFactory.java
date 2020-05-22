package creational.facrotyMethod;

public class CalculatorFactory {

    public static ValueCalculatorInterface getCalculator( ProductType productType ){
        if( productType == ProductType.SHARE)
            return new ShareValueCalculator();
        else if (productType == ProductType.RETAIL_BOND)
            return new RetailBondCalculator();
        else
            return null;
    }

}
