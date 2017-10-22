package by.bsu.calculator.exception;

/**
 * Created by cplus on 22.10.2017.
 */
public class IncorrectExpressionException extends Exception {
    public IncorrectExpressionException() {
    }

    public IncorrectExpressionException(String message) {
        super(message);
    }

    public IncorrectExpressionException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectExpressionException(Throwable cause) {
        super(cause);
    }

    public IncorrectExpressionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
