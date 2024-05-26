package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.ResponseShared;
import core.models.operation.Multiplication;

/**
 *
 * @author juank
 */
public class MultiplicationController implements OperationController {

    @Override
    public Response getResponse(String a, String b) {
        return ResponseShared.responseType1(a, b);
    }

    @Override
    public Multiplication getOperation(double number1, double number2) {
        return new Multiplication(number1, number2);
    }
}
