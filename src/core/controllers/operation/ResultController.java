
package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import static java.lang.Double.MAX_VALUE;

/**
 *
 * @author andre
 */
public class ResultController {

    //Método para verificar que el número no sea demasiado grande
    public static Response tooLong(double result) {
        //MAX_VALUE corresponde al número máximo que puede tomar un double
        if (result > MAX_VALUE) {
            return new Response("Result Number is too long", Status.BAD_REQUEST);
        }
        return new Response("Your Number is allowed", Status.CREATED);
    }
}
