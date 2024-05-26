package core.controllers.utils;

import core.models.history.History;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author andre
 */
public class ShowHistory {

    //Método para mostrar el historial dentro del Jlist
    //Se usa una lista de Strings
    public static void showHistory(JList<String> list, History history) {
        ArrayList<String> operations = new ArrayList<>(history.getOperations());
        DefaultListModel<String> model = new DefaultListModel();
        Collections.reverse(operations);
        for (String op : operations) {
            model.addElement(op);
        }
        list.setModel(model);
    }
}
