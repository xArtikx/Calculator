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
        Division mu = new Division(number1, number2);
        return mu.getResult();
    }
>>>>>>> 572cc9cc8cd8126d79b68c12b0fdc84569a4cbb5
}
