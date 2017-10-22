package by.bsu.calculator;

import by.bsu.calculator.exception.IncorrectExpressionException;
import by.bsu.calculator.parse.ParseExpression;

/**
 * Created by cplus on 22.10.2017.
 */
public class Calculator {
    private final static int FIRST_VALUE = 0;
    private final static int SECOND_VALUE = 1;
    private Context context;

    public Calculator() {

    }

    public Calculator(String expression) throws IncorrectExpressionException {
        context = new Context(expression);
    }

    public Double calculate() {
        String expression = context.getExpression();
        double value1 = ParseExpression.getValuesFromExpression(expression)[FIRST_VALUE];
        double value2 = ParseExpression.getValuesFromExpression(expression)[SECOND_VALUE];
        switch (ParseExpression.getSignFromExpression(expression)) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                return null;
        }

    }
}
