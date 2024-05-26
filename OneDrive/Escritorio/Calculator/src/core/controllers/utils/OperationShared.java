package core.controllers.utils;

public class OperationShared {

    /**
     *
     * @param input
     * @return
     */
    public boolean isValid(String input) {
        if (input.contains(".")) {
            String[] decimal = input.split("\\.");
            if (decimal.length > 1 && decimal[1].length() > 3) {
                return false;
            }
        }
        return true;
    }
}
