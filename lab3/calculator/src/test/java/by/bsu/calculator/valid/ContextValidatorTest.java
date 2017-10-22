package by.bsu.calculator.valid;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 22.10.2017.
 */
public class ContextValidatorTest {
    @Test
    public void isValidExpressionTest(){
        Assert.assertEquals(true, ContextValidator.isValidExpression("12*3"));

        Assert.assertEquals(true, ContextValidator.isValidExpression("0.12/0.0"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("94.321/2341.6857"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("0/2341.23432"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("43.0/90"));

        Assert.assertEquals(true, ContextValidator.isValidExpression("128.08+3"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("12.5+21"));

        Assert.assertEquals(true, ContextValidator.isValidExpression("98-0.98"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("93.0-12"));
        Assert.assertEquals(true, ContextValidator.isValidExpression("67-0"));

        Assert.assertEquals(false, ContextValidator.isValidExpression("qwe"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("123.098"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("89+-12"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("-90-50"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("12.9g84"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("93.3#9"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("901 0.9"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("123.3 9*34"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("93*31-31"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("54*4,3"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("54+4.3324124325113"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("93=31"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("93.0+31="));
        Assert.assertEquals(false, ContextValidator.isValidExpression("-0.9+31.4"));
        Assert.assertEquals(false, ContextValidator.isValidExpression("+93+5"));

    }
}
