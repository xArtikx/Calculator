/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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

    String
            getOperationResult(double number1, double number2);
}
