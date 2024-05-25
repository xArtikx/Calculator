/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers.operation;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import static java.lang.Double.MAX_VALUE;

/**
 *
 * @author andre
 */
public class ResultController {

    public static Response tooLong(double result) {
        if (result > MAX_VALUE) {
            return new Response("Result Number is too long", Status.BAD_REQUEST);
        }
        return new Response("Your Number is allowed", Status.CREATED);
    }
}
