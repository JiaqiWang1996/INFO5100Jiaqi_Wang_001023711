/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Order;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wang
 */
public class ManageOrder extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant res;
    /**
     * Creates new form CustomerManagementScreen
     */
    public ManageOrder(JPanel userProcessContainer,EcoSystem ecosystem,String resName) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.res=this.ecosystem.getRestaurantDirectory().searchRestaurantByName(resName);
        if(res!=null)
            this.populate();
        else
            JOptionPane.showMessageDialog(null, "System error occurred! Please log out!");
    }
    public void populate()
    {
        DefaultTableModel dtm = (DefaultTableModel) tabMenu.getModel();
        dtm.setRowCount(0);
        for (Order i:this.res.getOrders()) {
            if(i.getResName().equals(this.res.getRestaurantName()))
            {
                Object row[] = new Object[3];
                row[0] = i;
                row[1] = i.totalPrice();
                row[2] = i.getStatus();
                dtm.addRow(row);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabMenu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("宋体", 3, 18)); // NOI18N
        btnBack.setText("<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 84, -1));

        tabMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Total Balance", "Current Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabMenu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, 510, 214));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Orders Management");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 0, -1, 32));

        btnProcess.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnProcess.setText("Take the order");
        btnProcess.setToolTipText("");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 348, -1, -1));

        btnDecline.setFont(new java.awt.Font("宋体", 3, 14)); // NOI18N
        btnDecline.setText("Reject the  order");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });
        add(btnDecline, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 348, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.show(userProcessContainer, "userMain");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabMenu.getSelectedRow();

        if (selectedRow >= 0) {
            Order item = (Order) tabMenu.getValueAt(selectedRow,0);
            if(this.res.getOrders().contains(item))
            {
                ProcessOrderScreen processOrder=new ProcessOrderScreen(this.userProcessContainer,this.ecosystem,item);
                this.userProcessContainer.add("ProcessOrderScreen",processOrder);
        
                CardLayout layout = (CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Order not exist");
            }
                
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabMenu.getSelectedRow();

        if (selectedRow >= 0) {
            Order item = (Order) tabMenu.getValueAt(selectedRow,0);
            if(this.res.getOrders().contains(item))
            {
                item.setStatus("Declined by restaurant");
                JOptionPane.showMessageDialog(null, "Order declined.");
                this.populate();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Order not exist");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabMenu;
    // End of variables declaration//GEN-END:variables
}
