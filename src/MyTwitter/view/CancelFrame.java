package MyTwitter.view;

import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PIException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class CancelFrame extends javax.swing.JFrame {
    
    private DefaultListModel listaPerfil = new DefaultListModel();
    
    public CancelFrame() {
        initComponents();
        carregarPerfis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_jPanel = new javax.swing.JPanel();
        innerBg_jPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        desativar_jButton = new javax.swing.JButton();
        cancel_jButton = new javax.swing.JButton();
        scroll_jScrollPane = new javax.swing.JScrollPane();
        listaPerfil_jList = new javax.swing.JList<>();
        txtSelecionarPerfil_jLabel3 = new javax.swing.JLabel();
        myTwitterLogo_jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyTwitter/Cancelar Perfil");
        setResizable(false);

        bg_jPanel.setBackground(new java.awt.Color(31, 32, 48));

        innerBg_jPanel.setBackground(new java.awt.Color(46, 47, 71));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Desativar perfil:");
        jLabel4.setToolTipText("");

        desativar_jButton.setBackground(new java.awt.Color(0, 204, 0));
        desativar_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        desativar_jButton.setForeground(new java.awt.Color(255, 255, 255));
        desativar_jButton.setText("Desativar");
        desativar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativar_jButtonActionPerformed(evt);
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

        scroll_jScrollPane.setBackground(new java.awt.Color(46, 47, 71));
        scroll_jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listaPerfil_jList.setBackground(new java.awt.Color(46, 47, 71));
        listaPerfil_jList.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        listaPerfil_jList.setForeground(new java.awt.Color(255, 255, 255));
        listaPerfil_jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scroll_jScrollPane.setViewportView(listaPerfil_jList);

        javax.swing.GroupLayout innerBg_jPanelLayout = new javax.swing.GroupLayout(innerBg_jPanel);
        innerBg_jPanel.setLayout(innerBg_jPanelLayout);
        innerBg_jPanelLayout.setHorizontalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desativar_jButton)
                .addGap(18, 18, 18)
                .addComponent(cancel_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scroll_jScrollPane)
        );
        innerBg_jPanelLayout.setVerticalGroup(
            innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerBg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desativar_jButton)
                    .addComponent(cancel_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        txtSelecionarPerfil_jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtSelecionarPerfil_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        txtSelecionarPerfil_jLabel3.setText("MyTwitter/Desativar Perfil");

        myTwitterLogo_jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N
        myTwitterLogo_jLabel3.setText("jLabel1");

        javax.swing.GroupLayout bg_jPanelLayout = new javax.swing.GroupLayout(bg_jPanel);
        bg_jPanel.setLayout(bg_jPanelLayout);
        bg_jPanelLayout.setHorizontalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myTwitterLogo_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSelecionarPerfil_jLabel3)
                .addContainerGap(179, Short.MAX_VALUE))
            .addComponent(innerBg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_jPanelLayout.setVerticalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTwitterLogo_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSelecionarPerfil_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerBg_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void desativar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativar_jButtonActionPerformed
        String usuarioSelecionado = listaPerfil_jList.getSelectedValue();
        if(usuarioSelecionado == null){
            JOptionPane.showMessageDialog(null, "Selecione um perfil!");
        } else {
            try {
                MainFrame.twitterController.cancelarPerfil(usuarioSelecionado);
                JOptionPane.showMessageDialog(null, "Perfil desativado com sucesso!");
                dispose();
            } catch (PIException ex) {
                JOptionPane.showMessageDialog(null, "Perfil selecionado não existe!");
            } catch (PDException ex) {
                JOptionPane.showMessageDialog(null, "Perfil já desativado");
            } 
        }
    }//GEN-LAST:event_desativar_jButtonActionPerformed

    private void cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_jButtonActionPerformed
    
    private void carregarPerfis(){
        listaPerfil_jList.setModel(listaPerfil);
        Vector<String> usuarios = MainFrame.twitterController.getUsuarios();
        for(String s : usuarios) listaPerfil.add(0, s);
    }
    
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
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_jPanel;
    private javax.swing.JButton cancel_jButton;
    private javax.swing.JButton desativar_jButton;
    private javax.swing.JPanel innerBg_jPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> listaPerfil_jList;
    private javax.swing.JLabel myTwitterLogo_jLabel3;
    private javax.swing.JScrollPane scroll_jScrollPane;
    private javax.swing.JLabel txtSelecionarPerfil_jLabel3;
    // End of variables declaration//GEN-END:variables
}
