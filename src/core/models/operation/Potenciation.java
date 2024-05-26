package core.models.operation;

/**
 *
 * @author juank
 */
public class Potenciation extends Operation {

    public Potenciation(double number1, double number2) {
        super(number1, number2);
        result = String.format("%.3f", Math.pow(number1, number2)).replaceAll(",", ".");
        operator = "^";
    }
}
