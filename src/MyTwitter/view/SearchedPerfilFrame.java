package MyTwitter.view;

import MyTwitter.model.exceptions.PDException;
import MyTwitter.model.exceptions.PIException;
import MyTwitter.model.exceptions.SIException;
import MyTwitter.model.interfaces.IPerfilFrame;
import MyTwitter.model.users.Perfil;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author felip
 */
public class SearchedPerfilFrame extends javax.swing.JFrame implements IPerfilFrame{
    
    private static Perfil perfil;
    private DefaultListModel listaTweets;
    
    public SearchedPerfilFrame(Perfil perfil) {
        this.listaTweets = new DefaultListModel();
        SearchedPerfilFrame.perfil = perfil;
        initComponents();
        loadPerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        seguir_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MyTwitter");
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

        numSeguidores_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        numSeguidores_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        numSeguidores_jLabel.setText("XXXX");

        seguidosName_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        seguidosName_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seguidosName_jLabel.setText("Seguidos:");

        numSeguidos_jLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        numSeguidos_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        numSeguidos_jLabel.setText("XXXX");

        seguir_jButton.setBackground(new java.awt.Color(42, 42, 57));
        seguir_jButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        seguir_jButton.setForeground(new java.awt.Color(255, 255, 255));
        seguir_jButton.setText("Seguir");
        seguir_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguir_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_jPanelLayout = new javax.swing.GroupLayout(bg_jPanel);
        bg_jPanel.setLayout(bg_jPanelLayout);
        bg_jPanelLayout.setHorizontalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addComponent(scrool_jScrollPane)
                        .addContainerGap())
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addComponent(myTwitterLogo_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_jPanelLayout.createSequentialGroup()
                                .addComponent(seguir_jButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bg_jPanelLayout.createSequentialGroup()
                                .addComponent(myTwitter_jLabel)
                                .addGap(7, 7, 7)
                                .addComponent(username_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(143, 143, 143))
                            .addGroup(bg_jPanelLayout.createSequentialGroup()
                                .addComponent(seguidoresName_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numSeguidores_jLabel)
                                .addGap(18, 18, 18)
                                .addComponent(seguidosName_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numSeguidos_jLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        bg_jPanelLayout.setVerticalGroup(
            bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_jPanelLayout.createSequentialGroup()
                .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_jPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myTwitter_jLabel)
                            .addComponent(username_jLabel))
                        .addGap(6, 6, 6)
                        .addGroup(bg_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seguidoresName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numSeguidores_jLabel)
                            .addComponent(numSeguidos_jLabel)
                            .addComponent(seguidosName_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_jPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(myTwitterLogo_jLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seguir_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrool_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void seguir_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguir_jButtonActionPerformed
        if(isFollowing(perfil.getUsuario())){
            JOptionPane.showMessageDialog(null, "Você já segue esse perfil");
            return;
        }
        
        if(MainFrame.twitterController.getPerfilUsuario() == null){
            JOptionPane.showMessageDialog(null, "Selecione um perfil usuario antes de seguir");
            return;
        }
        
        String seguidor = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        String seguido = perfil.getUsuario();
        try {
            MainFrame.twitterController.seguir(seguidor, seguido);
        } catch (PIException ex) {
            JOptionPane.showMessageDialog(null, "Perfil " + ex.getUsuario() + " inexistente");
        } catch (PDException ex) {
            JOptionPane.showMessageDialog(null, "Perfil"  + ex.getUsuario() +  "desativado");
        } catch (SIException ex) {
            JOptionPane.showMessageDialog(null, "Impossível seguir o perfil "  + ex.getUsuario());
        }
        loadPerfil();
    }//GEN-LAST:event_seguir_jButtonActionPerformed

    public boolean isFollowing(String usuario){
        Vector<String> seguidores = new Vector<>();
        String perfilUsuario = MainFrame.twitterController.getPerfilUsuario().getUsuario();
        
        try {
            seguidores = MainFrame.twitterController.seguidores(usuario);
        } catch (PIException | PDException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro\n" + ex);
        }
        
        return seguidores.contains(perfilUsuario);
    }
    
    @Override
    public void loadPerfil(){
        tweets_jList.setModel(listaTweets);
        
        if(perfil != null){
            String username = perfil.getUsuario();
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
            if(isFollowing(perfil.getUsuario())) seguir_jButton.setText("Seguindo");
            else seguir_jButton.setText("Seguir");
        }
    }
    
    @Override
    public void addTweet(String usuario, String mensagem){
        listaTweets.add(0, usuario + " postou: ");
        listaTweets.add(1, mensagem);
        listaTweets.add(2, " ");
    }
    
    @Override
    public void loadTweets(Vector<String[]> tweets){
        listaTweets.clear();
        for(String[] s : tweets){
            addTweet(s[0], s[1]);
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
            java.util.logging.Logger.getLogger(SearchedPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchedPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchedPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchedPerfilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchedPerfilFrame(perfil).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_jPanel;
    private javax.swing.JLabel myTwitterLogo_jLabel;
    private javax.swing.JLabel myTwitter_jLabel;
    private javax.swing.JLabel numSeguidores_jLabel;
    private javax.swing.JLabel numSeguidos_jLabel;
    private javax.swing.JScrollPane scrool_jScrollPane;
    private javax.swing.JLabel seguidoresName_jLabel;
    private javax.swing.JLabel seguidosName_jLabel;
    private javax.swing.JButton seguir_jButton;
    private javax.swing.JList<String> tweets_jList;
    private javax.swing.JLabel username_jLabel;
    // End of variables declaration//GEN-END:variables
}
