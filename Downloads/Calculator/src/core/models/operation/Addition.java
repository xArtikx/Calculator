package core.models.operation;


/**
 *
 * @author juank
 */
public class Addition extends Operation {

    public Addition(double number1, double number2) {
        super(number1, number2);   
        result = String.format("%.3f", number1+number2).replaceAll(",", ".");
        operator = "+";
    }
    
}
