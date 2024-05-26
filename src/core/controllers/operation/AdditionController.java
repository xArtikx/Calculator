package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.ResponseShared;
import core.models.operation.Addition;

/**
 *
 * @author juank
 */
public class AdditionController implements OperationController {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public Response getResponse(String a, String b) {
        return ResponseShared.responseType1(a, b);
    }

    @Override
    public Addition getOperation(double number1, double number2) {
        return new Addition(number1, number2);
    }
}
