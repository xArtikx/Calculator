package core.controllers.operation;

import core.controllers.utils.Response;
import core.models.operation.Operation;

/**
 *
 * @author andre
 */
//Se usa esta interfaz para cada una de las operaciones
//Contiene los getters solamente y todas las operaciones la implementan
public interface OperationController {

    Response
            getResponse(String a, String b);

    Operation
            getOperation(double number1, double number2);
}
