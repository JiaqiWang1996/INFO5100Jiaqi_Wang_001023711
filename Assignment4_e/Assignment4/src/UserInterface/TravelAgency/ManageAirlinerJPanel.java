
package UserInterface.TravelAgency;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.TravelAgency.TravelAgency;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SUNREN
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    public ManageAirlinerJPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populate();
    }
    
    public void populate(){
        List<Airliner> airlinerList = travelAgency.getAirlinerDirectory().getAirlinerList();
        DefaultTableModel dtm = (DefaultTableModel)airlineJTable.getModel();
        dtm.setRowCount(0);
        
        for(Airliner al : airlinerList){
            Object[] row = new Object[airlineJTable.getColumnCount()];
            row[0] = al;
            row[1] = al.getName();
            row[2] = al.getAirplaneNum();
            row[3] = al.getFlightsNum();
            
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

        jLabel1 = new javax.swing.JLabel();
        viewAirLBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlineJTable = new javax.swing.JTable();
        newAirLBtn = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Manage Airliners");

        viewAirLBtn.setText("View Airliner");
        viewAirLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirLBtnActionPerformed(evt);
            }
        });

        airlineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Name", "Plane Number", "Flight Number"
            }
        ));
        jScrollPane1.setViewportView(airlineJTable);

        newAirLBtn.setText("New Airliner");
        newAirLBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirLBtnActionPerformed(evt);
            }
        });

        deletejButton.setText("Delete Airliner");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backjButton)
                    .addComponent(deletejButton)
                    .addComponent(newAirLBtn)
                    .addComponent(viewAirLBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(viewAirLBtn)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(newAirLBtn)
                .addGap(18, 18, 18)
                .addComponent(deletejButton)
                .addGap(18, 18, 18)
                .addComponent(backjButton)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewAirLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirLBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.airlineJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }else{
            Airliner airliner = (Airliner)this.airlineJTable.getValueAt(selectedRow, 0);
            ViewAirlinerJPanel view = new ViewAirlinerJPanel(airliner, cardSequenceJPanel);
            cardSequenceJPanel.add(view);
            CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_viewAirLBtnActionPerformed

    private void newAirLBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirLBtnActionPerformed
        // TODO add your handling code here:
        NewAirlinerJPanel newPanel = new NewAirlinerJPanel(travelAgency, cardSequenceJPanel);
        cardSequenceJPanel.add(newPanel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_newAirLBtnActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.airlineJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }else{
            Airliner airliner = (Airliner)this.airlineJTable.getValueAt(selectedRow, 0);
            travelAgency.removeAirliner(airliner);
            populate();
            JOptionPane.showMessageDialog(null, "Delete successfully!");
        }
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlineJTable;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAirLBtn;
    private javax.swing.JButton viewAirLBtn;
    // End of variables declaration//GEN-END:variables
}
