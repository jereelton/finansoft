/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.finansoft.visualizar;

import br.com.finansoft.utils.FormataMoeda;
import javax.swing.JOptionPane;

/**
 *
 * @author jereelton
 */
public class InitialWindow extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public InitialWindow() {
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

        finansoftMainPanel = new javax.swing.JPanel();
        spendingDescriptionLabel = new javax.swing.JLabel();
        spendingValueLabel = new javax.swing.JLabel();
        spendingDateLabel = new javax.swing.JLabel();
        appNameLabel = new javax.swing.JLabel();
        appDescriptionLabel = new javax.swing.JLabel();
        currencyLabel = new javax.swing.JLabel();
        systemLogoLabel = new javax.swing.JLabel();
        othersExpensesTextField = new javax.swing.JTextField();
        expenseDescriptionComboBox = new javax.swing.JComboBox();
        otherExpensesCheckBox = new javax.swing.JCheckBox();
        adicionarDespesaJButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        expenseValueTextField = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        menuSistemaJMenuBar = new javax.swing.JMenuBar();
        menuSistemaJMenu = new javax.swing.JMenu();
        ItemMenuSairJMenuItem = new javax.swing.JMenuItem();
        menuFerramentasJMenu = new javax.swing.JMenu();
        itemMenuRelatoriosJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Financeiro");
        setMinimumSize(new java.awt.Dimension(600, 360));
        setResizable(false);

        finansoftMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        finansoftMainPanel.setMaximumSize(new java.awt.Dimension(800, 600));
        finansoftMainPanel.setMinimumSize(new java.awt.Dimension(600, 375));
        finansoftMainPanel.setPreferredSize(new java.awt.Dimension(600, 375));

        spendingDescriptionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        spendingDescriptionLabel.setText("Descrição Despesa");

        spendingValueLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        spendingValueLabel.setText("Valor Despesa");

        spendingDateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        spendingDateLabel.setText("Data Despesa");

        appNameLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        appNameLabel.setForeground(new java.awt.Color(0, 102, 204));
        appNameLabel.setText("FINANSOFT");

        appDescriptionLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        appDescriptionLabel.setText("Controle Financeiro Pessoal");

        currencyLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        currencyLabel.setText("R$");

        systemLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizar/imagens/icone_controle_financeiro.png"))); // NOI18N

        othersExpensesTextField.setEnabled(false);
        othersExpensesTextField.setMaximumSize(new java.awt.Dimension(190, 24));
        othersExpensesTextField.setMinimumSize(new java.awt.Dimension(190, 24));
        othersExpensesTextField.setPreferredSize(new java.awt.Dimension(190, 24));

        expenseDescriptionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma despesa...", "Gasolina", "Supermercado", "Farmacia", "Conta de Luz", "Conta de Agua", "Condominio", " " }));
        expenseDescriptionComboBox.setMaximumSize(new java.awt.Dimension(190, 24));
        expenseDescriptionComboBox.setMinimumSize(new java.awt.Dimension(190, 24));
        expenseDescriptionComboBox.setPreferredSize(new java.awt.Dimension(190, 24));
        expenseDescriptionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenseDescriptionComboBoxActionPerformed(evt);
            }
        });

        otherExpensesCheckBox.setText("Outras Despesas");
        otherExpensesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherExpensesCheckBoxActionPerformed(evt);
            }
        });

        adicionarDespesaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizar/imagens/icone_adicionar.png"))); // NOI18N
        adicionarDespesaJButton.setToolTipText("Adicionar Despesa");
        adicionarDespesaJButton.setMaximumSize(new java.awt.Dimension(80, 80));
        adicionarDespesaJButton.setMinimumSize(new java.awt.Dimension(80, 80));
        adicionarDespesaJButton.setPreferredSize(new java.awt.Dimension(80, 80));

        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizar/imagens/icone_limpar.png"))); // NOI18N
        clearButton.setToolTipText("Limpar Campos");
        clearButton.setMaximumSize(new java.awt.Dimension(80, 80));
        clearButton.setMinimumSize(new java.awt.Dimension(80, 80));
        clearButton.setPreferredSize(new java.awt.Dimension(80, 80));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizar/imagens/icone_salvar.png"))); // NOI18N
        saveButton.setToolTipText("Salvar Despesas");
        saveButton.setMaximumSize(new java.awt.Dimension(80, 80));
        saveButton.setMinimumSize(new java.awt.Dimension(80, 80));
        saveButton.setPreferredSize(new java.awt.Dimension(80, 80));

        expenseValueTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expenseValueTextField.setMaximumSize(new java.awt.Dimension(130, 24));
        expenseValueTextField.setMinimumSize(new java.awt.Dimension(130, 24));
        expenseValueTextField.setPreferredSize(new java.awt.Dimension(130, 24));
        expenseValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expenseValueTextFieldKeyReleased(evt);
            }
        });

        dateChooser.setPreferredSize(new java.awt.Dimension(87, 24));

        javax.swing.GroupLayout finansoftMainPanelLayout = new javax.swing.GroupLayout(finansoftMainPanel);
        finansoftMainPanel.setLayout(finansoftMainPanelLayout);
        finansoftMainPanelLayout.setHorizontalGroup(
            finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(systemLogoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appNameLabel)
                            .addComponent(appDescriptionLabel)))
                    .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                        .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(adicionarDespesaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(othersExpensesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spendingDescriptionLabel)
                                    .addComponent(expenseDescriptionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(otherExpensesCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(currencyLabel)
                                .addGap(2, 2, 2)
                                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spendingValueLabel)
                                    .addComponent(expenseValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spendingDateLabel)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        finansoftMainPanelLayout.setVerticalGroup(
            finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemLogoLabel)
                    .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(appNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spendingDescriptionLabel)
                    .addComponent(spendingValueLabel)
                    .addComponent(spendingDateLabel))
                .addGap(7, 7, 7)
                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finansoftMainPanelLayout.createSequentialGroup()
                        .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expenseDescriptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currencyLabel)
                            .addComponent(expenseValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherExpensesCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(othersExpensesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finansoftMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarDespesaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        menuSistemaJMenuBar.setMaximumSize(new java.awt.Dimension(600, 25));
        menuSistemaJMenuBar.setMinimumSize(new java.awt.Dimension(600, 25));
        menuSistemaJMenuBar.setPreferredSize(new java.awt.Dimension(600, 25));

        menuSistemaJMenu.setText("Sistema");
        menuSistemaJMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSistemaJMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSistemaJMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSistemaJMenu.setMaximumSize(new java.awt.Dimension(100, 25));
        menuSistemaJMenu.setMinimumSize(new java.awt.Dimension(100, 25));
        menuSistemaJMenu.setPreferredSize(new java.awt.Dimension(100, 25));

        ItemMenuSairJMenuItem.setText("Sair");
        ItemMenuSairJMenuItem.setMaximumSize(new java.awt.Dimension(200, 25));
        ItemMenuSairJMenuItem.setMinimumSize(new java.awt.Dimension(200, 25));
        ItemMenuSairJMenuItem.setPreferredSize(new java.awt.Dimension(200, 25));
        ItemMenuSairJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuSairJMenuItemActionPerformed(evt);
            }
        });
        menuSistemaJMenu.add(ItemMenuSairJMenuItem);

        menuSistemaJMenuBar.add(menuSistemaJMenu);

        menuFerramentasJMenu.setText("Ferramentas");
        menuFerramentasJMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuFerramentasJMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuFerramentasJMenu.setMaximumSize(new java.awt.Dimension(100, 25));
        menuFerramentasJMenu.setMinimumSize(new java.awt.Dimension(100, 25));
        menuFerramentasJMenu.setPreferredSize(new java.awt.Dimension(100, 25));

        itemMenuRelatoriosJMenuItem.setText("Relatórios");
        itemMenuRelatoriosJMenuItem.setMaximumSize(new java.awt.Dimension(200, 25));
        itemMenuRelatoriosJMenuItem.setMinimumSize(new java.awt.Dimension(200, 25));
        itemMenuRelatoriosJMenuItem.setPreferredSize(new java.awt.Dimension(200, 25));
        itemMenuRelatoriosJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRelatoriosJMenuItemActionPerformed(evt);
            }
        });
        menuFerramentasJMenu.add(itemMenuRelatoriosJMenuItem);

        menuSistemaJMenuBar.add(menuFerramentasJMenu);

        setJMenuBar(menuSistemaJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finansoftMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finansoftMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(610, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void expenseDescriptionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenseDescriptionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseDescriptionComboBoxActionPerformed

    private void otherExpensesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherExpensesCheckBoxActionPerformed

        if(otherExpensesCheckBox.isSelected()) {
        
            othersExpensesTextField.setEnabled(true);
            expenseDescriptionComboBox.setSelectedIndex(0);
            expenseDescriptionComboBox.setEnabled(false);
        
        } else {
        
            othersExpensesTextField.setEnabled(false);
            expenseDescriptionComboBox.setEnabled(true);
            
        }
        
    }//GEN-LAST:event_otherExpensesCheckBoxActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        expenseDescriptionComboBox.setSelectedIndex(0);
        expenseDescriptionComboBox.setEnabled(true);
        otherExpensesCheckBox.setSelected(false);
        othersExpensesTextField.setText("");
        othersExpensesTextField.setEnabled(false);
        expenseValueTextField.setText("");
        dateChooser.setDate(null);
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void ItemMenuSairJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuSairJMenuItemActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_ItemMenuSairJMenuItemActionPerformed

    private void itemMenuRelatoriosJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRelatoriosJMenuItemActionPerformed
        
        JOptionPane.showMessageDialog(this, "Função Relatórios");
        
    }//GEN-LAST:event_itemMenuRelatoriosJMenuItemActionPerformed

    private void expenseValueTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expenseValueTextFieldKeyReleased
        
        FormataMoeda formatoMoeda = new FormataMoeda(expenseValueTextField.getText());
        
        expenseValueTextField.setText(formatoMoeda.formatar());
        
    }//GEN-LAST:event_expenseValueTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(InitialWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitialWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitialWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitialWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InitialWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuSairJMenuItem;
    private javax.swing.JButton adicionarDespesaJButton;
    private javax.swing.JLabel appDescriptionLabel;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel currencyLabel;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JComboBox expenseDescriptionComboBox;
    private javax.swing.JTextField expenseValueTextField;
    private javax.swing.JPanel finansoftMainPanel;
    private javax.swing.JMenuItem itemMenuRelatoriosJMenuItem;
    private javax.swing.JMenu menuFerramentasJMenu;
    private javax.swing.JMenu menuSistemaJMenu;
    private javax.swing.JMenuBar menuSistemaJMenuBar;
    private javax.swing.JCheckBox otherExpensesCheckBox;
    private javax.swing.JTextField othersExpensesTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel spendingDateLabel;
    private javax.swing.JLabel spendingDescriptionLabel;
    private javax.swing.JLabel spendingValueLabel;
    private javax.swing.JLabel systemLogoLabel;
    // End of variables declaration//GEN-END:variables
}
