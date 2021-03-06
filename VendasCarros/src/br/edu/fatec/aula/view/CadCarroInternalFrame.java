/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula.view;

import br.edu.fatec.aula.dao.CarrosDAO;
import br.edu.fatec.aula.model.Carros;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Guerino
 */
public class CadCarroInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadClienteInternalFrame
     */
    public CadCarroInternalFrame() {
        initComponents();
    }

    public void limpar() {
        modeloTextField.setText("");
        marcaTextField.setText("");
        corTextField.setText("");
        combustívelComboBox.setSelectedIndex(0);
        tipoComboBox.setSelectedIndex(0);
        motorFormattedTextField.setValue(null);
        anoFormattedTextField.setValue(null);
        kmFormattedTextField.setValue(null);
        valorFormattedTextField.setValue(null);
        arCheckBox.setSelected(false);
        hidraulicaCheckBox.setSelected(false);
        eletricaCheckBox.setSelected(false);
        rodaCheckBox.setSelected(false);
        multimidiaCheckBox.setSelected(false);
        sensorCheckBox.setSelected(false);
        bancoCheckBox.setSelected(false);
        estabilidadeCheckBox.setSelected(false);
        tracaoCheckBox.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoPanel = new javax.swing.JPanel();
        informacoesPanel = new javax.swing.JPanel();
        modeloLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        anoLabel = new javax.swing.JLabel();
        corLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        combustivelLabel = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        motorLabel = new javax.swing.JLabel();
        modeloTextField = new javax.swing.JTextField();
        corTextField = new javax.swing.JTextField();
        marcaTextField = new javax.swing.JTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        combustívelComboBox = new javax.swing.JComboBox<>();
        motorFormattedTextField = new javax.swing.JFormattedTextField();
        anoFormattedTextField = new javax.swing.JFormattedTextField();
        valorFormattedTextField = new javax.swing.JFormattedTextField();
        kmLabel = new javax.swing.JLabel();
        kmFormattedTextField = new javax.swing.JFormattedTextField();
        opcionaisPanel = new javax.swing.JPanel();
        arCheckBox = new javax.swing.JCheckBox();
        hidraulicaCheckBox = new javax.swing.JCheckBox();
        eletricaCheckBox = new javax.swing.JCheckBox();
        multimidiaCheckBox = new javax.swing.JCheckBox();
        rodaCheckBox = new javax.swing.JCheckBox();
        sensorCheckBox = new javax.swing.JCheckBox();
        tracaoCheckBox = new javax.swing.JCheckBox();
        estabilidadeCheckBox = new javax.swing.JCheckBox();
        bancoCheckBox = new javax.swing.JCheckBox();
        limparButtonPanel = new javax.swing.JPanel();
        limparButtonLabel = new javax.swing.JLabel();
        enviarButtonPanel = new javax.swing.JPanel();
        enviarButtonLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(218, 223, 225));
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Veículos");

        fundoPanel.setBackground(new java.awt.Color(204, 0, 0));

        informacoesPanel.setBackground(new java.awt.Color(204, 0, 0));
        informacoesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 13), new java.awt.Color(255, 255, 204))); // NOI18N

        modeloLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        modeloLabel.setForeground(new java.awt.Color(255, 255, 204));
        modeloLabel.setText("Modelo");

        marcaLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        marcaLabel.setForeground(new java.awt.Color(255, 255, 204));
        marcaLabel.setText("Marca");

        anoLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        anoLabel.setForeground(new java.awt.Color(255, 255, 204));
        anoLabel.setText("Ano");

        corLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        corLabel.setForeground(new java.awt.Color(255, 255, 204));
        corLabel.setText("Cor");

        tipoLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tipoLabel.setForeground(new java.awt.Color(255, 255, 204));
        tipoLabel.setText("Tipo");

        combustivelLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combustivelLabel.setForeground(new java.awt.Color(255, 255, 204));
        combustivelLabel.setText("Combustível");

        valorLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        valorLabel.setForeground(new java.awt.Color(255, 255, 204));
        valorLabel.setText("Valor");

        motorLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        motorLabel.setForeground(new java.awt.Color(255, 255, 204));
        motorLabel.setText("Motor");

        modeloTextField.setBackground(new java.awt.Color(204, 0, 0));
        modeloTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        modeloTextField.setToolTipText("Modelo do veículo");
        modeloTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        corTextField.setBackground(new java.awt.Color(204, 0, 0));
        corTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        corTextField.setToolTipText("Cor do veículo");
        corTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        marcaTextField.setBackground(new java.awt.Color(204, 0, 0));
        marcaTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        marcaTextField.setToolTipText("Marca do veículo");
        marcaTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tipoComboBox.setBackground(new java.awt.Color(240, 52, 52));
        tipoComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Carro", "Caminhão", "Caminhonete", "Moto" }));
        tipoComboBox.setToolTipText("Tipo do veículo");
        tipoComboBox.setAutoscrolls(true);
        tipoComboBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        combustívelComboBox.setBackground(new java.awt.Color(240, 52, 52));
        combustívelComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combustívelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Gasolina", "Etanol", "Diesel", "Flex", "Hibrido", "Elétrico" }));
        combustívelComboBox.setToolTipText("Tipo de combustivel do veículo");
        combustívelComboBox.setAutoscrolls(true);
        combustívelComboBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        motorFormattedTextField.setBackground(new java.awt.Color(204, 0, 0));
        motorFormattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        motorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        motorFormattedTextField.setToolTipText("Tamanho do motor do veículo");
        motorFormattedTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        anoFormattedTextField.setBackground(new java.awt.Color(204, 0, 0));
        anoFormattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            anoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        anoFormattedTextField.setToolTipText("Ano do veículo");
        anoFormattedTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        valorFormattedTextField.setBackground(new java.awt.Color(204, 0, 0));
        valorFormattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        valorFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        valorFormattedTextField.setToolTipText("Valor do veículo");
        valorFormattedTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        kmLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        kmLabel.setForeground(new java.awt.Color(255, 255, 204));
        kmLabel.setText("KM");

        kmFormattedTextField.setBackground(new java.awt.Color(204, 0, 0));
        kmFormattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        kmFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        kmFormattedTextField.setToolTipText("Kilometragem do veículo");
        kmFormattedTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout informacoesPanelLayout = new javax.swing.GroupLayout(informacoesPanel);
        informacoesPanel.setLayout(informacoesPanelLayout);
        informacoesPanelLayout.setHorizontalGroup(
            informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addComponent(combustivelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combustívelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modeloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(corLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corTextField)
                            .addComponent(modeloTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcaLabel)
                            .addComponent(tipoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addComponent(motorLabel)
                        .addGap(18, 18, 18)
                        .addComponent(motorFormattedTextField)))
                .addGap(18, 18, 18)
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addComponent(valorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFormattedTextField))
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addComponent(anoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(anoFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(informacoesPanelLayout.createSequentialGroup()
                        .addComponent(kmLabel)
                        .addGap(13, 13, 13)
                        .addComponent(kmFormattedTextField)))
                .addContainerGap())
        );
        informacoesPanelLayout.setVerticalGroup(
            informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacoesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combustivelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combustívelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opcionaisPanel.setBackground(new java.awt.Color(204, 0, 0));
        opcionaisPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2), "Opcionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 13), new java.awt.Color(255, 255, 204))); // NOI18N
        opcionaisPanel.setToolTipText("Opcionais do veículo");

        arCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        arCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        arCheckBox.setText("Ar Condicionado");
        arCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        hidraulicaCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        hidraulicaCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        hidraulicaCheckBox.setText("Direção Hidrualica");
        hidraulicaCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        eletricaCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        eletricaCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        eletricaCheckBox.setText("Direção Elétrica");
        eletricaCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        multimidiaCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        multimidiaCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        multimidiaCheckBox.setText("Central Multimidia");
        multimidiaCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        rodaCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        rodaCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        rodaCheckBox.setText("Roda de liga leve");
        rodaCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        sensorCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        sensorCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        sensorCheckBox.setText("Sensor de estacionamento");
        sensorCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tracaoCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        tracaoCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        tracaoCheckBox.setText("Controle de tração");
        tracaoCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        estabilidadeCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        estabilidadeCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        estabilidadeCheckBox.setText("Controle de estabilidade");
        estabilidadeCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bancoCheckBox.setBackground(new java.awt.Color(204, 0, 0));
        bancoCheckBox.setForeground(new java.awt.Color(255, 255, 204));
        bancoCheckBox.setText("Banco de couro");
        bancoCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout opcionaisPanelLayout = new javax.swing.GroupLayout(opcionaisPanel);
        opcionaisPanel.setLayout(opcionaisPanelLayout);
        opcionaisPanelLayout.setHorizontalGroup(
            opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arCheckBox)
                    .addComponent(hidraulicaCheckBox)
                    .addComponent(eletricaCheckBox))
                .addGap(166, 166, 166)
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rodaCheckBox)
                    .addComponent(multimidiaCheckBox)
                    .addComponent(sensorCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bancoCheckBox)
                    .addComponent(tracaoCheckBox)
                    .addComponent(estabilidadeCheckBox))
                .addContainerGap())
        );
        opcionaisPanelLayout.setVerticalGroup(
            opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionaisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arCheckBox)
                    .addComponent(multimidiaCheckBox)
                    .addComponent(tracaoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hidraulicaCheckBox)
                    .addComponent(rodaCheckBox)
                    .addComponent(estabilidadeCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opcionaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eletricaCheckBox)
                    .addComponent(sensorCheckBox)
                    .addComponent(bancoCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        limparButtonPanel.setBackground(new java.awt.Color(255, 0, 0));

        limparButtonLabel.setBackground(new java.awt.Color(255, 0, 0));
        limparButtonLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        limparButtonLabel.setForeground(new java.awt.Color(255, 255, 204));
        limparButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limparButtonLabel.setText("Limpar");
        limparButtonLabel.setToolTipText("Limpa os campos");
        limparButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparButtonLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limparButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limparButtonLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout limparButtonPanelLayout = new javax.swing.GroupLayout(limparButtonPanel);
        limparButtonPanel.setLayout(limparButtonPanelLayout);
        limparButtonPanelLayout.setHorizontalGroup(
            limparButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limparButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        limparButtonPanelLayout.setVerticalGroup(
            limparButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limparButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        enviarButtonPanel.setBackground(new java.awt.Color(255, 0, 0));

        enviarButtonLabel.setBackground(new java.awt.Color(231, 76, 60));
        enviarButtonLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        enviarButtonLabel.setForeground(new java.awt.Color(255, 255, 204));
        enviarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enviarButtonLabel.setText("Enviar");
        enviarButtonLabel.setToolTipText("Cadastrar veículo");
        enviarButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarButtonLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarButtonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarButtonLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enviarButtonPanelLayout = new javax.swing.GroupLayout(enviarButtonPanel);
        enviarButtonPanel.setLayout(enviarButtonPanelLayout);
        enviarButtonPanelLayout.setHorizontalGroup(
            enviarButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enviarButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        enviarButtonPanelLayout.setVerticalGroup(
            enviarButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enviarButtonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fundoPanelLayout = new javax.swing.GroupLayout(fundoPanel);
        fundoPanel.setLayout(fundoPanelLayout);
        fundoPanelLayout.setHorizontalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informacoesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcionaisPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fundoPanelLayout.createSequentialGroup()
                        .addComponent(limparButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fundoPanelLayout.setVerticalGroup(
            fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fundoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limparButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparButtonLabelMouseClicked
        this.limpar();
    }//GEN-LAST:event_limparButtonLabelMouseClicked

    private void enviarButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarButtonLabelMouseClicked

        if (modeloTextField.getText().equals("")
                || marcaTextField.getText().equals("")
                || corTextField.getText().equals("")
                || motorFormattedTextField.getText().equals("")
                || anoFormattedTextField.getText().equals("")
                || kmFormattedTextField.getText().equals("")
                || valorFormattedTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vazio, insira valores");
            return;
        }

        if (tipoComboBox.getSelectedItem().equals("Selecione")
                || combustívelComboBox.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "Escolha uma opção");
            return;
        }

        Carros veiculo = new Carros();
        veiculo.setAno(String.valueOf(anoFormattedTextField.getValue()));
        veiculo.setCilindradas(String.valueOf(motorFormattedTextField.getValue()));
        veiculo.setCombustivel(String.valueOf(combustívelComboBox.getSelectedItem()));
        veiculo.setCor(corTextField.getText());
        veiculo.setKm(String.valueOf(kmFormattedTextField.getValue()));
        veiculo.setMarca(marcaTextField.getText());
        veiculo.setModelo(modeloTextField.getText());
        veiculo.setTipo(String.valueOf(tipoComboBox.getSelectedItem()));

        String v = valorFormattedTextField.getText().replace(',', '.');
        Double valor = Double.parseDouble(v);
        veiculo.setValor(valor);

        String ar = "",
                hidraulica = "",
                eletrica = "",
                multimidia = "",
                roda = "",
                sensor = "",
                estabilidade = "",
                tracao = "",
                banco = "";
        if (arCheckBox.isSelected()) {
            ar = String.valueOf(arCheckBox.getText());
        }
        if (hidraulicaCheckBox.isSelected()) {
            hidraulica = String.valueOf(hidraulicaCheckBox.getText());
        }
        if (eletricaCheckBox.isSelected()) {
            eletrica = String.valueOf(eletricaCheckBox.getText());
        }
        if (multimidiaCheckBox.isSelected()) {
            multimidia = String.valueOf(multimidiaCheckBox.getText());
        }
        if (rodaCheckBox.isSelected()) {
            roda = String.valueOf(rodaCheckBox.getText());
        }
        if (sensorCheckBox.isSelected()) {
            sensor = String.valueOf(sensorCheckBox.getText());
        }
        if (estabilidadeCheckBox.isSelected()) {
            estabilidade = String.valueOf(estabilidadeCheckBox.getText());
        }
        if (tracaoCheckBox.isSelected()) {
            tracao = String.valueOf(tracaoCheckBox.getText());
        }
        if (bancoCheckBox.isSelected()) {
            banco = String.valueOf(bancoCheckBox.getText());
        }

        veiculo.setOpcional(banco + "," + tracao + "," + estabilidade + "," + sensor + ","
                + roda + "," + multimidia + "," + eletrica + "," + hidraulica + "," + ar);

        CarrosDAO carrosDAO = new CarrosDAO();
        carrosDAO.insere(veiculo);

        JOptionPane.showMessageDialog(this, "Veiculo cadastrado com sucesso com o ID:"
                + veiculo.getIdcarros());
        this.limpar();
    }//GEN-LAST:event_enviarButtonLabelMouseClicked

    private void limparButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparButtonLabelMouseEntered
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        limparButtonPanel.setBackground(new Color(255, 23, 23));
    }//GEN-LAST:event_limparButtonLabelMouseEntered

    private void limparButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparButtonLabelMouseExited
        getContentPane().setCursor(Cursor.getDefaultCursor());
        limparButtonPanel.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_limparButtonLabelMouseExited

    private void enviarButtonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarButtonLabelMouseEntered
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        enviarButtonPanel.setBackground(new Color(255, 23, 23));
    }//GEN-LAST:event_enviarButtonLabelMouseEntered

    private void enviarButtonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarButtonLabelMouseExited
        getContentPane().setCursor(Cursor.getDefaultCursor());
        enviarButtonPanel.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_enviarButtonLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField anoFormattedTextField;
    private javax.swing.JLabel anoLabel;
    private javax.swing.JCheckBox arCheckBox;
    private javax.swing.JCheckBox bancoCheckBox;
    private javax.swing.JLabel combustivelLabel;
    private javax.swing.JComboBox<String> combustívelComboBox;
    private javax.swing.JLabel corLabel;
    private javax.swing.JTextField corTextField;
    private javax.swing.JCheckBox eletricaCheckBox;
    private javax.swing.JLabel enviarButtonLabel;
    private javax.swing.JPanel enviarButtonPanel;
    private javax.swing.JCheckBox estabilidadeCheckBox;
    private javax.swing.JPanel fundoPanel;
    private javax.swing.JCheckBox hidraulicaCheckBox;
    private javax.swing.JPanel informacoesPanel;
    private javax.swing.JFormattedTextField kmFormattedTextField;
    private javax.swing.JLabel kmLabel;
    private javax.swing.JLabel limparButtonLabel;
    private javax.swing.JPanel limparButtonPanel;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField marcaTextField;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JTextField modeloTextField;
    private javax.swing.JFormattedTextField motorFormattedTextField;
    private javax.swing.JLabel motorLabel;
    private javax.swing.JCheckBox multimidiaCheckBox;
    private javax.swing.JPanel opcionaisPanel;
    private javax.swing.JCheckBox rodaCheckBox;
    private javax.swing.JCheckBox sensorCheckBox;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JCheckBox tracaoCheckBox;
    private javax.swing.JFormattedTextField valorFormattedTextField;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}
