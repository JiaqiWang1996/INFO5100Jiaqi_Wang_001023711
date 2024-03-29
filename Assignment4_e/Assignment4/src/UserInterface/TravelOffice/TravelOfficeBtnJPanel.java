/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelOffice;

import Business.TravelAgency.TravelAgency;
import Business.TravelOffice.TravelOffice;
import Business.UserAccount.UserAccount;
import UserInterface.TravelOffice.BookTicketJPanel;
import UserInterface.TravelOffice.ManageCustJPanel;
import UserInterface.TravelOffice.ManageTicketJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 25434
 */
public class TravelOfficeBtnJPanel extends javax.swing.JPanel {

    private TravelOffice travelOffice;
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    
    public TravelOfficeBtnJPanel(UserAccount userAccount, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.travelOffice = (TravelOffice) userAccount.getMember();
        this.cardSequenceJPanel = cardSequenceJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        manageCustomerBtn = new javax.swing.JButton();
        bookTicketBtn = new javax.swing.JButton();
        ManageTicketBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        manageCustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageCustomerBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        manageCustomerBtn.setText("Manage Customer");
        manageCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerBtnActionPerformed(evt);
            }
        });

        bookTicketBtn.setBackground(new java.awt.Color(255, 255, 255));
        bookTicketBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bookTicketBtn.setLabel("Book Ticket for Customer");
        bookTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketBtnActionPerformed(evt);
            }
        });

        ManageTicketBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageTicketBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ManageTicketBtn.setText("Manage Ticket");
        ManageTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTicketBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookTicketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ManageTicketBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageCustomerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(bookTicketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(manageCustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(ManageTicketBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerBtnActionPerformed
        // TODO add your handling code here:
        ManageCustJPanel panel = new ManageCustJPanel(cardSequenceJPanel, travelOffice);
        cardSequenceJPanel.add(panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_manageCustomerBtnActionPerformed

    private void bookTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketBtnActionPerformed
        // TODO add your handling code here:
        BookTicketJPanel panel = new BookTicketJPanel(cardSequenceJPanel, travelOffice);
        cardSequenceJPanel.add(panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_bookTicketBtnActionPerformed

    private void ManageTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTicketBtnActionPerformed
        // TODO add your handling code here:
        ManageTicketJPanel panel = new ManageTicketJPanel(cardSequenceJPanel,travelOffice);
        cardSequenceJPanel.add(panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_ManageTicketBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageTicketBtn;
    private javax.swing.JButton bookTicketBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton manageCustomerBtn;
    // End of variables declaration//GEN-END:variables
}
