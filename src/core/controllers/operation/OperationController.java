<<<<<<< HEAD

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
package core.controllers.operation;

import core.controllers.utils.Response;
import core.models.operation.Operation;

/**
 *
 * @author andre
 */
<<<<<<< HEAD
=======

>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
//Se usa esta interfaz para cada una de las operaciones
//Contiene los getters solamente y todas las operaciones la implementan
public interface OperationController {

    Response
            getResponse(String a, String b);

    Operation
            getOperation(double number1, double number2);
<<<<<<< HEAD
=======

    String
            getOperationResult(double number1, double number2);
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
}
