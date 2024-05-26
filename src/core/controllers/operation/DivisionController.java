
package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.ResponseShared;
import core.models.operation.Division;

/**
 *
 * @author juank
 */
public class DivisionController implements OperationController {

    @Override
    public Response getResponse(String a, String b) {
        return ResponseShared.responseType2(a, b);
    }

    @Override
    public Division getOperation(double number1, double number2) {
        return new Division(number1, number2);
    }


}
