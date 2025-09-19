package example.section02.usrexception.exception;

// Exception > NegativeException > PriceNegativeException
public class PriceNegativeException extends NegativeException {

    public PriceNegativeException(String message) {
        super(message);
    }
}
