package core.models.history;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {

    private static History instance;
    private final ArrayList<String> operations;

    private History() {
        this.operations = new ArrayList<>();
    }

    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }

    public void addOperation(String operation) {
        this.operations.add(operation);
    }

    public ArrayList<String> getOperations() {
        return operations;
    }
}
