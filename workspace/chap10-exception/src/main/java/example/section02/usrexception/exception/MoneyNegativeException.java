package example.section02.usrexception.exception;

// Exception > NegativeException > MoneyNegativeException
public class MoneyNegativeException extends NegativeException {

    public MoneyNegativeException(String message) {
        super(message);
    }
}
