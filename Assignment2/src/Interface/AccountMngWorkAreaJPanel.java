/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class AccountMngWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
 private CarDirectory carDirectory;

    /**
     * Creates new form AccountMngWorkAreaJPanel
     */
      AccountMngWorkAreaJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
       //To change body of generated methods, choose Tools | Templates.
       initComponents();
        this.userProcessContainer=userProcessContainer;
        this.carDirectory=carDirectory;//assign value
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateAccount = new javax.swing.JButton();
        btnMngAccount = new javax.swing.JButton();

        btnCreateAccount.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnMngAccount.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnMngAccount.setText("Manage Account ");
        btnMngAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMngAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(689, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMngAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateAccount, btnMngAccount});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
         CreateAccountJPanel panel=new CreateAccountJPanel(userProcessContainer,carDirectory);
         userProcessContainer.add("CreateAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnMngAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngAccountActionPerformed
        // TODO add your handling code here:
        ManageAccountJPanel panel=new ManageAccountJPanel(userProcessContainer,carDirectory);
        userProcessContainer.add("ManageAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMngAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnMngAccount;
    // End of variables declaration//GEN-END:variables
}
