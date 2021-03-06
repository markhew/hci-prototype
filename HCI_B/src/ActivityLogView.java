
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markhew
 */
public class ActivityLogView extends javax.swing.JFrame {

    private ImageIcon scan;
    private ImageIcon scan2;
    private ImageIcon encode;
    private ImageIcon encode2;

    /**
     * Creates new form ActivityLogView
     */
    public ActivityLogView() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/handbrake-Icon.png"));
        this.setIconImage(icon.getImage());
        initComponents();
        setImages();
        this.setSize(678, 562);
        this.setResizable(false);
    }

    private void setImages() {
        scan = new ImageIcon(getClass().getResource("/Images/ScanLog.png"));
        scan2 = new ImageIcon(getClass().getResource("/Images/ScanLog2.png"));
        encode = new ImageIcon(getClass().getResource("/Images/EncodeLog.png"));
        encode2 = new ImageIcon(getClass().getResource("/Images/EncodeLog2.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        activityLogPanel1 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        scanTab = new javax.swing.JPanel();
        encodeLogTab = new javax.swing.JPanel();
        clipBoardBtn = new javax.swing.JButton();
        logDirectoryBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("Copy to Clipboard");

        jLabel1.setText("Activity Log");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(85, 158, 184));

        activityLogPanel1.setBackground(new java.awt.Color(63, 160, 186));

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        scanTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout scanTabLayout = new javax.swing.GroupLayout(scanTab);
        scanTab.setLayout(scanTabLayout);
        scanTabLayout.setHorizontalGroup(
            scanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        scanTabLayout.setVerticalGroup(
            scanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Images/ScanLog2.png")), scanTab); // NOI18N

        encodeLogTab.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout encodeLogTabLayout = new javax.swing.GroupLayout(encodeLogTab);
        encodeLogTab.setLayout(encodeLogTabLayout);
        encodeLogTabLayout.setHorizontalGroup(
            encodeLogTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        encodeLogTabLayout.setVerticalGroup(
            encodeLogTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Images/EncodeLog.png")), encodeLogTab); // NOI18N

        clipBoardBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clipboard.png"))); // NOI18N
        clipBoardBtn.setBorder(null);
        clipBoardBtn.setBorderPainted(false);
        clipBoardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clipBoardBtnActionPerformed(evt);
            }
        });

        logDirectoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OpenLog.png"))); // NOI18N
        logDirectoryBtn.setBorder(null);
        logDirectoryBtn.setBorderPainted(false);
        logDirectoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logDirectoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout activityLogPanel1Layout = new javax.swing.GroupLayout(activityLogPanel1);
        activityLogPanel1.setLayout(activityLogPanel1Layout);
        activityLogPanel1Layout.setHorizontalGroup(
            activityLogPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityLogPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(activityLogPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(activityLogPanel1Layout.createSequentialGroup()
                        .addComponent(clipBoardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logDirectoryBtn)
                        .addContainerGap())))
        );
        activityLogPanel1Layout.setVerticalGroup(
            activityLogPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityLogPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(activityLogPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clipBoardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logDirectoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addContainerGap())
        );

        jLabel2.setText("Actitvty Log");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activityLogPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activityLogPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        // TODO add your handling code here:
        if (tabbedPane.getTabCount() > 1) {
            if (tabbedPane.getSelectedIndex() == 0) {
                tabbedPane.setIconAt(0, scan2);
                tabbedPane.setIconAt(1, encode);
            } else {
                tabbedPane.setIconAt(0, scan);
                tabbedPane.setIconAt(1, encode2);
            }
        }
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void logDirectoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logDirectoryBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_logDirectoryBtnActionPerformed

    private void clipBoardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clipBoardBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_clipBoardBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ActivityLogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActivityLogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActivityLogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActivityLogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityLogView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activityLogPanel1;
    private javax.swing.JButton clipBoardBtn;
    private javax.swing.JPanel encodeLogTab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logDirectoryBtn;
    private javax.swing.JPanel scanTab;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
