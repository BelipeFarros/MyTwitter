package MyTwitter.view;

import MyTwitter.model.users.Perfil;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class SelectPerfilFrame extends javax.swing.JFrame {
    
    private DefaultListModel listaPerfil = new DefaultListModel();
    
    public SelectPerfilFrame() {
        initComponents();
        carregarPerfis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myTwitterLogo_jLabel3 = new javax.swing.JLabel();
        txtSelecionarPerfil_jLabel3 = new javax.swing.JLabel();
        innerBg_jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        selecionar_jButton = new javax.swing.JButton();
        cancel_jButton = new javax.swing.JButton();
        scroll_jScrollPane = new javax.swing.JScrollPane();
        listaPerfil_jList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 32, 48));

        myTwitterLogo_jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N
        myTwitterLogo_jLabel3.setText("jLabel1");

        txtSelecionarPerfil_jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtSelecionarPerfil_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        txtSelecionarPerfil_jLabel3.setText("MyTwitter/Selecionar Perfil usuário");

        innerBg_jPanel3.setBackground(new java.awt.Color(46, 47, 71));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selecionar perfil usuário:");
        jLabel4.setToolTipText("");

        selecionar_jButton.setBackground(new java.awt.Color(0, 204, 0));
        selecionar_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        selecionar_jButton.setForeground(new java.awt.Color(255, 255, 255));
        selecionar_jButton.setText("Selecionar");
        selecionar_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionar_jButtonActionPerformed(evt);
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
        listaPerfil_jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " item1", " ", " item2", " ", " item3", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPerfil_jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scroll_jScrollPane.setViewportView(listaPerfil_jList);

        javax.swing.GroupLayout innerBg_jPanel3Layout = new javax.swing.GroupLayout(innerBg_jPanel3);
        innerBg_jPanel3.setLayout(innerBg_jPanel3Layout);
        innerBg_jPanel3Layout.setHorizontalGroup(
            innerBg_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selecionar_jButton)
                .addGap(18, 18, 18)
                .addComponent(cancel_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scroll_jScrollPane)
        );
        innerBg_jPanel3Layout.setVerticalGroup(
            innerBg_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerBg_jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerBg_jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionar_jButton)
                    .addComponent(cancel_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myTwitterLogo_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSelecionarPerfil_jLabel3)
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(innerBg_jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTwitterLogo_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSelecionarPerfil_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerBg_jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selecionar_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionar_jButtonActionPerformed
        String perfilSelecionado = listaPerfil_jList.getSelectedValue();
        if(perfilSelecionado == null){
            JOptionPane.showMessageDialog(null, "Selecione um perfil!");
        } else {
            Perfil perfil = MainFrame.twitterController.getUsuario(perfilSelecionado);
            MainFrame.twitterController.setPerfilUsuario(perfil);
            JOptionPane.showMessageDialog(null, "O usuário " + perfilSelecionado + " é o perfil usuário!");
            dispose();
        }
    }//GEN-LAST:event_selecionar_jButtonActionPerformed

    private void cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_jButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_jButtonActionPerformed
    
    private void carregarPerfis(){
        listaPerfil_jList.setModel(listaPerfil);
        Vector<String> usuarios = MainFrame.twitterController.getUsuarios(true);
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
            java.util.logging.Logger.getLogger(SelectPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPerfilFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_jButton;
    private javax.swing.JPanel innerBg_jPanel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listaPerfil_jList;
    private javax.swing.JLabel myTwitterLogo_jLabel3;
    private javax.swing.JScrollPane scroll_jScrollPane;
    private javax.swing.JButton selecionar_jButton;
    private javax.swing.JLabel txtSelecionarPerfil_jLabel3;
    // End of variables declaration//GEN-END:variables
}
