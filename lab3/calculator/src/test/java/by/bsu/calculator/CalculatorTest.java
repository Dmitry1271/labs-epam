package by.bsu.calculator;

import by.bsu.calculator.exception.IncorrectExpressionException;
import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

/**
 * Created by cplus on 22.10.2017.
 */
public class CalculatorTest {
    @Test
    public void calculateTest() throws IncorrectExpressionException {
        Assert.assertEquals(60, new Calculator("120/2").calculate(),0.0001);
        Assert.assertEquals(Infinity, new Calculator("543/0").calculate(),0.0001);
        Assert.assertEquals(Infinity, new Calculator("89.09/0.000").calculate(),0.0001);
        Assert.assertEquals(NaN, new Calculator("0/0").calculate(),0.0001);
        Assert.assertEquals(0.0002, new Calculator("3/15000").calculate(),0.0001);

        Assert.assertEquals(1148.74308, new Calculator("45.369*25.32").calculate(),0.0001);
        Assert.assertEquals(12, new Calculator("2*6.0").calculate(),0.0001);
        Assert.assertEquals(0, new Calculator("1248.1231*0").calculate(),0.0001);
        Assert.assertEquals(12518912, new Calculator("12544*998").calculate(),0.0001);
        Assert.assertEquals(45, new Calculator("9.00*5.0000").calculate(),0.0001);


        Assert.assertEquals(590.2, new Calculator("589.1+1.1").calculate(),0.0001);
        Assert.assertEquals(4812.12341, new Calculator("0+4812.12341").calculate(),0.0001);
        Assert.assertEquals(629.1, new Calculator("628+1.1").calculate(),0.0001);
        Assert.assertEquals(98754.0021, new Calculator("98700+54.0021").calculate(),0.0001);
        Assert.assertEquals(43, new Calculator("12+31").calculate(),0.0001);

        Assert.assertEquals(255, new Calculator("500.980-245.98").calculate(),0.0001);
        Assert.assertEquals(-109, new Calculator("120-229.0").calculate(),0.0001);
        Assert.assertEquals(-89, new Calculator("20.9-109.9").calculate(),0.0001);
        Assert.assertEquals(3601.7158, new Calculator("4587.3658-985.65").calculate(),0.0001);
        Assert.assertEquals(-27.8, new Calculator("9-36.8").calculate(),0.0001);
    }
}
