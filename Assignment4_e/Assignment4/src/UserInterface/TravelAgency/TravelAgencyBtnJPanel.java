
package UserInterface.TravelAgency;

import Business.Airliner.AirlinerDirectory;
import Business.TravelAgency.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SUNREN
 */
public class TravelAgencyBtnJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    
    
    public TravelAgencyBtnJPanel(TravelAgency travelAgency,JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageTavelOfficBtn = new javax.swing.JButton();
        manageAirlinerBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        manageTavelOfficBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageTavelOfficBtn.setText("Manage Travel Office");
        manageTavelOfficBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTavelOfficBtnActionPerformed(evt);
            }
        });

        manageAirlinerBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageAirlinerBtn.setText("Manage Airliners");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn)
                    .addComponent(manageAirlinerBtn)
                    .addComponent(manageTavelOfficBtn))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(manageTavelOfficBtn)
                .addGap(42, 42, 42)
                .addComponent(manageAirlinerBtn)
                .addGap(47, 47, 47)
                .addComponent(searchBtn)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageTavelOfficBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTavelOfficBtnActionPerformed
        // TODO add your handling code here:
        ManageTravelOfficeJPanel manageTO = new ManageTravelOfficeJPanel(travelAgency, cardSequenceJPanel);
        cardSequenceJPanel.add(manageTO);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_manageTavelOfficBtnActionPerformed

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
        ManageAirlinerJPanel manaAirliner = new ManageAirlinerJPanel(travelAgency,cardSequenceJPanel);
        cardSequenceJPanel.add(manaAirliner);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        ManageMasterTravelSchedulJPanel jPanel = new ManageMasterTravelSchedulJPanel(travelAgency,cardSequenceJPanel);
        cardSequenceJPanel.add(jPanel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JButton manageTavelOfficBtn;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
