package core.models.operation;

import java.text.DecimalFormat;

/**
 *
 * @author juank
 */
public class Potenciation extends Operation {

    public Potenciation(double number1, double number2) {
        super(number1, number2);
        DecimalFormat df = new DecimalFormat("#.###");      
        result = df.format(Math.pow(number1, number2)).replaceAll(",", ".");
        operator = "^";
    }
}
