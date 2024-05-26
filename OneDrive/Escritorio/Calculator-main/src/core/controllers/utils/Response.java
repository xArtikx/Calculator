package core.controllers.utils;

/**
 *
 * @author andre
 */
public class Response {

    private final String message;
    private final int status;

    public Response(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
