package by.bsu.calculator;

import by.bsu.calculator.exception.IncorrectExpressionException;
import by.bsu.calculator.valid.ContextValidator;

/**
 * Created by cplus on 22.10.2017.
 */
public class Context {
    private String expression;

    public Context() {

    }

    public Context(String expression) throws IncorrectExpressionException {
        setExpression(expression);
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) throws IncorrectExpressionException {
        if (ContextValidator.isValidExpression(expression)) {
            this.expression = expression;
        } else {
            throw new IncorrectExpressionException("Incorrect expression");
        }
    }
}
