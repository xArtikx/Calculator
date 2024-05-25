package core.views;

import core.controllers.history.HistoryController;
import core.controllers.operation.AdditionController;
import core.controllers.operation.DivisionController;
import core.controllers.operation.MultiplicationController;
import core.controllers.operation.PotenciationController;
import core.controllers.operation.ResultController;
import core.controllers.operation.SubtractionController;
import javax.swing.JOptionPane;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalculatorLabel = new javax.swing.JLabel();
        AdditionButton = new javax.swing.JButton();
        SubstractionButton = new javax.swing.JButton();
        MultiplicationButton = new javax.swing.JButton();
        DivisionButton = new javax.swing.JButton();
        PotencyButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        Number1Field = new javax.swing.JTextField();
        Number2Field = new javax.swing.JTextField();
        Number1Label = new javax.swing.JLabel();
        Number2Label = new javax.swing.JLabel();
        ResultLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpdateList = new javax.swing.JList<>();
        ResultField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CalculatorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CalculatorLabel.setText("Calculator");

        AdditionButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AdditionButton.setText("Add");
        AdditionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionButtonActionPerformed(evt);
            }
        });

        SubstractionButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SubstractionButton.setText("Subtract");
        SubstractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubstractionButtonActionPerformed(evt);
            }
        });

        MultiplicationButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MultiplicationButton.setText("Multiply");
        MultiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicationButtonActionPerformed(evt);
            }
        });

        DivisionButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DivisionButton.setText("Divide");
        DivisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionButtonActionPerformed(evt);
            }
        });

        PotencyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PotencyButton.setText("Potency");
        PotencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotencyButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ClearButton.setText("Clear numbers");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        UpdateButton.setText("Update history");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        Number1Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Number2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Number1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Number1Label.setText("Number 1");

        Number2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Number2Label.setText("Number 2");

        ResultLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ResultLabel.setText("Result");

        UpdateList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        UpdateList.setEnabled(false);
        jScrollPane1.setViewportView(UpdateList);

        ResultField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ResultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultField.setEnabled(false);
        ResultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ResultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Number1Field)
                            .addComponent(Number2Field)
                            .addComponent(ResultField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PotencyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MultiplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(AdditionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SubstractionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(DivisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(CalculatorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalculatorLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number1Label)
                    .addComponent(Number1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number2Label)
                            .addComponent(Number2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultLabel)
                            .addComponent(ResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdditionButton)
                            .addComponent(SubstractionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DivisionButton)
                            .addComponent(MultiplicationButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PotencyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdditionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionButtonActionPerformed

        String number1 = Number1Field.getText().replaceAll(",", ".");
        String number2 = Number2Field.getText().replaceAll(",", ".");
        AdditionController ac = new AdditionController();
        if (ac.getResponse(number1, number2).getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, ac.getResponse(number1, number2).getMessage(), "Error " + ac.getResponse(number1, number2).getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (ac.getResponse(number1, number2).getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, ac.getResponse(number1, number2).getMessage(), "Error " + ac.getResponse(number1, number2).getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = Double.parseDouble(ac.getOperationResult(a, b));
            if (ac.getResponse(number1, number2).getStatus() >= 500) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.ERROR_MESSAGE);
            } else if (ac.getResponse(number1, number2).getStatus() >= 400) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.WARNING_MESSAGE);
            } else {
                
                HistoryController.addOperation(ac.getOperation(a, b));
                ResultField.setText(ac.getOperationResult(a, b));
            }
        }
    }//GEN-LAST:event_AdditionButtonActionPerformed

    private void SubstractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubstractionButtonActionPerformed

        String number1 = Number1Field.getText().replaceAll(",", ".");
        String number2 = Number2Field.getText().replaceAll(",", ".");
        SubtractionController sc = new SubtractionController();
        if (sc.getResponse(number1, number2).getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, sc.getResponse(number1, number2).getMessage(), "Error " + sc.getResponse(number1, number2).getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (sc.getResponse(number1, number2).getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, sc.getResponse(number1, number2).getMessage(), "Error " + sc.getResponse(number1, number2).getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = Double.parseDouble(sc.getOperationResult(a, b));
            if (ResultController.tooLong(result).getStatus() >= 500) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.ERROR_MESSAGE);
            } else if (ResultController.tooLong(result).getStatus() >= 400) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.WARNING_MESSAGE);
            } else {
                
                HistoryController.addOperation(sc.getOperation(a, b));
                ResultField.setText(sc.getOperationResult(a, b));
            }
        }
    }//GEN-LAST:event_SubstractionButtonActionPerformed

    private void MultiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicationButtonActionPerformed

        String number1 = Number1Field.getText().replaceAll(",", ".");
        String number2 = Number2Field.getText().replaceAll(",", ".");
        MultiplicationController mc = new MultiplicationController();
        if (mc.getResponse(number1, number2).getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, mc.getResponse(number1, number2).getMessage(), "Error " + mc.getResponse(number1, number2).getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (mc.getResponse(number1, number2).getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, mc.getResponse(number1, number2).getMessage(), "Error " + mc.getResponse(number1, number2).getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = Double.parseDouble(mc.getOperationResult(a, b));
            if (ResultController.tooLong(result).getStatus() >= 500) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.ERROR_MESSAGE);
            } else if (ResultController.tooLong(result).getStatus() >= 400) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.WARNING_MESSAGE);
            } else {
                HistoryController.addOperation(mc.getOperation(a, b));
                ResultField.setText(mc.getOperationResult(a, b));
            }
        }
    }//GEN-LAST:event_MultiplicationButtonActionPerformed

    private void DivisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionButtonActionPerformed

        String number1 = Number1Field.getText().replaceAll(",", ".");
        String number2 = Number2Field.getText().replaceAll(",", ".");
        DivisionController dc = new DivisionController();
        if (dc.getResponse(number1, number2).getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, dc.getResponse(number1, number2).getMessage(), "Error " + dc.getResponse(number1, number2).getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (dc.getResponse(number1, number2).getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, dc.getResponse(number1, number2).getMessage(), "Error " + dc.getResponse(number1, number2).getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = Double.parseDouble(dc.getOperationResult(a, b));
            if (ResultController.tooLong(result).getStatus() >= 500) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.ERROR_MESSAGE);
            } else if (ResultController.tooLong(result).getStatus() >= 400) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.WARNING_MESSAGE);
            } else {
                HistoryController.addOperation(dc.getOperation(a, b));
                ResultField.setText(dc.getOperationResult(a, b));
            }
        }
    }//GEN-LAST:event_DivisionButtonActionPerformed

    private void PotencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotencyButtonActionPerformed

        String number1 = Number1Field.getText().replaceAll(",", ".");
        String number2 = Number2Field.getText().replaceAll(",", ".");
        PotenciationController pc = new PotenciationController();
        if (pc.getResponse(number1, number2).getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, pc.getResponse(number1, number2).getMessage(), "Error " + pc.getResponse(number1, number2).getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (pc.getResponse(number1, number2).getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, pc.getResponse(number1, number2).getMessage(), "Error " + pc.getResponse(number1, number2).getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = Double.parseDouble(pc.getOperationResult(a, b));
            if (ResultController.tooLong(result).getStatus() >= 500) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.ERROR_MESSAGE);
            } else if (ResultController.tooLong(result).getStatus() >= 400) {
                JOptionPane.showMessageDialog(null, ResultController.tooLong(result).getMessage(), "Error " + ResultController.tooLong(result).getStatus(), JOptionPane.WARNING_MESSAGE);
            } else {
                HistoryController.addOperation(pc.getOperation(a, b));
                ResultField.setText(pc.getOperationResult(a, b));
            }
        }
    }//GEN-LAST:event_PotencyButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        Number1Field.setText("");
        Number2Field.setText("");
        ResultField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        HistoryController hc = new HistoryController();
        hc.showHistory(UpdateList);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ResultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultFieldActionPerformed
    }//GEN-LAST:event_ResultFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorFrame().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdditionButton;
    private javax.swing.JLabel CalculatorLabel;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DivisionButton;
    private javax.swing.JButton MultiplicationButton;
    private javax.swing.JTextField Number1Field;
    private javax.swing.JLabel Number1Label;
    private javax.swing.JTextField Number2Field;
    private javax.swing.JLabel Number2Label;
    private javax.swing.JButton PotencyButton;
    private javax.swing.JTextField ResultField;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JButton SubstractionButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JList<String> UpdateList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
