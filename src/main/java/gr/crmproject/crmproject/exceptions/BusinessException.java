package gr.crmproject.crmproject.exceptions;

public abstract class BusinessException extends Exception {
    public BusinessException(String message) {
        super(message);
    }
}