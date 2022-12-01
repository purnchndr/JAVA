package Exceptions;

public class ErrorException extends Error{

    public ErrorException() {
        super("Default Error Massage");
    }


    public ErrorException(String message) {
        super(message);
    }


    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }


    public ErrorException(Throwable cause) {
        super(cause);
    }



}
