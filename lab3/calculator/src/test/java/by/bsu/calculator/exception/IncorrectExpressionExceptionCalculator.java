package by.bsu.calculator.exception;

import by.bsu.calculator.Calculator;
import org.junit.Test;
import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

/**
 * Created by cplus on 22.10.2017.
 */
public class IncorrectExpressionExceptionCalculator {
    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest1() throws IncorrectExpressionException {
        new Calculator("jcn").calculate();
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest2() throws IncorrectExpressionException {
        new Calculator("542-");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest3() throws IncorrectExpressionException {
        Calculator calculator = new Calculator("0.9*");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest4() throws IncorrectExpressionException {
        Calculator calculator = new Calculator("321-*+3");
    }

    @Test(expected = IncorrectExpressionException.class)
    public void exceptionTest5() throws IncorrectExpressionException {
        new Calculator("43-&&*(");
    }
}
