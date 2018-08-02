/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.view;

/**
 *
 * @author Tiago Guerino
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalFrame() {
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

        principalScrollPanel = new javax.swing.JScrollPane();
        principalDesktopPanel = new javax.swing.JDesktopPane();
        principalMenuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        novoMenuItem = new javax.swing.JMenuItem();
        sairMenuItem = new javax.swing.JMenuItem();
        cadastrarMenu = new javax.swing.JMenu();
        clienteMenuItem = new javax.swing.JMenuItem();
        veiculosMenuItem = new javax.swing.JMenuItem();
        consultarMenu = new javax.swing.JMenu();
        pessoasMenuItem = new javax.swing.JMenuItem();
        estoqueMenuItem = new javax.swing.JMenuItem();
        ajudaMenu = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda de veículos");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        principalScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        principalScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        principalDesktopPanel.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout principalDesktopPanelLayout = new javax.swing.GroupLayout(principalDesktopPanel);
        principalDesktopPanel.setLayout(principalDesktopPanelLayout);
        principalDesktopPanelLayout.setHorizontalGroup(
            principalDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        principalDesktopPanelLayout.setVerticalGroup(
            principalDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        principalScrollPanel.setViewportView(principalDesktopPanel);

        principalMenuBar.setBorder(null);

        arquivoMenu.setMnemonic('A');
        arquivoMenu.setText("Arquivo");

        novoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        novoMenuItem.setText("Nova venda");
        novoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoMenuItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(novoMenuItem);

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        arquivoMenu.add(sairMenuItem);

        principalMenuBar.add(arquivoMenu);

        cadastrarMenu.setMnemonic('C');
        cadastrarMenu.setText("Cadastrar");

        clienteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        clienteMenuItem.setText("Cliente");
        clienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteMenuItemActionPerformed(evt);
            }
        });
        cadastrarMenu.add(clienteMenuItem);

        veiculosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        veiculosMenuItem.setText("Veículos");
        veiculosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosMenuItemActionPerformed(evt);
            }
        });
        cadastrarMenu.add(veiculosMenuItem);

        principalMenuBar.add(cadastrarMenu);

        consultarMenu.setMnemonic('o');
        consultarMenu.setText("Consultar");

        pessoasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        pessoasMenuItem.setText("Clientes");
        pessoasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoasMenuItemActionPerformed(evt);
            }
        });
        consultarMenu.add(pessoasMenuItem);

        estoqueMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        estoqueMenuItem.setText("Estoque");
        estoqueMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueMenuItemActionPerformed(evt);
            }
        });
        consultarMenu.add(estoqueMenuItem);

        principalMenuBar.add(consultarMenu);

        ajudaMenu.setMnemonic('J');
        ajudaMenu.setText("Ajuda");

        sobreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        sobreMenuItem.setText("Sobre");
        sobreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuItemActionPerformed(evt);
            }
        });
        ajudaMenu.add(sobreMenuItem);

        principalMenuBar.add(ajudaMenu);

        setJMenuBar(principalMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalScrollPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalScrollPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private CadCarroInternalFrame telaCadCarro = null;
    private CadClienteInternalFrame telaCadCliente = null;
    private ConsultaCarroInternalFrame telaConsultaCarro = null;
    private ConsultaClienteInternalFrame telaConsultaCliente = null;
    private VendasInternalFrame telaVendas = null;


    private void veiculosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosMenuItemActionPerformed
        if (telaCadCarro != null && telaCadCarro.isVisible()) {
            return;
        }
        telaCadCarro = new CadCarroInternalFrame();
        telaCadCarro.setVisible(true);
        principalDesktopPanel.add(telaCadCarro);
        principalDesktopPanel.setPreferredSize(telaCadCarro.getSize());
    }//GEN-LAST:event_veiculosMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void novoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoMenuItemActionPerformed
        if (telaVendas != null && telaVendas.isVisible()) {
            return;
        }
        telaVendas = new VendasInternalFrame();
        telaVendas.setVisible(true);
        principalDesktopPanel.add(telaVendas);
        principalDesktopPanel.setPreferredSize(telaVendas.getSize());
    }//GEN-LAST:event_novoMenuItemActionPerformed

    private void clienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteMenuItemActionPerformed
       if (telaCadCliente != null && telaCadCliente.isVisible()) {
            return;
        }
        telaCadCliente = new CadClienteInternalFrame();
        telaCadCliente.setVisible(true);
        principalDesktopPanel.add(telaCadCliente);
        principalDesktopPanel.setPreferredSize(telaCadCliente.getSize());
    }//GEN-LAST:event_clienteMenuItemActionPerformed

    private void pessoasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoasMenuItemActionPerformed
        if (telaConsultaCliente != null && telaConsultaCliente.isVisible()) {
            return;
        }
        telaConsultaCliente = new ConsultaClienteInternalFrame();
        telaConsultaCliente.setVisible(true);
        principalDesktopPanel.add(telaConsultaCliente);
        principalDesktopPanel.setPreferredSize(telaConsultaCliente.getSize());
    }//GEN-LAST:event_pessoasMenuItemActionPerformed

    private void estoqueMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueMenuItemActionPerformed
        if (telaConsultaCarro != null && telaConsultaCarro.isVisible()) {
            return;
        }
        telaConsultaCarro = new ConsultaCarroInternalFrame();
        telaConsultaCarro.setVisible(true);
        principalDesktopPanel.add(telaConsultaCarro);
        principalDesktopPanel.setPreferredSize(telaConsultaCarro.getSize());
    }//GEN-LAST:event_estoqueMenuItemActionPerformed

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        SobreFrame tela = new SobreFrame();
        tela.setVisible(true);
    }//GEN-LAST:event_sobreMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenu cadastrarMenu;
    private javax.swing.JMenuItem clienteMenuItem;
    private javax.swing.JMenu consultarMenu;
    private javax.swing.JMenuItem estoqueMenuItem;
    private javax.swing.JMenuItem novoMenuItem;
    private javax.swing.JMenuItem pessoasMenuItem;
    private javax.swing.JDesktopPane principalDesktopPanel;
    private javax.swing.JMenuBar principalMenuBar;
    private javax.swing.JScrollPane principalScrollPanel;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenuItem sobreMenuItem;
    private javax.swing.JMenuItem veiculosMenuItem;
    // End of variables declaration//GEN-END:variables

}