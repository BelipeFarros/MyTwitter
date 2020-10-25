package MyTwitter.view;

import MyTwitter.model.exceptions.MFPException;
import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PIException;
import MyTwitter.model.interfaces.IPerfilFrame;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class PerfilFrame extends javax.swing.JFrame implements IPerfilFrame{
    
    private DefaultListModel lista = new DefaultListModel();
    
    public PerfilFrame() {
        initComponents();
        loadPerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bg_jPanel = new javax.swing.JPanel();
        scrool_jScrollPane = new javax.swing.JScrollPane();
        tweets_jList = new javax.swing.JList<>();
        myTwitter_jLabel = new javax.swing.JLabel();
        myTwitterLogo_jLabel = new javax.swing.JLabel();
        username_jLabel = new javax.swing.JLabel();
        seguidoresName_jLabel = new javax.swing.JLabel();
        numSeguidores_jLabel = new javax.swing.JLabel();
        seguidosName_jLabel = new javax.swing.JLabel();
        numSeguidos_jLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTweet_jTextArea = new javax.swing.JTextArea();
        post_jButton = new javax.swing.JButton();
        timelineTweets_jButton = new javax.swing.JButton();
        ownTweets_jButton1 = new javax.swing.JButton();
        config_jLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyTwitter/Perfil");
        setResizable(false);

        bg_jPanel.setBackground(new java.awt.Color(31, 32, 48));

        scrool_jScrollPane.setBackground(new java.awt.Color(31, 32, 48));
        scrool_jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tweets_jList.setBackground(new java.awt.Color(31, 32, 48));
        tweets_jList.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        tweets_jList.setForeground(new java.awt.Color(255, 255, 255));
        scrool_jScrollPane.setViewportView(tweets_jList);

        myTwitter_jLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        myTwitter_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        myTwitter_jLabel.setText("MyTwitter/");

        myTwitterLogo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_64px_1.png"))); // NOI18N

        username_jLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        username_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        username_jLabel.setText("Username");

        seguidoresName_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        seguidoresName_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seguidoresName_jLabel.setText("Seguidores:");
        seguidoresName_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguidoresName_jLabelMouseClicked(evt);
            }
        });

        numSeguidores_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        numSeguidores_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        numSeguidores_jLabel.setText("XXXX");

        seguidosName_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        seguidosName_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seguidosName_jLabel.setText("Seguidos:");
        seguidosName_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguidosName_jLabelMouseClicked(evt);
            }
        });

        numSeguidos_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        numSeguidos_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        numSeguidos_jLabel.setText("XXXX");

        txtTweet_jTextArea.setBackground(new java.awt.Color(46, 47, 71));
        txtTweet_jTextArea.setColumns(20);
        txtTweet_jTextArea.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtTweet_jTextArea.setForeground(new java.awt.Color(255, 255, 255));
        txtTweet_jTextArea.setLineWrap(true);
        txtTweet_jTextArea.setRows(5);
        txtTweet_jTextArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(46, 47, 71)));
        jScrollPane2.setViewportView(txtTweet_jTextArea);

        post_jButton.setBackground(new java.awt.Color(42, 42, 57));
        post_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        post_jButton.setForeground(new java.awt.Color(255, 255, 255));
        post_jButton.setText("Post");
        post_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_jButtonActionPerformed(evt);
            }
        });

        timelineTweets_jButton.setBackground(new java.awt.Color(42, 42, 57));
        timelineTweets_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        timelineTweets_jButton.setForeground(new java.awt.Color(255, 255, 255));
        timelineTweets_jButton.setText("Timeline");
        timelineTweets_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelineTweets_jButtonActionPerformed(evt);
            }
        });

        ownTweets_jButton1.setBackground(new java.awt.Color(42, 42, 57));
        ownTweets_jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ownTweets_jButton1.setForeground(new java.awt.Color(255, 255, 255));
        ownTweets_jButton1.setText("Tweets próprios");
        ownTweets_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownTweets_jButton1ActionPerformed(evt);
            }
        });

        config_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_settings_50px.png"))); // NOI18N
        config_jLabel.setMaximumSize(new java.awt.Dimension(20, 20));
        config_jLabel.setMinimumSize(new java.awt.Dimension(20, 20));
        config_jLabel.setPreferredSize(new java.awt.Dimension(20, 20));
        config_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                config_jLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_jPanelLayout = new javax.swing.GroupLayout(bg_jPanel);
        bg_jPanel.setLayout(bg_jPanelLayout);
        bg_jPanelLayout.setHorizontalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrool_jScrollPane)
                    .addComponent(jScrollPane2)
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addComponent(myTwitterLogo_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myTwitter_jLabel)
                            .addGroup(bg_jPanelLayout.createSequentialGroup()
                                .addComponent(seguidoresName_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numSeguidores_jLabel)))
                        .addGap(7, 7, 7)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_jPanelLayout.createSequentialGroup()
                                .addComponent(seguidosName_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numSeguidos_jLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(username_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(config_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addComponent(ownTweets_jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timelineTweets_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(post_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bg_jPanelLayout.setVerticalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_jPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTwitterLogo_jLabel)
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myTwitter_jLabel)
                            .addComponent(username_jLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seguidoresName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numSeguidores_jLabel)
                            .addComponent(seguidosName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numSeguidos_jLabel)))
                    .addComponent(config_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownTweets_jButton1)
                    .addComponent(timelineTweets_jButton)
                    .addComponent(post_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrool_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void post_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_jButtonActionPerformed
        loadPerfil();
        
        String mensagem = txtTweet_jTextArea.getText();
        String usuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        
        try {
            MainFrame.twitterController.twittar(usuario, mensagem);
            addTweet(usuario, mensagem);
        } catch (PIException | MFPException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro!\n" + ex);
        } finally {
            txtTweet_jTextArea.setText("");
        }
    }//GEN-LAST:event_post_jButtonActionPerformed

    private void timelineTweets_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelineTweets_jButtonActionPerformed
        String usuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        Vector<String[]> tweets;
        try{
            tweets = MainFrame.twitterController.timeline(usuario);
            loadTweets(tweets);
        } catch (PIException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " inexistente!");
        } catch (PDException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " desativado!");
        }
    }//GEN-LAST:event_timelineTweets_jButtonActionPerformed

    private void ownTweets_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownTweets_jButton1ActionPerformed
        String usuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        Vector<String[]> tweets;
        try {
            tweets = MainFrame.twitterController.tweets(usuario);
            loadTweets(tweets);
        } catch (PIException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " inexistente!");
        } catch (PDException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " desativado!");
        }
        
    }//GEN-LAST:event_ownTweets_jButton1ActionPerformed

    private void seguidoresName_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguidoresName_jLabelMouseClicked
        String usuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        Vector<String> perfis;
        
        try{
            perfis = MainFrame.twitterController.seguidores(usuario);
            loadPerfil(perfis);
        } catch (PIException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " inexistente!");
        } catch (PDException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " desativado!");
        }
    }//GEN-LAST:event_seguidoresName_jLabelMouseClicked

    private void seguidosName_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguidosName_jLabelMouseClicked
        String usuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        Vector<String> perfis;
        
        try{
            perfis = MainFrame.twitterController.seguidos(usuario);
            loadPerfil(perfis);
        } catch (PIException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " inexistente!");
        } catch (PDException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " desativado!");
        }
    }//GEN-LAST:event_seguidosName_jLabelMouseClicked

    private void config_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_config_jLabelMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarFrame().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_config_jLabelMouseClicked
    
    @Override
    public void loadPerfil(){
        tweets_jList.setModel(lista);
        
        if(MainFrame.twitterController.getPerfilUsuario() != null){
            String username = MainFrame.twitterController.getPerfilUsuario().getUsuario();
            int numSeguidores = 0;
            int numSeguidos = 0;
            
            try {
                numSeguidores = MainFrame.twitterController.numSeguidores(username);
                numSeguidos = MainFrame.twitterController.numSeguidos(username);
                loadTweets(MainFrame.twitterController.timeline(username));
            } catch (PIException | PDException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + ex);
                dispose();
                return;
            }
            
            username_jLabel.setText(username);
            numSeguidores_jLabel.setText(Integer.toString(numSeguidores));
            numSeguidos_jLabel.setText(Integer.toString(numSeguidos));
        }  
    }
    
    @Override
    public void addTweet(String usuario, String mensagem){
        lista.add(0, usuario + " postou: ");
        lista.add(1, mensagem);
        lista.add(2, " ");
    }
    
    @Override
    public void loadTweets(Vector<String[]> tweets){
        lista.clear();
        for(String[] s : tweets){
            addTweet(s[0], s[1]);
        }
    }
    
    public void loadPerfil(Vector<String> perfis){
        lista.clear();
        for(String s : perfis){
            lista.add(0, s);
        }
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
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_jPanel;
    private javax.swing.JLabel config_jLabel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel myTwitterLogo_jLabel;
    private javax.swing.JLabel myTwitter_jLabel;
    private javax.swing.JLabel numSeguidores_jLabel;
    private javax.swing.JLabel numSeguidos_jLabel;
    private javax.swing.JButton ownTweets_jButton1;
    private javax.swing.JButton post_jButton;
    private javax.swing.JScrollPane scrool_jScrollPane;
    private javax.swing.JLabel seguidoresName_jLabel;
    private javax.swing.JLabel seguidosName_jLabel;
    private javax.swing.JButton timelineTweets_jButton;
    private javax.swing.JList<String> tweets_jList;
    private javax.swing.JTextArea txtTweet_jTextArea;
    private javax.swing.JLabel username_jLabel;
    // End of variables declaration//GEN-END:variables
}
