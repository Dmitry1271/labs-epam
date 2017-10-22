package by.bsu.calculator.exception;

import by.bsu.calculator.Context;
import org.junit.Test;

/**
 * Created by cplus on 22.10.2017.
 */
public class IncorrectExpressionExceptionContextTest {
    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest1() throws IncorrectExpressionException {
        new Context("123");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest2() throws IncorrectExpressionException {
        new Context("-218*3");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest3() throws IncorrectExpressionException {
        Context context = new Context();
        context.setExpression("edw");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest4() throws IncorrectExpressionException {
        Context context = new Context();
        context.setExpression("0.94*");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest5() throws IncorrectExpressionException {
        new Context("42*3 9").getExpression();
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest6() throws IncorrectExpressionException {
        new Context("123o1*1").getExpression();
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest7() throws IncorrectExpressionException {
        new Context("123-lfe");
    }
}
