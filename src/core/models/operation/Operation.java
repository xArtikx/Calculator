package core.models.operation;

/**
 *
 * @author andre
 */
//Se hizo a la clase Operation como abstracta
//Es la clase padre de las operaciones
public abstract class Operation {

    protected double number1;
    protected double number2;
    protected String operator;
    protected String result;

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }

    public String getResult() {
        return result;
    }
}
