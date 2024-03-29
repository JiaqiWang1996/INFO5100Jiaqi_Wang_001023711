
package UserInterface.TravelAgency;

import Business.TravelAgency.TravelAgency;
import Business.TravelOffice.TravelOffice;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SUNREN
 */
public class NewTravelOfficeJPanel extends javax.swing.JPanel {

    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    public NewTravelOfficeJPanel(TravelAgency travelAgency,JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency = travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.namejTextField.setEditable(true);
        this.userNamejTextField.setEditable(true);
        this.passwordjTextField.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        savejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        namejTextField = new javax.swing.JTextField();
        userNamejTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("User Name:");

        jLabel3.setText("Password:");

        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(userNamejTextField)
                            .addComponent(passwordjTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton)
                            .addComponent(savejButton))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(savejButton)
                .addGap(18, 18, 18)
                .addComponent(backjButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        boolean nameCorrect = false;
        boolean usernameCorrect = false;
        boolean passwordCorrect = false;
        String name = namejTextField.getText();
        if(name.equals("")||name.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input name start with space");
        }else if(travelAgency.isTravelOfficeNameDuplicated(name)){
            JOptionPane.showMessageDialog(null, "Please use another name, same name used");
        }else{
            nameCorrect = true;
        }

        String username = userNamejTextField.getText();
        if(username.equals("")||username.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input username start with space");
        }else if(travelAgency.isUserNameDuplicated(username)){
            JOptionPane.showMessageDialog(null, "Please use another user name, same user name used");
        }else{
            usernameCorrect = true;
        }

        String passWord = passwordjTextField.getText();
        if(passWord.equals("")||passWord.startsWith(" ")){
            JOptionPane.showMessageDialog(null, "Please do not input password start with space");
        }else{
            passwordCorrect = true;
        }

        if(nameCorrect&&usernameCorrect&&passwordCorrect){
            JOptionPane.showMessageDialog(null, "Successly add a new travel office!");
            TravelOffice to = travelAgency.addTravelOffice(name, username, passWord);
            System.out.println(to.getName());
            
            
            this.namejTextField.setText("");
            this.passwordjTextField.setText("");
            this.userNamejTextField.setText("");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);

        Component[] comps = cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageTravelOfficeJPanel){
                ManageTravelOfficeJPanel manage = (ManageTravelOfficeJPanel)comp;
                manage.populate();
            }
        }
    }//GEN-LAST:event_backjButtonActionPerformed

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
