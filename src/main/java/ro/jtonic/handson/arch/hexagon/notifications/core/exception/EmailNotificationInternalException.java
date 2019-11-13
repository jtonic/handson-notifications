package ro.jtonic.handson.arch.hexagon.notifications.core.exception;

public class EmailNotificationInternalException extends RuntimeException {

    public EmailNotificationInternalException(String message, Throwable exc) {
        super(message, exc);
    }

    public EmailNotificationInternalException(Throwable exc) {
        this(exc.getMessage(), exc);
    }

}