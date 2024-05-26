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

<<<<<<< HEAD
   
=======
    /**
     *
     * @param number1
     * @param number2
     * @return
     */
    @Override
    public String getOperationResult(double number1, double number2) {
        Potenciation mu = new Potenciation(number1, number2);
        return mu.getResult();
    }
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
}
