package Exceptions;

public class RuntimeCustomExceptions extends RuntimeException {


    public RuntimeCustomExceptions() {
        super("This is runtime exception with Default massage");
    }


    public RuntimeCustomExceptions(String message) {
        super(message);
    }

    public RuntimeCustomExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
