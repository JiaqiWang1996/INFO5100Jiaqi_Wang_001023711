/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    private  JPanel userProcessContainer;
    private CarDirectory carDirectory;
     

    /**
     * Creates new form ManageAccountJPanel
     */


    ManageAccountJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
         //To change body of generated methods, choose Tools | Templates.
           initComponents();
           this.userProcessContainer=userProcessContainer;
           this.carDirectory=carDirectory;
           populateTable();
           txtLastestUpdateTime.setText(Long.toString(System.currentTimeMillis()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSreachBySerialNumber = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        txtSearchBySerialNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable();
        btnSearchByCapacity = new javax.swing.JButton();
        txtCapacityMinimum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCapacityMaxium = new javax.swing.JTextField();
        btnSearchByManufacturer = new javax.swing.JButton();
        btnShowCurrentlyAvailableCars = new javax.swing.JButton();
        txtSearchByManufacturer = new javax.swing.JTextField();
        btnSearchByProductionYear = new javax.swing.JButton();
        txtSearchByProductionYear = new javax.swing.JTextField();
        btnModelNumber = new javax.swing.JButton();
        txtModelNumber = new javax.swing.JTextField();
        btnShowAllManufacturers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLastestUpdateTime = new javax.swing.JTextField();
        btnavailByGivenCity = new javax.swing.JButton();
        txtShowAvailablecarsingivencity = new javax.swing.JTextField();
        btnallexpired = new javax.swing.JButton();
        btnShowUnavailableCars = new javax.swing.JButton();

        btnSreachBySerialNumber.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnSreachBySerialNumber.setText("Search By Serial Number");
        btnSreachBySerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSreachBySerialNumberActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeleteAccount.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "car", "Availability", "Manufacturer", "Production Year", "Capacity", "Serial Number", "Model Number", "City", "Maintenance Validation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAccounts);
        if (tblAccounts.getColumnModel().getColumnCount() > 0) {
            tblAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblAccounts.getColumnModel().getColumn(2).setResizable(false);
            tblAccounts.getColumnModel().getColumn(3).setResizable(false);
            tblAccounts.getColumnModel().getColumn(4).setResizable(false);
            tblAccounts.getColumnModel().getColumn(5).setResizable(false);
            tblAccounts.getColumnModel().getColumn(6).setResizable(false);
            tblAccounts.getColumnModel().getColumn(7).setResizable(false);
            tblAccounts.getColumnModel().getColumn(8).setResizable(false);
        }

        btnSearchByCapacity.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnSearchByCapacity.setText("Search By Capacity");
        btnSearchByCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByCapacityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("capacity range");

        btnSearchByManufacturer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnSearchByManufacturer.setText("Search By Manufacturer");
        btnSearchByManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByManufacturerActionPerformed(evt);
            }
        });

        btnShowCurrentlyAvailableCars.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnShowCurrentlyAvailableCars.setText("Show Currently Available Cars");
        btnShowCurrentlyAvailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCurrentlyAvailableCarsActionPerformed(evt);
            }
        });

        txtSearchByManufacturer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

        btnSearchByProductionYear.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnSearchByProductionYear.setText("Search By Production Year");
        btnSearchByProductionYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByProductionYearActionPerformed(evt);
            }
        });

        txtSearchByProductionYear.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N

        btnModelNumber.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnModelNumber.setText("List By Model Number");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        btnShowAllManufacturers.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnShowAllManufacturers.setText("Show All Manufacturers");
        btnShowAllManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllManufacturersActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("Latest update time");

        txtLastestUpdateTime.setEnabled(false);
        txtLastestUpdateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastestUpdateTimeActionPerformed(evt);
            }
        });

        btnavailByGivenCity.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnavailByGivenCity.setText("Show available cars in given city");
        btnavailByGivenCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavailByGivenCityActionPerformed(evt);
            }
        });

        btnallexpired.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnallexpired.setText("Show all expired maintenance certificates");
        btnallexpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallexpiredActionPerformed(evt);
            }
        });

        btnShowUnavailableCars.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        btnShowUnavailableCars.setText("Show Unavailable Cars");
        btnShowUnavailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUnavailableCarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastestUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSearchByProductionYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(btnSearchByManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSearchByManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchByProductionYear, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnShowCurrentlyAvailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShowUnavailableCars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnavailByGivenCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowAvailablecarsingivencity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModelNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSreachBySerialNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(btnSearchByCapacity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSearchBySerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCapacityMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCapacityMaxium)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowAllManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnallexpired))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteAccount, btnViewDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnViewDetails)
                                .addComponent(btnDeleteAccount))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLastestUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByManufacturer)
                    .addComponent(txtSearchByManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowCurrentlyAvailableCars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByProductionYear)
                    .addComponent(txtSearchByProductionYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowUnavailableCars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByCapacity)
                    .addComponent(txtCapacityMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapacityMaxium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowAllManufacturers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSreachBySerialNumber)
                    .addComponent(txtSearchBySerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnallexpired))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnavailByGivenCity)
                    .addComponent(txtShowAvailablecarsingivencity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeleteAccount, btnSearchByCapacity, btnSreachBySerialNumber, btnViewDetails});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCapacityMinimum, txtSearchBySerialNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSreachBySerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSreachBySerialNumberActionPerformed
        // TODO add your handling code here:

        Car result=carDirectory.searchBySerial_Number(txtSearchBySerialNumber.getText());
        if(result==null){
            JOptionPane.showMessageDialog(null, "Serical Number of the car you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            ViewAccountJPanel panel=new ViewAccountJPanel(userProcessContainer,result);
            userProcessContainer.add("ViewAccountJPanel",panel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_btnSreachBySerialNumberActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblAccounts.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Car car=(Car)tblAccounts.getValueAt(selectedRow, 0);
            ViewAccountJPanel panel=new ViewAccountJPanel(userProcessContainer,car);
            userProcessContainer.add("ViewAccountJPanel",panel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblAccounts.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogresult=JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?","Warning",dialogButton);
            if(dialogresult==JOptionPane.YES_OPTION){
               Car car=(Car)tblAccounts.getValueAt(selectedRow,0);
                carDirectory.deleteCar(car);
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchByCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByCapacityActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
       if(txtCapacityMinimum.getText().length()==0||txtCapacityMaxium.getText().length()==0){
        JOptionPane.showMessageDialog(null, "Capacity Range you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       for(Car car:carDirectory.getCarList()){
       if(car.getCapacity()<=Integer.parseInt(txtCapacityMaxium.getText())&&car.getCapacity()>=Integer.parseInt(txtCapacityMinimum.getText())){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       }
    }//GEN-LAST:event_btnSearchByCapacityActionPerformed

    private void btnSearchByManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByManufacturerActionPerformed
        // TODO add your handling code here:
       DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
       if(txtSearchByManufacturer.getText().length()==0){
        JOptionPane.showMessageDialog(null, "Manufacturer you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       for(Car car:carDirectory.getCarList()){
       if(car.getManufacturer().equals(txtSearchByManufacturer.getText())){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       }
    }//GEN-LAST:event_btnSearchByManufacturerActionPerformed

    private void btnSearchByProductionYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByProductionYearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
       if(txtSearchByProductionYear.getText().length()==0){
        JOptionPane.showMessageDialog(null, "Production you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       for(Car car:carDirectory.getCarList()){
       if(car.getProduction_Year()==Integer.parseInt(txtSearchByProductionYear.getText())){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       }
    }//GEN-LAST:event_btnSearchByProductionYearActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
       if(txtModelNumber.getText().length()==0){
        JOptionPane.showMessageDialog(null, "Model Number you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       for(Car car:carDirectory.getCarList()){
       if(car.getModel_Number().equals(txtModelNumber.getText())){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       }
    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void txtLastestUpdateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastestUpdateTimeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtLastestUpdateTimeActionPerformed

    private void btnavailByGivenCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavailByGivenCityActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
       if(txtShowAvailablecarsingivencity.getText().length()==0){
        JOptionPane.showMessageDialog(null, "City you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
       }
       else{
       for(Car car:carDirectory.getCarList()){
       if(car.getCity().equals(txtShowAvailablecarsingivencity.getText())&&car.getAvailability()==1){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       }
      
    }//GEN-LAST:event_btnavailByGivenCityActionPerformed

    private void btnShowCurrentlyAvailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCurrentlyAvailableCarsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
      for(Car car:carDirectory.getCarList()){
       if(car.getAvailability()==1){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       
    }//GEN-LAST:event_btnShowCurrentlyAvailableCarsActionPerformed

    private void btnShowAllManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllManufacturersActionPerformed
        // TODO add your handling code here:
        ArrayList<String>ManufacturerList=new ArrayList<String>();
        for(Car car:carDirectory.getCarList()){
            ManufacturerList.add(car.getManufacturer());
        }
         
        
         	for (int i = 0; i < ManufacturerList.size() - 1; i++) {
			for (int j = i + 1; j < ManufacturerList.size(); j++) {
				if (ManufacturerList.get(i).equals(ManufacturerList.get(j))) {
					ManufacturerList.remove(j);
					j--;
				}
			}
		}
           DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
      for(String car:ManufacturerList){
   
          Object[] row=new Object[1];
        row[0]=car;
        
           dtm.addRow(row);
       }
       
           
    
    }//GEN-LAST:event_btnShowAllManufacturersActionPerformed

    private void btnallexpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallexpiredActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
      for(Car car:carDirectory.getCarList()){
       if(car.getMaintenance_Validation()==0){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
       
        
    }//GEN-LAST:event_btnallexpiredActionPerformed

    private void btnShowUnavailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUnavailableCarsActionPerformed
        // TODO add your handling code here:
         DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
       dtm.setRowCount(0);//clear before set
      for(Car car:carDirectory.getCarList()){
       if(car.getAvailability()==0){
          Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
       }
       }
    }//GEN-LAST:event_btnShowUnavailableCarsActionPerformed

    private void populateTable() {
       //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm=(DefaultTableModel)tblAccounts.getModel();
        dtm.setRowCount(0);
        for(Car car:carDirectory.getCarList()){
        Object[] row=new Object[9];
        row[0]=car;
        row[1]=car.getAvailability();
         row[2]=car.getManufacturer();
         row[3]=car.getProduction_Year();
         row[4]=car.getCapacity();
         row[5]=car.getSerial_Number();
         row[6]=car.getModel_Number();
         row[7]=car.getCity();
         row[8]=car.getMaintenance_Validation();
       
           dtm.addRow(row);
} 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnSearchByCapacity;
    private javax.swing.JButton btnSearchByManufacturer;
    private javax.swing.JButton btnSearchByProductionYear;
    private javax.swing.JButton btnShowAllManufacturers;
    private javax.swing.JButton btnShowCurrentlyAvailableCars;
    private javax.swing.JButton btnShowUnavailableCars;
    private javax.swing.JButton btnSreachBySerialNumber;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnallexpired;
    private javax.swing.JButton btnavailByGivenCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtCapacityMaxium;
    private javax.swing.JTextField txtCapacityMinimum;
    private javax.swing.JTextField txtLastestUpdateTime;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSearchByManufacturer;
    private javax.swing.JTextField txtSearchByProductionYear;
    private javax.swing.JTextField txtSearchBySerialNumber;
    private javax.swing.JTextField txtShowAvailablecarsingivencity;
    // End of variables declaration//GEN-END:variables
}
