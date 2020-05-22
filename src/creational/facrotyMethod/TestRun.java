package creational.facrotyMethod;

import java.math.BigDecimal;

public class TestRun
{
    public static void main(String[] args) {

        BigDecimal res = CalculatorFactory.getCalculator(ProductType.RETAIL_BOND).calculateValue(56,(short) 2);
        System.out.println(res);

    }
}
