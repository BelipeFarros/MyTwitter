package MyTwitter.view;

import MyTwitter.model.exceptions.PEException;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class CadastroFrame extends javax.swing.JFrame {
    
    public CadastroFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outBg_jPanel = new javax.swing.JPanel();
        myTwitterLogo_jLabel = new javax.swing.JLabel();
        txtCadastro_jLabel = new javax.swing.JLabel();
        innerBg_jPanel = new javax.swing.JPanel();
        txtNomeUsuario_jLabel = new javax.swing.JLabel();
        txtCpfCnpj_jLabel = new javax.swing.JLabel();
        txtTipoConta_jLabel = new javax.swing.JLabel();
        usuario_jTextField = new javax.swing.JTextField();
        cpfCnpj_jTextField = new javax.swing.JTextField();
        tipoConta_jComboBox = new javax.swing.JComboBox<>();
        cadastrar_jButton = new javax.swing.JButton();
        cancel_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyTwitter/Cadastro");
        setResizable(false);

        outBg_jPanel.setBackground(new java.awt.Color(31, 32, 48));

        myTwitterLogo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N

        txtCadastro_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtCadastro_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastro_jLabel.setText("MyTwitter/Cadastro de perfil");
        txtCadastro_jLabel.setToolTipText("");

        innerBg_jPanel.setBackground(new java.awt.Color(46, 47, 71));
        innerBg_jPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(46, 47, 71)));

        txtNomeUsuario_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtNomeUsuario_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeUsuario_jLabel.setText("Nome de usuário:");

        txtCpfCnpj_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtCpfCnpj_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtCpfCnpj_jLabel.setText("CPF/CNPJ:");
        txtCpfCnpj_jLabel.setToolTipText("");

        txtTipoConta_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtTipoConta_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoConta_jLabel.setText("Tipo de conta:");

        tipoConta_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Juridica"}));

        javax.swing.GroupLayout innerBg_jPanelLayout = new javax.swing.GroupLayout(innerBg_jPanel);
        innerBg_jPanel.setLayout(innerBg_jPanelLayout);
        innerBg_jPanelLayout.setHorizontalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, innerBg_jPanelLayout.createSequentialGroup()
                        .addComponent(txtCpfCnpj_jLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, innerBg_jPanelLayout.createSequentialGroup()
                        .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpfCnpj_jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtNomeUsuario_jLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_jTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoConta_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTipoConta_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        innerBg_jPanelLayout.setVerticalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuario_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoConta_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeUsuario_jLabel)
                            .addComponent(txtTipoConta_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)))
                .addComponent(txtCpfCnpj_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfCnpj_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastrar_jButton.setBackground(new java.awt.Color(0, 204, 0));
        cadastrar_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cadastrar_jButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar_jButton.setText("Cadastrar");
        cadastrar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_jButtonActionPerformed(evt);
            }
        });

        cancel_jButton.setBackground(new java.awt.Color(255, 0, 51));
        cancel_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cancel_jButton.setForeground(new java.awt.Color(255, 255, 255));
        cancel_jButton.setText("Cancelar");
        cancel_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outBg_jPanelLayout = new javax.swing.GroupLayout(outBg_jPanel);
        outBg_jPanel.setLayout(outBg_jPanelLayout);
        outBg_jPanelLayout.setHorizontalGroup(
            outBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outBg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outBg_jPanelLayout.createSequentialGroup()
                        .addComponent(myTwitterLogo_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCadastro_jLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outBg_jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrar_jButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(outBg_jPanelLayout.createSequentialGroup()
                .addComponent(innerBg_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        outBg_jPanelLayout.setVerticalGroup(
            outBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outBg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTwitterLogo_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCadastro_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerBg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(outBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar_jButton)
                    .addComponent(cancel_jButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outBg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outBg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_jButtonActionPerformed
        String usuario = usuario_jTextField.getText();
        String tipoConta = tipoConta_jComboBox.getSelectedItem().toString();
        Long numeroRegistro = 0L;
        try{
            numeroRegistro = Long.parseLong(cpfCnpj_jTextField.getText());
            try{
                MainFrame.twitterController.cadastrar(usuario, tipoConta, numeroRegistro);
                JOptionPane.showMessageDialog(null, "Perfil cadastrado com sucesso!");
                dispose();
            } catch (PEException ex) {
                JOptionPane.showMessageDialog(null, "Perfil existente, tente cadastrar outro perfil");
            }
        } catch(HeadlessException | NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Campo CPF/CNPJ aceita apenas números");
            cpfCnpj_jTextField.setText("");
        }
    }//GEN-LAST:event_cadastrar_jButtonActionPerformed

    private void cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_jButton;
    private javax.swing.JButton cancel_jButton;
    private javax.swing.JTextField cpfCnpj_jTextField;
    private javax.swing.JPanel innerBg_jPanel;
    private javax.swing.JLabel myTwitterLogo_jLabel;
    private javax.swing.JPanel outBg_jPanel;
    private javax.swing.JComboBox<String> tipoConta_jComboBox;
    private javax.swing.JLabel txtCadastro_jLabel;
    private javax.swing.JLabel txtCpfCnpj_jLabel;
    private javax.swing.JLabel txtNomeUsuario_jLabel;
    private javax.swing.JLabel txtTipoConta_jLabel;
    private javax.swing.JTextField usuario_jTextField;
    // End of variables declaration//GEN-END:variables
}
