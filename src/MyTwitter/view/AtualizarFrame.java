package MyTwitter.view;

import MyTwitter.model.exceptions.UJCException;
import MyTwitter.model.exceptions.UNCException;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class AtualizarFrame extends javax.swing.JFrame {

    public AtualizarFrame() {
        initComponents();
        usuario_jTextField.setText(MainFrame.twitterController.getPerfilUsuario().getUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_jPanel = new javax.swing.JPanel();
        myTwitterLogo_jLabel = new javax.swing.JLabel();
        txtCadastro_jLabel = new javax.swing.JLabel();
        atualizar_jButton = new javax.swing.JButton();
        cancel_jButton = new javax.swing.JButton();
        innerBg_jPanel = new javax.swing.JPanel();
        txtNomeUsuario_jLabel = new javax.swing.JLabel();
        usuario_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyTwitter/Atualizar Perfil");
        setResizable(false);

        bg_jPanel.setBackground(new java.awt.Color(31, 32, 48));

        myTwitterLogo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N

        txtCadastro_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtCadastro_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastro_jLabel.setText("MyTwitter/Atualizar perfil");
        txtCadastro_jLabel.setToolTipText("");

        atualizar_jButton.setBackground(new java.awt.Color(0, 204, 0));
        atualizar_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        atualizar_jButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizar_jButton.setText("Atualizar");
        atualizar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_jButtonActionPerformed(evt);
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

        innerBg_jPanel.setBackground(new java.awt.Color(46, 47, 71));

        txtNomeUsuario_jLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtNomeUsuario_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeUsuario_jLabel.setText("Nome de usuário:");

        javax.swing.GroupLayout innerBg_jPanelLayout = new javax.swing.GroupLayout(innerBg_jPanel);
        innerBg_jPanel.setLayout(innerBg_jPanelLayout);
        innerBg_jPanelLayout.setHorizontalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerBg_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUsuario_jLabel)
                    .addComponent(usuario_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        innerBg_jPanelLayout.setVerticalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtNomeUsuario_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg_jPanelLayout = new javax.swing.GroupLayout(bg_jPanel);
        bg_jPanel.setLayout(bg_jPanelLayout);
        bg_jPanelLayout.setHorizontalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myTwitterLogo_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastro_jLabel)
                .addContainerGap(90, Short.MAX_VALUE))
            .addComponent(innerBg_jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizar_jButton)
                .addGap(18, 18, 18)
                .addComponent(cancel_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_jPanelLayout.setVerticalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTwitterLogo_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCadastro_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerBg_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizar_jButton)
                    .addComponent(cancel_jButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atualizar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_jButtonActionPerformed
        String username = usuario_jTextField.getText();
        try {
            MainFrame.twitterController.atualizar(username);
        } catch(UNCException ex) {
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso");
        } catch (UJCException ex) {
            JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado");
        }
        dispose();
    }//GEN-LAST:event_atualizar_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar_jButton;
    private javax.swing.JPanel bg_jPanel;
    private javax.swing.JButton cancel_jButton;
    private javax.swing.JPanel innerBg_jPanel;
    private javax.swing.JLabel myTwitterLogo_jLabel;
    private javax.swing.JLabel txtCadastro_jLabel;
    private javax.swing.JLabel txtNomeUsuario_jLabel;
    private javax.swing.JTextField usuario_jTextField;
    // End of variables declaration//GEN-END:variables
}
