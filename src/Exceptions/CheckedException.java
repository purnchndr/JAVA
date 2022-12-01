package Exceptions;

public class CheckedException extends Exception {

    public CheckedException() {
        super("This is checked exception with Default massage");
    }


    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
