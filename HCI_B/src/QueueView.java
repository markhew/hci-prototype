/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class QueueView extends JFrame {

    private final MainView parent;

    /**
     * Creates new form QueueView
     */
    public QueueView(MainView parent) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/handbrake-Icon.png"));
        this.setIconImage(icon.getImage());
        initComponents();
        this.parent = parent;
    }

    public QueueView() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/handbrake-Icon.png"));
        this.setIconImage(icon.getImage());
        initComponents();
        parent = null;
    }

    // snaps this window to the parent window
    public void updatePosition() {
        // snap window to parent
        Point parentLoc = parent.getLocation();
        parentLoc.x += parent.getWidth();
        this.setLocation(parentLoc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        btnClearQueue = new javax.swing.JButton();
        btnStartQueue = new javax.swing.JButton();
        comboDoWhenFinished = new javax.swing.JComboBox();
        lblDoWhenFinished = new javax.swing.JLabel();
        QueueStatusPanel = new javax.swing.JPanel();
        lblQueueStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        QueuePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        QueueItem = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTitleValue = new javax.swing.JLabel();
        lblChaptersValue = new javax.swing.JLabel();
        lblChapters = new javax.swing.JLabel();
        lblSourceValue = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        lblDestinationValue = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        btnEditQueueItem = new javax.swing.JButton();
        btnRemoveQueueItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollQueue = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(63, 160, 186));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(63, 160, 186));

        btnClearQueue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ClearQueue.png"))); // NOI18N
        btnClearQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearQueueActionPerformed(evt);
            }
        });

        btnStartQueue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StartQueue2.png"))); // NOI18N
        btnStartQueue.setBorderPainted(false);
        btnStartQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartQueueActionPerformed(evt);
            }
        });

        comboDoWhenFinished.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Do nothing", "Shut down", "Suspend", "Hibernate", "Lock system", "Log off", "Quit" }));

        lblDoWhenFinished.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDoWhenFinished.setText("When queue finishes:");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnClearQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(lblDoWhenFinished)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboDoWhenFinished, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderPanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(btnStartQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1048, Short.MAX_VALUE)))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboDoWhenFinished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDoWhenFinished))
                    .addComponent(btnClearQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(btnStartQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );

        QueueStatusPanel.setBackground(new java.awt.Color(63, 160, 186));

        lblQueueStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblQueueStatus.setText("Queue Ready");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("1 Job Pending");

        javax.swing.GroupLayout QueueStatusPanelLayout = new javax.swing.GroupLayout(QueueStatusPanel);
        QueueStatusPanel.setLayout(QueueStatusPanelLayout);
        QueueStatusPanelLayout.setHorizontalGroup(
            QueueStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueueStatusPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblQueueStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        QueueStatusPanelLayout.setVerticalGroup(
            QueueStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueueStatusPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(QueueStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueueStatus)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        QueuePanel.setBackground(new java.awt.Color(63, 160, 186));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        QueueItem.setBackground(new java.awt.Color(255, 255, 255));
        QueueItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitle.setText("Title:");

        lblTitleValue.setText("Movie1.mov");

        lblChaptersValue.setText("3 to 6");

        lblChapters.setText("Chapters:");

        lblSourceValue.setText("/usr/home/test.mpg");

        lblSource.setText("Source:");

        lblDestinationValue.setText("/usr/out/test_out.mkv");

        lblDestination.setText("Destination:");

        btnEditQueueItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditJob.png"))); // NOI18N
        btnEditQueueItem.setBorderPainted(false);
        btnEditQueueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditQueueItemActionPerformed(evt);
            }
        });

        btnRemoveQueueItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveJob.png"))); // NOI18N
        btnRemoveQueueItem.setBorderPainted(false);
        btnRemoveQueueItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveQueueItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QueueItemLayout = new javax.swing.GroupLayout(QueueItem);
        QueueItem.setLayout(QueueItemLayout);
        QueueItemLayout.setHorizontalGroup(
            QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueueItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitleValue))
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addComponent(lblDestination)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestinationValue))
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addComponent(lblChapters)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblChaptersValue))
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addComponent(lblSource)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSourceValue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 720, Short.MAX_VALUE)
                .addComponent(btnEditQueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveQueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        QueueItemLayout.setVerticalGroup(
            QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueueItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(lblTitleValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChapters)
                            .addComponent(lblChaptersValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSource)
                            .addComponent(lblSourceValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDestination)
                            .addComponent(lblDestinationValue)))
                    .addGroup(QueueItemLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(QueueItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoveQueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditQueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(scrollQueue);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(QueueItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout QueuePanelLayout = new javax.swing.GroupLayout(QueuePanel);
        QueuePanel.setLayout(QueuePanelLayout);
        QueuePanelLayout.setHorizontalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueuePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        QueuePanelLayout.setVerticalGroup(
            QueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueuePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QueuePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QueueStatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QueueStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QueuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearQueueActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_btnClearQueueActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.parent.resetQueueBtn();
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnStartQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartQueueActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_btnStartQueueActionPerformed

    private void btnEditQueueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditQueueItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_btnEditQueueItemActionPerformed

    private void btnRemoveQueueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveQueueItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Not implemented.");
    }//GEN-LAST:event_btnRemoveQueueItemActionPerformed

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
            java.util.logging.Logger.getLogger(QueueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueueView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel QueueItem;
    private javax.swing.JPanel QueuePanel;
    private javax.swing.JPanel QueueStatusPanel;
    private javax.swing.JButton btnClearQueue;
    private javax.swing.JButton btnEditQueueItem;
    private javax.swing.JButton btnRemoveQueueItem;
    private javax.swing.JButton btnStartQueue;
    private javax.swing.JComboBox comboDoWhenFinished;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChapters;
    private javax.swing.JLabel lblChaptersValue;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblDestinationValue;
    private javax.swing.JLabel lblDoWhenFinished;
    private javax.swing.JLabel lblQueueStatus;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblSourceValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleValue;
    private javax.swing.JScrollBar scrollQueue;
    // End of variables declaration//GEN-END:variables
}
