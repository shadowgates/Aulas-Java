package estatisticapoisson;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kLabel = new javax.swing.JLabel();
        lambdaLabel = new javax.swing.JLabel();
        calcularButton = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        resultado2Label = new javax.swing.JLabel();
        limparButton = new javax.swing.JButton();
        kTextField = new javax.swing.JFormattedTextField();
        lambdaTextField = new javax.swing.JFormattedTextField();
        resultadoTextField = new javax.swing.JFormattedTextField();
        resultado2TextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poisson");
        setResizable(false);

        kLabel.setText("K");

        lambdaLabel.setText("λ");

        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        resultadoLabel.setText("Resultado:");

        resultado2Label.setText("% :");

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        kTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        kTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kTextFieldFocusGained(evt);
            }
        });

        lambdaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        lambdaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lambdaTextFieldFocusGained(evt);
            }
        });

        resultadoTextField.setEditable(false);
        resultadoTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        resultado2TextField.setEditable(false);
        resultado2TextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lambdaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lambdaTextField))
                    .addComponent(calcularButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultadoLabel)
                            .addComponent(resultado2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(limparButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kLabel)
                            .addComponent(kTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(limparButton)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lambdaLabel)
                            .addComponent(lambdaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calcularButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultadoLabel)
                            .addComponent(resultadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultado2Label)
                            .addComponent(resultado2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        DecimalFormat dfP = new DecimalFormat("#0.0000");
        DecimalFormat dfPorc = new DecimalFormat("#0.00");
        
        int lambda,k, lambdaNeg;
        double e = 2.7182818284590452354;
        double p, porc, fat = 1;
        
        if(lambdaTextField.getText().equals("") || kTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insira valores");
            return;
        }
        
        
        lambda = Integer.parseInt(lambdaTextField.getText());
        k = Integer.parseInt(kTextField.getText());
        
        if(k<0 || lambda<0){
            JOptionPane.showMessageDialog(this, "Insira valores inteiros positivos");
            return;
        }
        
        lambdaNeg = lambda * -1;
        if(k <= 0)
        {
            fat = 1;
        }
        else
        {
            for(int i = 1; i <= k; i++)
            {
                fat = fat * i;
            }
        }
        p = (Math.pow(e, lambdaNeg) * Math.pow(lambda, k)) / (fat);
        porc = p * 100;
        
        String pFim, porcFim;        
        
        pFim = String.valueOf(dfP.format(p));
        porcFim = String.valueOf(dfPorc.format(porc));
        
        System.out.println("Resultado de P(x = " + k + ") = " + p + " ou " + porc + ".\n");

        
        resultadoTextField.setText(pFim);
        resultado2TextField.setText(porcFim);
    }//GEN-LAST:event_calcularButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        kTextField.setValue(null);
        lambdaTextField.setValue(null);
        resultadoTextField.setValue(null);
        resultado2TextField.setValue(null);
    }//GEN-LAST:event_limparButtonActionPerformed

    private void kTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kTextFieldFocusGained
        kTextField.setValue(null);
    }//GEN-LAST:event_kTextFieldFocusGained

    private void lambdaTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lambdaTextFieldFocusGained
        lambdaTextField.setValue(null);
    }//GEN-LAST:event_lambdaTextFieldFocusGained

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularButton;
    private javax.swing.JLabel kLabel;
    private javax.swing.JFormattedTextField kTextField;
    private javax.swing.JLabel lambdaLabel;
    private javax.swing.JFormattedTextField lambdaTextField;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel resultado2Label;
    private javax.swing.JFormattedTextField resultado2TextField;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JFormattedTextField resultadoTextField;
    // End of variables declaration//GEN-END:variables
}
