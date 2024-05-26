
package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.ResponseShared;
import core.models.operation.Potenciation;

/**
 *
 * @author juank
 */
public class PotenciationController implements OperationController {

    @Override
    public Response getResponse(String a, String b) {
        return ResponseShared.responseType1(a, b);
    }

    @Override
    public Potenciation getOperation(double number1, double number2) {
        return new Potenciation(number1, number2);
    }


}
