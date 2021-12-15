/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class EditInfoAdmin extends javax.swing.JFrame {

    /**
     * Method that receives the username from the previous page.
     */
    public void my_update(String str) {
        greeting.setText(str);
    }

    /**
     * Creates new form EditInfoAdmin
     */
    public EditInfoAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        passwordWarning = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        greeting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linear Equations Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Admin Info");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("First Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Username:");

        saveBtn.setText("Save");
        saveBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.setPreferredSize(new java.awt.Dimension(100, 29));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        passwordWarning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 0, 0));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("New Password:");

        greeting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greeting.setText("greeting");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameField)
                            .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(greeting)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordWarning)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        //stores the username content inside the variable str and carries the username to the previous Jframe
        String str = greeting.getText();
        AdminMenu obj = new AdminMenu();
        obj.my_update(str);
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        /**
         * Allows the admin to change first name, last name, username and
         * password into the program and database.
         */
        //stores the text fields inside variables
        String first_name = firstNameField.getText();
        String last_name = lastNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        //checks if all the fields are filled out
        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(null, "A required field is missing. Please fill out all required fields and try again.");

            //checks if the password contains at least 8 characters
        } else if (password.length() < 8) {
            passwordWarning.setText("Please enter at least 8 characters.");

        } else {

            try {

                //loads the database driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //gets a connection to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "*Dun04061620");

                //retrieves and stores the query
                String isTaken = "SELECT * FROM user WHERE username=?";

                //gets a statement from the connection
                PreparedStatement pstIsTaken = conn.prepareStatement(isTaken);

                //passses the parameters
                pstIsTaken.setString(1, usernameField.getText());

                //executes the query
                ResultSet rs = pstIsTaken.executeQuery();

                //checks is the username is already taken
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Username already taken!");

                } else {

                    //loads the database driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //inserts data into the user table
                    String update = "UPDATE user SET first_name=?, last_name=?, username=?, password=? WHERE password=? and is_admin = 'y'";

                    //gets a statement from the connection
                    PreparedStatement pstUpdate = conn.prepareStatement(update);

                    //passses the parameters
                    pstUpdate.setString(1, first_name);
                    pstUpdate.setString(2, last_name);
                    pstUpdate.setString(3, username);
                    pstUpdate.setString(4, password);
                    pstUpdate.setString(5, greeting.getText());
                    pstUpdate.execute();

                    //sets the warning to an empty string after the program is executed
                    passwordWarning.setText("");

                    JOptionPane.showMessageDialog(null, "The update was successful!");

                    //changes to admin menu
                    AdminMenu menu = new AdminMenu();
                    menu.setVisible(true);
                    setVisible(false);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed

        /**
         * Allows the admin to use the enter key instead of the save button.
         */
        //stores the text fields inside variables
        String first_name = firstNameField.getText();
        String last_name = lastNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();

        //checks if all the fields are filled out
        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(null, "A required field is missing. Please fill out all required fields and try again.");

            //checks if the password contains at least 8 characters
        } else if (password.length() < 8) {
            passwordWarning.setText("Please enter at least 8 characters.");

        } else {

            try {

                //loads the database driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //gets a connection to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "*Dun04061620");

                //retrieves and stores the query
                String isTaken = "SELECT * FROM user WHERE username=?";

                //gets a statement from the connection
                PreparedStatement pstIsTaken = conn.prepareStatement(isTaken);

                //passses the parameters
                pstIsTaken.setString(1, usernameField.getText());

                //executes the query
                ResultSet rs = pstIsTaken.executeQuery();

                //checks is the username is already taken
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Username already taken!");

                } else {

                    //loads the database driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    //inserts data into the user table
                    String update = "UPDATE user SET first_name=?, last_name=?, username=?, password=? WHERE password=? and is_admin = 'y'";

                    //gets a statement from the connection
                    PreparedStatement pstUpdate = conn.prepareStatement(update);

                    //passses the parameters
                    pstUpdate.setString(1, first_name);
                    pstUpdate.setString(2, last_name);
                    pstUpdate.setString(3, username);
                    pstUpdate.setString(4, password);
                    pstUpdate.setString(5, greeting.getText());
                    pstUpdate.execute();

                    //sets the warning to an empty string after the program is executed
                    passwordWarning.setText("");

                    JOptionPane.showMessageDialog(null, "The update was successful!");

                    //changes to admin menu
                    String str = usernameField.getText();
                    AdminMenu obj = new AdminMenu();
                    obj.my_update(str);
                    obj.setVisible(true);
                    dispose();

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_passwordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(EditInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInfoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
