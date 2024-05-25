package core.models.operation;

import java.text.DecimalFormat;

/**
 *
 * @author juank
 */
public class Addition extends Operation {

    public Addition(double number1, double number2) {
        super(number1, number2);
        DecimalFormat df = new DecimalFormat("#.###");      
        result = df.format(number1 + number2).replaceAll(",", ".");
        operator = "+";
    }
}
