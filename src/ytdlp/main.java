package ytdlp;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlLink = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ytdlp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        LinkTextField = new javax.swing.JTextField();
        DownloadButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(48, 48, 48));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        dlLink.setBackground(new java.awt.Color(48, 48, 48));
        dlLink.setPreferredSize(new java.awt.Dimension(507, 153));
        dlLink.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));
        jPanel2.setPreferredSize(new java.awt.Dimension(507, 75));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/b6a8d716-9c7b-40ec-bc44-6422d8b741a0 1.png"))); // NOI18N
        logo.setAlignmentX(10.0F);
        logo.setAlignmentY(10.0F);

        ytdlp.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ytdlp.setForeground(new java.awt.Color(255, 255, 255));
        ytdlp.setText("YTDLP");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ytdlp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ytdlp)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dlLink.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

        lblLink.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLink.setForeground(new java.awt.Color(255, 255, 255));
        lblLink.setText("Link:");
        dlLink.add(lblLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 111, -1, -1));

        LinkTextField.setBackground(new java.awt.Color(60, 60, 60));
        LinkTextField.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        LinkTextField.setForeground(new java.awt.Color(153, 153, 153));
        LinkTextField.setText("Paste your link here");
        LinkTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        LinkTextField.setPreferredSize(new java.awt.Dimension(329, 24));
        LinkTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LinkTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LinkTextFieldFocusLost(evt);
            }
        });
        LinkTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LinkTextFieldKeyPressed(evt);
            }
        });
        dlLink.add(LinkTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 108, 300, -1));

        DownloadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/DOWNLOAD.png"))); // NOI18N
        DownloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DownloadButtonMouseClicked(evt);
            }
        });
        DownloadButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DownloadButtonKeyPressed(evt);
            }
        });
        dlLink.add(DownloadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 114, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dlLink, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dlLink, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LinkTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LinkTextFieldFocusLost

        if (LinkTextField.getText().isEmpty()) {
            LinkTextField.setText("Paste your link here");
        }
    }//GEN-LAST:event_LinkTextFieldFocusLost

    private void LinkTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LinkTextFieldFocusGained
        if (LinkTextField.getText().equals("Paste your link here")) {
            LinkTextField.setText("");
        }
    }//GEN-LAST:event_LinkTextFieldFocusGained

    private void DownloadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadButtonMouseClicked
        downloadStart();
    }//GEN-LAST:event_DownloadButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(rootPane, "Do you want to exit?");
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void DownloadButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DownloadButtonKeyPressed


    }//GEN-LAST:event_DownloadButtonKeyPressed

    private void LinkTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LinkTextFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            downloadStart();
        }
    }//GEN-LAST:event_LinkTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DownloadButton;
    private javax.swing.JTextField LinkTextField;
    private javax.swing.JPanel dlLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ytdlp;
    // End of variables declaration//GEN-END:variables

    public void mp3CMD() throws IOException {
        try {
            String link = "yt-dlp.exe --extract-audio -P C:\\Users\\Visitor\\Desktop " + LinkTextField.getText();
            String command = "cmd /c start " + link;
            Runtime.getRuntime().exec(command);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mp4CMD() throws IOException {
        try {
            String link = "yt-dlp.exe -P C:\\Users\\Visitor\\Desktop " + LinkTextField.getText();
            String command = "cmd /c start " + link;
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void downloadStart() {
        String options[] = {"MP3", "MP4", "Cancel"};
        if (!LinkTextField.getText().isEmpty()) {
            if (LinkTextField.getText().contains("https://www.youtube.com") == true) {
                int response = JOptionPane.showOptionDialog(rootPane,
                        "Choose Download Format",
                        "Select an Option",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if (options[response].equals("MP3")) {
                    try {
                        mp3CMD();
                        LinkTextField.setText("");
                        System.out.println("Finish downloading");
                    } catch (IOException ex) {
                        System.err.println("MP3 download error: " + ex);
                    }
                } else if (options[response].equals("MP4")) {
                    try {
                        mp4CMD();
                        LinkTextField.setText("");
                    } catch (IOException ex) {
                        System.out.println("MP4 download error: " + ex);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Not a YouTube link");
                LinkTextField.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Paste a Youtube Link");
        }
    }
}
