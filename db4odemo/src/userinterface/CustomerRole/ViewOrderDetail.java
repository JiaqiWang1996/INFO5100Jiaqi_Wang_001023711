/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Restaurant.Order;
import Business.Restaurant.OrderItem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wang
 */
public class ViewOrderDetail extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Order order;
    /**
     * Creates new form CustomerManagementScreen
     */
    public ViewOrderDetail(JPanel userProcessContainer,EcoSystem ecosystem,Order order) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.order=order;
        this.populate();
       
        this.lblOrderStatus.setText("Status: "+order.getStatus());
        this.lblDelivery.setText("Delivery man: "+order.getDeliveryManName());
         if(this.order.getStatus().equals("Commented"))
        {
            this.txtComment.setText(this.order.getComment());
            this.btnPost.setEnabled(false);
        }
    }
     public void populate()
    {
        DefaultTableModel dtm = (DefaultTableModel) tabOrders.getModel();
        dtm.setRowCount(0);
        for (OrderItem i:this.order.getItems()) {
                Object row[] = new Object[2];
                row[0] = i.getDishAndPrice().getDishName();
                row[1] = i.getDishAndPrice().getPrice();
                dtm.addRow(row);
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

        jLabel7 = new javax.swing.JLabel();
        lblDelivery = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabOrders = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        btnPost = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("Order Detail");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, -1, 32));

        lblDelivery.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        lblDelivery.setText("Delivery man:");
        add(lblDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 161, -1, -1));

        lblOrderStatus.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        lblOrderStatus.setText("Status:");
        add(lblOrderStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 287, -1, -1));

        btnBack.setFont(new java.awt.Font("宋体", 3, 18)); // NOI18N
        btnBack.setText("<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 84, -1));

        tabOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Dish", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 38, 510, 95));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("We appreciate your timely feedback!!!");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 407, 391, 32));

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane2.setViewportView(txtComment);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 161, 391, 240));

        btnPost.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnPost.setText("Post the comment right now!");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });
        add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 376, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.show(userProcessContainer, "ViewOrders");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:
        order.setComment(this.txtComment.getText());
        order.setStatus("Commented");
        JOptionPane.showMessageDialog(null, "Comment posted!");
        this.btnPost.setEnabled(false);
    }//GEN-LAST:event_btnPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPost;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JTable tabOrders;
    private javax.swing.JTextArea txtComment;
    // End of variables declaration//GEN-END:variables
}
