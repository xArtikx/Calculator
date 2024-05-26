package core.models.operation;


/**
 *
 * @author juank
 */
public class Multiplication extends Operation {

    public Multiplication(double number1, double number2) {
        super(number1, number2);    
        result = String.format("%.3f", number1*number2).replaceAll(",", ".");
        operator = "*";
    }
}
