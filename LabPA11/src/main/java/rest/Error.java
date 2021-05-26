package rest;

import java.util.Date;

public class Error {
    private final int status = 0;
    private final Date time = null;
    private final String message = null;

    public Error(int value, Date date) {
    }

    public int getStatus() {
        return status;
    }

    public Date getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

}
