package by.bsu.calculator.parse;

/**
 * Created by cplus on 21.10.2017.
 */
public final class ParseExpression {
    private final static int FIRST_VALUE = 0;
    private final static int SECOND_VALUE = 1;
    private final static String EXPRESSION_DIVIDER = "[*\\-+/]";

    public static double[] getValuesFromExpression(String expression) {
        double value1 = Double.parseDouble(expression.split(EXPRESSION_DIVIDER)[FIRST_VALUE]);
        double value2 = Double.parseDouble(expression.split(EXPRESSION_DIVIDER)[SECOND_VALUE]);
        return new double[]{value1, value2};
    }

    public static char getSignFromExpression(String expression) {
        if (expression.contains("+")) {
            return '+';
        }
        if (expression.contains("-")) {
            return '-';
        }
        if (expression.contains("*")) {
            return '*';
        }
        else{
            return '/';
        }
    }

    private ParseExpression() {
    }
}
