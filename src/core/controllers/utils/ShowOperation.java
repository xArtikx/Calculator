package core.controllers.utils;

import core.models.operation.Operation;

/**
 *
 * @author andre
 */
public class ShowOperation {

    /**
     *
     * @param operation
     * @return
     */
    public static String showOperation(Operation operation) {
        return (operation.getNumber1() + " " + operation.getOperator() + " " + operation.getNumber2() + " = " + operation.getResult());
    }
}
