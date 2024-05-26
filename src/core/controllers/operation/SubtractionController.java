package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.ResponseShared;
import core.models.operation.Subtraction;

/**
 *
 * @author juank
 */
public class SubtractionController implements OperationController {

    @Override
    public Response getResponse(String a, String b) {
        return ResponseShared.responseType1(a, b);
    }

    @Override
    public Subtraction getOperation(double number1, double number2) {
        return new Subtraction(number1, number2);
    }
}
