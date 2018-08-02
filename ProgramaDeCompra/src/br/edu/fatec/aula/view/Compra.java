/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago Guerino
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
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

        principalPanel = new javax.swing.JPanel();
        produtoPanel = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        valorFormattedTextField = new javax.swing.JFormattedTextField();
        quantidadeTextField = new javax.swing.JFormattedTextField();
        tabelaScrollPanel = new javax.swing.JScrollPane();
        tabelaTable = new javax.swing.JTable();
        adicionarButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        produtoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        descricaoLabel.setText("Descrição");

        quantidadeLabel.setText("Quantidade");

        valorLabel.setText("Valor Unitário");

        valorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        quantidadeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout produtoPanelLayout = new javax.swing.GroupLayout(produtoPanel);
        produtoPanel.setLayout(produtoPanelLayout);
        produtoPanelLayout.setHorizontalGroup(
            produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoPanelLayout.createSequentialGroup()
                .addGroup(produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoPanelLayout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoTextField))
                    .addGroup(produtoPanelLayout.createSequentialGroup()
                        .addComponent(quantidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        produtoPanelLayout.setVerticalGroup(
            produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtoPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoLabel)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantidadeLabel)
                        .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(produtoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorLabel)
                        .addComponent(valorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        tabelaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Qtde", "Valor Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTableMouseClicked(evt);
            }
        });
        tabelaScrollPanel.setViewportView(tabelaTable);

        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        totalLabel.setText("Total a pagar");

        totalFormattedTextField.setEditable(false);
        totalFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produtoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(totalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(tabelaScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabelaScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(principalPanelLayout.createSequentialGroup()
                        .addComponent(adicionarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        String descricao = descricaoTextField.getText();
        String qtdStr = quantidadeTextField.getText();
        String valorStr = valorFormattedTextField.getText();

        if (descricao.isEmpty() || qtdStr.isEmpty() || valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencher todos os campos");
            return;
        }

        int qtde = Integer.parseInt(qtdStr);
        double valorUnit = Double.parseDouble(valorStr.replace(',', '.'));
        double total = qtde * valorUnit;

        DefaultTableModel tabela;
        tabela = (DefaultTableModel) tabelaTable.getModel();
        Object[] linha = {
            descricao,
            qtde,
            valorUnit,
            total
        };
        tabela.addRow(linha);

        descricaoTextField.setText("");
        quantidadeTextField.setText("");
        valorFormattedTextField.setText("");
        
        double totalAPagar = 0.0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            totalAPagar += (double)tabela.getValueAt(i, 3);
        }
        totalFormattedTextField.setText(String.valueOf(totalAPagar));
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        int linhaSelecionada = tabelaTable.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
            return;
        }

        String descricao = descricaoTextField.getText();
        String qtdStr = quantidadeTextField.getText();
        String valorStr = valorFormattedTextField.getText();

        int qtde = Integer.parseInt(qtdStr);
        double valorUnit = Double.parseDouble(valorStr.replace(',', '.'));
        double total = qtde * valorUnit;

        DefaultTableModel tabela;
        tabela = (DefaultTableModel) tabelaTable.getModel();

        tabela.setValueAt(descricao, linhaSelecionada, 0);
        tabela.setValueAt(qtde, linhaSelecionada, 1);
        tabela.setValueAt(valorUnit, linhaSelecionada, 2);
        tabela.setValueAt(total, linhaSelecionada, 3);
        
        double totalAPagar = 0.0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            totalAPagar += (double)tabela.getValueAt(i, 3);
        }
        totalFormattedTextField.setText(String.valueOf(totalAPagar));
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        int linhaSelecionada = tabelaTable.getSelectedRow();

        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
            return;
        }
        DefaultTableModel tabela;
        tabela = (DefaultTableModel) tabelaTable.getModel();
        tabela.removeRow(linhaSelecionada);
        
        double totalAPagar = 0.0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            totalAPagar += (double)tabela.getValueAt(i, 3);
        }
        totalFormattedTextField.setText(String.valueOf(totalAPagar));


    }//GEN-LAST:event_removerButtonActionPerformed

    private void tabelaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTableMouseClicked
        int linhaSelecionada = tabelaTable.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha");
            return;
        }
        DefaultTableModel tabela;
        tabela = (DefaultTableModel) tabelaTable.getModel();

        Object descricaoObj = tabela.getValueAt(linhaSelecionada, 0);
        Object qtdeObj = tabela.getValueAt(linhaSelecionada, 1);
        Object valorObj = tabela.getValueAt(linhaSelecionada, 2);

        descricaoTextField.setText(String.valueOf(descricaoObj));
        quantidadeTextField.setText(String.valueOf(qtdeObj));
        valorFormattedTextField.setText(String.valueOf(valorObj));

        
        
    }//GEN-LAST:event_tabelaTableMouseClicked

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        descricaoTextField.setText("");
        quantidadeTextField.setText("");
        valorFormattedTextField.setText("");
    }//GEN-LAST:event_limparButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton limparButton;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JPanel produtoPanel;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JFormattedTextField quantidadeTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JScrollPane tabelaScrollPanel;
    private javax.swing.JTable tabelaTable;
    private javax.swing.JFormattedTextField totalFormattedTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JFormattedTextField valorFormattedTextField;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}
