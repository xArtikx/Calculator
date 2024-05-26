package main;

import core.views.CalculatorFrame;

/**
 *
 * @author andre
 */
public class Main {
    
    //Aquí se ejecuta la vista
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorFrame().setVisible(true);
        });
    }
}
