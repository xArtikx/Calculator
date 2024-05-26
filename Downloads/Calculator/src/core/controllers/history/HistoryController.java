package core.controllers.history;

import core.models.history.History;
import core.controllers.utils.ShowHistory;
import core.models.operation.Operation;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author andre
 */

//Controlador para implementar los métodos de History
public class HistoryController {

    /**
     *
     * @param operation
     */
    
    public static void addOperation(Operation operation) {
        History.getInstance().addOperation(operation.getNumber1() + " " + operation.getOperator() + " " + operation.getNumber2() + " = " + operation.getResult());
    }

    public ArrayList<String> getOperations() {
        return History.getInstance().getOperations();
    }

    //Se ejecuta el método para mostrar el historial
    public void showHistory(JList<String> list) {
        ShowHistory.showHistory(list, History.getInstance());

    }
}
