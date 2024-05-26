<<<<<<< HEAD

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
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

<<<<<<< HEAD
  
=======
    @Override
    public String getOperationResult(double number1, double number2) {
        Multiplication mu = new Multiplication(number1, number2);
        return mu.getResult();
    }
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
}
