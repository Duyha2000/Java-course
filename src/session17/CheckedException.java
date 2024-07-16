package session17;

import java.util.Map;

public class CheckedException extends Exception {
    private Map<String, String> err;

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(Map<String, String> err) {
        this.err = err;
    }

    public Map<String, String> getErr() {
        return err;
    }
}
