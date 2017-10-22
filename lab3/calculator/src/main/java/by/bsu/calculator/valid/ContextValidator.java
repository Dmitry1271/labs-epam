package by.bsu.calculator.valid;


/**
 * Created by cplus on 22.10.2017.
 */
public final class ContextValidator {
    private static final String CHECKING_REGEX = "^[0-9]{1,7}(\\.[0-9]{1,5})?[+\\-*/][0-9]{1,7}(\\.[0-9]{1,5})?$";

    public static boolean isValidExpression(String expression){
        return expression.matches(CHECKING_REGEX);
    }

    private ContextValidator(){}
}
