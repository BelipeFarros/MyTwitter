package MyTwitter.view;

import MyTwitter.controller.MyTwitterController;
import MyTwitter.model.users.Perfil;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class MainFrame extends javax.swing.JFrame {
    
    public static MyTwitterController twitterController;
    
    public MainFrame() {
        initComponents();
        twitterController = new MyTwitterController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_bg = new javax.swing.JPanel();
        panel_sidebar = new javax.swing.JPanel();
        ItemAddSidebar_jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ItemCancelSidebar_jPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selectPerfilSidebar_jPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ItemPerfilSidebar_jPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchBar_Jtextfield = new javax.swing.JTextField();
        searchButton_JButton = new javax.swing.JButton();
        iconMyTwitter_jLabel = new javax.swing.JLabel();
        TitleMyTwitter_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyTwitter");
        setResizable(false);

        panel_bg.setBackground(new java.awt.Color(31, 32, 48));
        panel_bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel_sidebar.setBackground(new java.awt.Color(46, 47, 71));
        panel_sidebar.setPreferredSize(new java.awt.Dimension(200, 600));

        ItemAddSidebar_jPanel.setBackground(new java.awt.Color(113, 115, 173));
        ItemAddSidebar_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemAddSidebar_jPanelMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_plus_50px_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar perfil");

        javax.swing.GroupLayout ItemAddSidebar_jPanelLayout = new javax.swing.GroupLayout(ItemAddSidebar_jPanel);
        ItemAddSidebar_jPanel.setLayout(ItemAddSidebar_jPanelLayout);
        ItemAddSidebar_jPanelLayout.setHorizontalGroup(
            ItemAddSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemAddSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItemAddSidebar_jPanelLayout.setVerticalGroup(
            ItemAddSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemAddSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemAddSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ItemCancelSidebar_jPanel.setBackground(new java.awt.Color(113, 115, 173));
        ItemCancelSidebar_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemCancelSidebar_jPanelMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_50px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cancelar perfil");

        javax.swing.GroupLayout ItemCancelSidebar_jPanelLayout = new javax.swing.GroupLayout(ItemCancelSidebar_jPanel);
        ItemCancelSidebar_jPanel.setLayout(ItemCancelSidebar_jPanelLayout);
        ItemCancelSidebar_jPanelLayout.setHorizontalGroup(
            ItemCancelSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemCancelSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItemCancelSidebar_jPanelLayout.setVerticalGroup(
            ItemCancelSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemCancelSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemCancelSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        selectPerfilSidebar_jPanel.setBackground(new java.awt.Color(113, 115, 173));
        selectPerfilSidebar_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectPerfilSidebar_jPanelMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_50px_1.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Selecionar Perfil");

        javax.swing.GroupLayout selectPerfilSidebar_jPanelLayout = new javax.swing.GroupLayout(selectPerfilSidebar_jPanel);
        selectPerfilSidebar_jPanel.setLayout(selectPerfilSidebar_jPanelLayout);
        selectPerfilSidebar_jPanelLayout.setHorizontalGroup(
            selectPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPerfilSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectPerfilSidebar_jPanelLayout.setVerticalGroup(
            selectPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPerfilSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ItemPerfilSidebar_jPanel.setBackground(new java.awt.Color(113, 115, 173));
        ItemPerfilSidebar_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemPerfilSidebar_jPanelMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_50px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Perfil usuário");

        javax.swing.GroupLayout ItemPerfilSidebar_jPanelLayout = new javax.swing.GroupLayout(ItemPerfilSidebar_jPanel);
        ItemPerfilSidebar_jPanel.setLayout(ItemPerfilSidebar_jPanelLayout);
        ItemPerfilSidebar_jPanelLayout.setHorizontalGroup(
            ItemPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPerfilSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItemPerfilSidebar_jPanelLayout.setVerticalGroup(
            ItemPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPerfilSidebar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemPerfilSidebar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_sidebarLayout = new javax.swing.GroupLayout(panel_sidebar);
        panel_sidebar.setLayout(panel_sidebarLayout);
        panel_sidebarLayout.setHorizontalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ItemAddSidebar_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ItemCancelSidebar_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ItemPerfilSidebar_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(selectPerfilSidebar_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_sidebarLayout.setVerticalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidebarLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(ItemAddSidebar_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemCancelSidebar_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectPerfilSidebar_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemPerfilSidebar_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        searchBar_Jtextfield.setBackground(new java.awt.Color(46, 47, 71));
        searchBar_Jtextfield.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        searchBar_Jtextfield.setForeground(new java.awt.Color(255, 255, 255));
        searchBar_Jtextfield.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(46, 47, 71)));
        searchBar_Jtextfield.setMargin(new java.awt.Insets(2, 10, 2, 2));

        searchButton_JButton.setBackground(new java.awt.Color(42, 42, 57));
        searchButton_JButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        searchButton_JButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton_JButton.setText("Pesquisar");
        searchButton_JButton.setBorder(null);
        searchButton_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton_JButtonActionPerformed(evt);
            }
        });

        iconMyTwitter_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N

        TitleMyTwitter_jLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TitleMyTwitter_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleMyTwitter_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleMyTwitter_jLabel.setText("MyTwitter");
        TitleMyTwitter_jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(panel_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(searchButton_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(iconMyTwitter_jLabel))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchBar_Jtextfield)
                            .addComponent(TitleMyTwitter_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addComponent(panel_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(iconMyTwitter_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleMyTwitter_jLabel)
                .addGap(29, 29, 29)
                .addComponent(searchBar_Jtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemAddSidebar_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemAddSidebar_jPanelMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_ItemAddSidebar_jPanelMouseClicked

    private void ItemCancelSidebar_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemCancelSidebar_jPanelMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_ItemCancelSidebar_jPanelMouseClicked

    private void ItemPerfilSidebar_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemPerfilSidebar_jPanelMouseClicked
        if(MainFrame.twitterController.getPerfilUsuario() == null){
            JOptionPane.showMessageDialog(null, "Selecione um perfil usuario!");
            return;
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_ItemPerfilSidebar_jPanelMouseClicked

    private void searchButton_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton_JButtonActionPerformed
        String usuario = searchBar_Jtextfield.getText();
        Perfil perfilBuscado = twitterController.getUsuario(usuario);
        
        searchBar_Jtextfield.setText("");
        
        if(MainFrame.twitterController.getPerfilUsuario() == null){
            JOptionPane.showMessageDialog(null, "Selecione um perfil Usuario!");
            return;
        }
        
        if(perfilBuscado == null || !perfilBuscado.isAtivo()){
            JOptionPane.showMessageDialog(null, "Usuario inexistente ou inativo!");   
            return;
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchedPerfilFrame(perfilBuscado).setVisible(true);
            }
        }); 
    }//GEN-LAST:event_searchButton_JButtonActionPerformed

    private void selectPerfilSidebar_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectPerfilSidebar_jPanelMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPerfilFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_selectPerfilSidebar_jPanelMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ItemAddSidebar_jPanel;
    private javax.swing.JPanel ItemCancelSidebar_jPanel;
    private javax.swing.JPanel ItemPerfilSidebar_jPanel;
    private javax.swing.JLabel TitleMyTwitter_jLabel;
    private javax.swing.JLabel iconMyTwitter_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_sidebar;
    private javax.swing.JTextField searchBar_Jtextfield;
    private javax.swing.JButton searchButton_JButton;
    private javax.swing.JPanel selectPerfilSidebar_jPanel;
    // End of variables declaration//GEN-END:variables
}
