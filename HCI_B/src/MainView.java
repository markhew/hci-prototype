
import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author markhew
 */
public class MainView extends javax.swing.JFrame {

    // queue window
    private QueueView queueView;
    private ActivityLogView alv;
    private static boolean queueShowing = false;
    private NewJobView nj;
    private ImageIcon addJob;
    private ImageIcon addJob2;
    private ImageIcon cancelJob;
    private ImageIcon cancelJob2;
    

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        setImages();
        jobToggleBtn.setBorderPainted(false);
        this.setResizable(false);
        // init progress bar
        jProgressBar2.setStringPainted(true);
        jProgressBar2.setString("Press start to transcode");

        // init queue view
        queueView = new QueueView(this);
        //init Activity log view
        alv = new ActivityLogView();

        
        // add event listener to watch this window position
        //this.addComponentListener(new MainViewWindowListener());
    }
    
    private void setImages(){
        addJob = new ImageIcon(getClass().getResource("/Images/AddJob.png"));
        addJob2 = new ImageIcon(getClass().getResource("/Images/AddJob2.png"));
        cancelJob = new ImageIcon(getClass().getResource("/Images/CancelJob.png"));
        cancelJob2 = new ImageIcon(getClass().getResource("/Images/CancelJob2.png"));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnViewQueue = new javax.swing.JButton();
        SettingsBtn = new javax.swing.JButton();
        ActivityLogBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jobToggleBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(70, 141, 169));

        btnViewQueue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ViewQueue.png"))); // NOI18N
        btnViewQueue.setActionCommand("ViewQueue");
        btnViewQueue.setBorderPainted(false);
        btnViewQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewQueueActionPerformed(evt);
            }
        });

        SettingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings.png"))); // NOI18N
        SettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsBtnActionPerformed(evt);
            }
        });

        ActivityLogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actitvity Log.png"))); // NOI18N
        ActivityLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivityLogBtnActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Help.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Start Queue.png"))); // NOI18N

        jobToggleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddJob.png"))); // NOI18N
        jobToggleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jobToggleBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jobToggleBtnMouseEntered(evt);
            }
        });
        jobToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobToggleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jobToggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(SettingsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(ActivityLogBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jobToggleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(SettingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ActivityLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewQueueActionPerformed
        // show the queue window
        if (queueView.isShowing()) {
            queueView.hide();
        } else {
            queueView.show();
        }
    }//GEN-LAST:event_btnViewQueueActionPerformed

    private void SettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsBtnActionPerformed
        // TODO add your handling code here:
        SettingsView s = new SettingsView();
        s.setVisible(true);
    }//GEN-LAST:event_SettingsBtnActionPerformed

    private void ActivityLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivityLogBtnActionPerformed
        // TODO add your handling code here:
        if(alv.isShowing()){
            alv.setVisible(false);
        }
        else {
            alv.setVisible(true);
        }
    }//GEN-LAST:event_ActivityLogBtnActionPerformed

    private void jobToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobToggleBtnActionPerformed
        // TODO add your handling code here:
        if (jobToggleBtn.isSelected()){
            nj = new NewJobView(this);
            nj.setVisible(true);
            jobToggleBtn.setIcon(cancelJob); // NOI18N
        }
        else{
            nj.setVisible(false);
            nj.dispose();
            jobToggleBtn.setIcon(addJob); // NOI18N

        }
    }//GEN-LAST:event_jobToggleBtnActionPerformed

    private void jobToggleBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobToggleBtnMouseEntered
        // TODO add your handling code here:
        if(!jobToggleBtn.isSelected()){
            this.jobToggleBtn.setIcon(addJob2); // NOI18N
        }
        else{
            this.jobToggleBtn.setIcon(cancelJob2);
        }
    }//GEN-LAST:event_jobToggleBtnMouseEntered

    private void jobToggleBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobToggleBtnMouseExited
        // TODO add your handling code here:
        if(!jobToggleBtn.isSelected()){
            this.jobToggleBtn.setIcon(addJob); // NOI18N
        }
        else{
            this.jobToggleBtn.setIcon(cancelJob);
        }
    }//GEN-LAST:event_jobToggleBtnMouseExited

    //Changes the new job toggle icon back to "Add Job" from cancel
    public void resetToggleBtn(){
        this.jobToggleBtn.setSelected(false);
        this.jobToggleBtn.setIcon(addJob); // NOI18N
    }
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

//    // event listener
//    class MainViewWindowListener implements ComponentListener {
//
//        @Override
//        public void componentResized(ComponentEvent e) {
//            queueView.updatePosition();
//        }
//
//        @Override
//        public void componentMoved(ComponentEvent e) {
//            queueView.updatePosition();
//        }
//
//        @Override
//        public void componentShown(ComponentEvent e) {
//        }
//
//        @Override
//        public void componentHidden(ComponentEvent e) {
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActivityLogBtn;
    private javax.swing.JButton SettingsBtn;
    private javax.swing.JButton btnViewQueue;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JToggleButton jobToggleBtn;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
