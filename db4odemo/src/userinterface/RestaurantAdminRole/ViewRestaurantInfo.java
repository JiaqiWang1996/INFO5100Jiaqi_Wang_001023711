/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wang
 */
public class ViewRestaurantInfo extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant res;
    /**
     * Creates new form ViewCustomerScreen
     */
    public ViewRestaurantInfo(JPanel rightPanel,EcoSystem system,String resName) {
        initComponents();
        this.userProcessContainer=rightPanel;
        this.ecosystem=system;
        this.res=this.ecosystem.getRestaurantDirectory().searchRestaurantByName(resName);
        if(this.res==null)
            JOptionPane.showMessageDialog(null, "System error occurred! Please log out!");
        else
            this.fill();
    }

    public void fill()
    {
        this.txtResname.setText(this.res.getRestaurantName());
        this.txtResInfo.setText(this.res.getRestaurantInfo());
        this.txtResname.setEnabled(false);
        this.txtResInfo.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        txtResname = new javax.swing.JTextField();
        txtResInfo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 95, -1));

        btnConfirm.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        btnConfirm.setText("Save");
        btnConfirm.setActionCommand("Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        txtResname.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        add(txtResname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 158, -1));

        txtResInfo.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        add(txtResInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 158, -1));

        jLabel1.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        jLabel1.setText("Name of the Restaurant");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jLabel2.setFont(new java.awt.Font("新宋体", 3, 14)); // NOI18N
        jLabel2.setText("Self introduction");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        btnBack.setFont(new java.awt.Font("微软雅黑 Light", 3, 18)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("View Restaurant Info");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        this.txtResname.setEnabled(true);
        this.txtResInfo.setEnabled(true);
        //this.btnConfirm.setVisible(true);
        //this.btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String resName=this.txtResname.getText();
        String resInfo=this.txtResInfo.getText();

        if(this.ecosystem.getRestaurantDirectory().searchRestaurantByName(resName)==null)
        {
            this.res.setRestaurantName(resName);
            this.res.setRestaurantInfo(resInfo);
            JOptionPane.showMessageDialog(null, "Restaurant information updated successfully!");
            this.txtResname.setEnabled(false);
            this.txtResInfo.setEnabled(false);
            //this.btnUpdate.setVisible(true);
            //this.btnConfirm.setVisible(false);
        }
        else
        {
            this.res.setRestaurantInfo(resInfo);
            this.txtResname.setEnabled(false);
            this.txtResInfo.setEnabled(false);
            //this.btnUpdate.setVisible(true);
            //this.btnConfirm.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Restaurant exist! Please choose another name!");
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.show(userProcessContainer, "userMain");
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtResInfo;
    private javax.swing.JTextField txtResname;
    // End of variables declaration//GEN-END:variables
}
