package by.bsu.calculator.parse;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by cplus on 22.10.2017.
 */
public class ParseExpressionText {
    private static final int FIRST_VALUE = 0;
    private static final int SECOND_VALUE = 1;

    @Test
    public void getValuesFromExpressionTest() {
        Assert.assertEquals(1, ParseExpression.getValuesFromExpression("1*3.7")[FIRST_VALUE], 0.001);
        Assert.assertEquals(3.45, ParseExpression.getValuesFromExpression("3.45*3.09")[FIRST_VALUE], 0.001);
        Assert.assertEquals(9.789, ParseExpression.getValuesFromExpression("9.789-6.5")[FIRST_VALUE], 0.001);
        Assert.assertEquals(0, ParseExpression.getValuesFromExpression("0+43")[FIRST_VALUE], 0.001);
        Assert.assertEquals(0.12, ParseExpression.getValuesFromExpression("0.12/903")[FIRST_VALUE], 0.001);

        Assert.assertEquals(903, ParseExpression.getValuesFromExpression("0.12/903")[SECOND_VALUE], 0.001);
        Assert.assertEquals(0.78, ParseExpression.getValuesFromExpression("0.12/0.78")[SECOND_VALUE], 0.001);
        Assert.assertEquals(0, ParseExpression.getValuesFromExpression("0.12/0")[SECOND_VALUE], 0.001);
        Assert.assertEquals(458.342, ParseExpression.getValuesFromExpression("0.12/458.342")[SECOND_VALUE], 0.001);
        Assert.assertEquals(12.001, ParseExpression.getValuesFromExpression("0.12/12.001")[SECOND_VALUE], 0.001);

        Assert.assertArrayEquals(new double[]{1, 3}, ParseExpression.getValuesFromExpression("1+3"), 0.001);
        Assert.assertArrayEquals(new double[]{1.009, 34.23}, ParseExpression.getValuesFromExpression("1.009/34.23"), 0.001);
        Assert.assertArrayEquals(new double[]{234.940, 0}, ParseExpression.getValuesFromExpression("234.94-0"), 0.001);
        Assert.assertArrayEquals(new double[]{0, 34}, ParseExpression.getValuesFromExpression("0*34"), 0.001);
        Assert.assertArrayEquals(new double[]{0.0, 0}, ParseExpression.getValuesFromExpression("0-0"), 0.001);
    }

    @Test
    public void getSignFromExpressionTest() {
        Assert.assertEquals('+', ParseExpression.getSignFromExpression("11+2"));
        Assert.assertEquals('+', ParseExpression.getSignFromExpression("234.231+540.21431"));

        Assert.assertEquals('-', ParseExpression.getSignFromExpression("123.2-0.9"));
        Assert.assertEquals('-', ParseExpression.getSignFromExpression("98-109"));

        Assert.assertEquals('*', ParseExpression.getSignFromExpression("23.3*9"));
        Assert.assertEquals('*', ParseExpression.getSignFromExpression("0*32.3"));

        Assert.assertEquals('/', ParseExpression.getSignFromExpression("45/321"));
        Assert.assertEquals('/', ParseExpression.getSignFromExpression("0.0/345.1"));
    }

}
