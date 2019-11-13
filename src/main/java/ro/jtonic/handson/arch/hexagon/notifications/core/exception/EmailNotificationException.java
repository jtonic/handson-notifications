package ro.jtonic.handson.arch.hexagon.notifications.core.exception;

public class EmailNotificationException extends RuntimeException {

    public EmailNotificationException(String message, Throwable exc) {
        super(message, exc);
    }

    public EmailNotificationException(Throwable exc) {
        this(exc.getMessage(), exc);
    }

}