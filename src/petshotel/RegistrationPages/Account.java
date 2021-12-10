/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshotel.RegistrationPages;

import DataBase.pets_database;
import DataBase.user_database;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
/**
 *
 * @author huawei
 */
public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    public Account() {
        initComponents();
        getContentPane().setBackground(Color.WHITE); 
        setResizable(false);
        
        UserInfoLabel.setText(user_database.getUser_Info());
    }
//    String FirstName, LastName;
    DefaultListModel demoList = new DefaultListModel();


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        OnerNoteTextField = new javax.swing.JTextField();
        Age1RadioButton = new javax.swing.JRadioButton();
        Age2RadioButton = new javax.swing.JRadioButton();
        Age3RadioButton = new javax.swing.JRadioButton();
        PetsTypeComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddPetsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MyPetsList = new javax.swing.JList<>();
        LogOutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        UserInfoLabel = new javax.swing.JLabel();
        RemovePetButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DeletPetLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        OnerNoteTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OnerNoteTextField.setForeground(new java.awt.Color(153, 153, 255));
        OnerNoteTextField.setBorder(null);
        OnerNoteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnerNoteTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(Age1RadioButton);
        Age1RadioButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Age1RadioButton.setForeground(new java.awt.Color(102, 102, 255));
        Age1RadioButton.setText("less then 3 years");
        Age1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Age2RadioButton);
        Age2RadioButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Age2RadioButton.setForeground(new java.awt.Color(102, 102, 255));
        Age2RadioButton.setText("3-5 years");
        Age2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Age3RadioButton);
        Age3RadioButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Age3RadioButton.setForeground(new java.awt.Color(102, 102, 255));
        Age3RadioButton.setText("more then 5 years");

        PetsTypeComboBox.setBackground(new java.awt.Color(102, 102, 255));
        PetsTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Noun", "Cat", "Dog", "Fish", "Bird" }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Choose Your Pet Type:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Age of Your Pet:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Any Note You Want us to Know?");

        AddPetsButton.setBackground(new java.awt.Color(255, 255, 0));
        AddPetsButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AddPetsButton.setForeground(new java.awt.Color(51, 0, 204));
        AddPetsButton.setText("Add Pets");
        AddPetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPetsButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));

        jPanel3.setBackground(new java.awt.Color(51, 0, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(AddPetsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Age1RadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(Age2RadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(Age3RadioButton))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(OnerNoteTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PetsTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(PetsTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age1RadioButton)
                    .addComponent(Age2RadioButton)
                    .addComponent(Age3RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OnerNoteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPetsButton)
                .addContainerGap())
        );

        MyPetsList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Pets", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        MyPetsList.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        MyPetsList.setForeground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(MyPetsList);

        LogOutButton.setBackground(new java.awt.Color(255, 255, 51));
        LogOutButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(51, 0, 204));
        LogOutButton.setText("Log Out");

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 4));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Welcome Back");

        UserInfoLabel.setBackground(new java.awt.Color(255, 255, 255));
        UserInfoLabel.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        UserInfoLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(UserInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(74, 74, 74))
        );

        RemovePetButton.setText("Remove Pet");
        RemovePetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePetButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Clear All My Pet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DeletPetLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeletPetLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemovePetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(DeletPetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemovePetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DeletPetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OnerNoteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnerNoteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OnerNoteTextFieldActionPerformed

    private void Age1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age1RadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age1RadioButtonActionPerformed

    private void Age2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age2RadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age2RadioButtonActionPerformed
    String petsAge,petsType;
    private void AddPetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPetsButtonActionPerformed

         petsAge="null" ;petsType="null";
        if(PetsTypeComboBox.getSelectedItem()=="Noun")
        jLabel3.setText("must choose a type");
        else if(PetsTypeComboBox.getSelectedItem()=="Cat")
            petsType="1";
        else if(PetsTypeComboBox.getSelectedItem()=="Dog")
            petsType="2";
        else if(PetsTypeComboBox.getSelectedItem()=="Fish")
            petsType="3";
        else if(PetsTypeComboBox.getSelectedItem()=="Bird")
            petsType="4";
        
        if(Age1RadioButton.isSelected())
            petsAge="<3";
        else if (Age2RadioButton.isSelected())
            petsAge="3-5";
        else if (Age3RadioButton.isSelected())
            petsAge=">5";
        else 
        jLabel3.setText("must choose an Age");
        
        if(petsType!="null" && petsAge!="null")
        { pets_database.Insert_pets(petsType, petsAge, OnerNoteTextField.getText(),user_database.getUSER_ID());
          MyPetsList.setModel(demoList);
         demoList.addElement("the pet is"+PetsTypeComboBox.getSelectedItem()+" he is  "+petsAge+" your note about your pet is "+OnerNoteTextField.getText()+" ");
        }
        
        
    }//GEN-LAST:event_AddPetsButtonActionPerformed

    private void RemovePetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePetButtonActionPerformed

        if(MyPetsList.isSelectionEmpty()){
        DeletPetLabel.setText("Must Choose pet first");
     }else
        { demoList.remove(MyPetsList.getSelectedIndex());
          pets_database.delete_pet("3", "3-5", OnerNoteTextField.getText(),"gog@gmail.com");
        }
    }//GEN-LAST:event_RemovePetButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPetsButton;
    private javax.swing.JRadioButton Age1RadioButton;
    private javax.swing.JRadioButton Age2RadioButton;
    private javax.swing.JRadioButton Age3RadioButton;
    private javax.swing.JLabel DeletPetLabel;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JList<String> MyPetsList;
    private javax.swing.JTextField OnerNoteTextField;
    private javax.swing.JComboBox<String> PetsTypeComboBox;
    private javax.swing.JButton RemovePetButton;
    private javax.swing.JLabel UserInfoLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
