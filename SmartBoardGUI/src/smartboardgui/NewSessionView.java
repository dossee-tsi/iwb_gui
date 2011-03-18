/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewSessionView.java
 *
 * Created on Feb 5, 2011, 5:52:04 PM
 */

package smartboardgui;

import WSClient.sessions.Sessions;
import WSClient.sessions.SessionsService;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author HitchX
 */
public class NewSessionView extends javax.swing.JDialog {
    int _userID;
    /** Creates new form NewSessionView */
    public NewSessionView(java.awt.Frame parent, boolean modal,int userID) {
        super(parent, modal);
        initComponents();
        _userID = userID;

    }

    public NewSessionView(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        this.dispose();
    };

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bOk = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(smartboardgui.SmartBoardGUIApp.class).getContext().getResourceMap(NewSessionView.class);
        bOk.setText(resourceMap.getString("bOk.text")); // NOI18N
        bOk.setName("bOk"); // NOI18N
        bOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOkMouseClicked(evt);
            }
        });

        bCancel.setText(resourceMap.getString("bCancel.text")); // NOI18N
        bCancel.setName("bCancel"); // NOI18N
        bCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCancelMouseClicked(evt);
            }
        });

        tfName.setText(resourceMap.getString("tfName.text")); // NOI18N
        tfName.setName("tfName"); // NOI18N
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNameKeyPressed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bOk, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(bCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancel)
                    .addComponent(bOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOkMouseClicked
        if(!tfName.getText().equals("")){
        Sessions ws = new SessionsService().getSessionsPort();
        String result = ws.newSession(tfName.getText(), _userID);
        if(result.equals("Session with such a name already exists")){
            JOptionPane.showMessageDialog(this, "Session with such a name already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setVisible(false);
        this.dispose();
        }
    }//GEN-LAST:event_bOkMouseClicked

    private void bCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelMouseClicked
         this.setVisible(false);
         this.dispose();
    }//GEN-LAST:event_bCancelMouseClicked

    private void tfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            bOkMouseClicked(null);
        }
    }//GEN-LAST:event_tfNameKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewSessionView dialog = new NewSessionView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

}
