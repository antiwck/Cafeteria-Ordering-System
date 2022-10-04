package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class customer_registration extends javax.swing.JFrame {

    public customer_registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerRegistrationPanel = new javax.swing.JPanel();
        customerRegistrationLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        userPassword = new javax.swing.JTextField();
        cardNumber = new javax.swing.JTextField();
        userIDLabel1 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        userIDLabel2 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        userIDLabel3 = new javax.swing.JLabel();
        userIDLabel4 = new javax.swing.JLabel();
        profileCredentialLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        userIDLabel5 = new javax.swing.JLabel();
        contactInformationLabel = new javax.swing.JLabel();
        genderBox = new javax.swing.JComboBox<>();
        registerButton = new javax.swing.JButton();
        returnButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerRegistrationPanel.setBackground(new java.awt.Color(51, 51, 51));

        customerRegistrationLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        customerRegistrationLabel.setForeground(new java.awt.Color(194, 194, 194));
        customerRegistrationLabel.setText("Customer registration");

        firstName.setBackground(new java.awt.Color(153, 153, 153));
        firstName.setToolTipText("first name");
        firstName.setBorder(null);

        lastName.setBackground(new java.awt.Color(153, 153, 153));
        lastName.setToolTipText("last name");
        lastName.setBorder(null);

        customerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(194, 194, 194));
        customerNameLabel.setText("Customer name");

        userID.setBackground(new java.awt.Color(153, 153, 153));
        userID.setToolTipText("user id");
        userID.setBorder(null);

        userPassword.setBackground(new java.awt.Color(153, 153, 153));
        userPassword.setToolTipText("user password");
        userPassword.setBorder(null);

        cardNumber.setBackground(new java.awt.Color(153, 153, 153));
        cardNumber.setToolTipText("Card number (16 digits)");
        cardNumber.setBorder(null);

        userIDLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userIDLabel1.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel1.setText("Card number :");

        emailAddress.setBackground(new java.awt.Color(153, 153, 153));
        emailAddress.setToolTipText("email address");
        emailAddress.setBorder(null);

        userIDLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        userIDLabel2.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel2.setText("Email address");

        phoneNumber.setBackground(new java.awt.Color(153, 153, 153));
        phoneNumber.setToolTipText("phone number");
        phoneNumber.setBorder(null);

        userIDLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        userIDLabel3.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel3.setText("Phone number");

        userIDLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userIDLabel4.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel4.setText("Gender           :");

        profileCredentialLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profileCredentialLabel.setForeground(new java.awt.Color(194, 194, 194));
        profileCredentialLabel.setText("Profile credential");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(194, 194, 194));
        firstNameLabel.setText("First name");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(194, 194, 194));
        lastNameLabel.setText("Last name");

        userIDLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel.setText("User ID");

        userIDLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        userIDLabel5.setForeground(new java.awt.Color(194, 194, 194));
        userIDLabel5.setText("User password");

        contactInformationLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactInformationLabel.setForeground(new java.awt.Color(194, 194, 194));
        contactInformationLabel.setText("Contact information");

        genderBox.setBackground(new java.awt.Color(194, 194, 194));
        genderBox.setForeground(new java.awt.Color(0, 0, 0));
        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        registerButton.setBackground(new java.awt.Color(81, 81, 81));
        registerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(194, 194, 194));
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.setFocusPainted(false);
        registerButton.setFocusable(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        returnButton1.setBackground(new java.awt.Color(81, 81, 81));
        returnButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnButton1.setForeground(new java.awt.Color(194, 194, 194));
        returnButton1.setText("Return");
        returnButton1.setBorder(null);
        returnButton1.setFocusPainted(false);
        returnButton1.setFocusable(false);
        returnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerRegistrationPanelLayout = new javax.swing.GroupLayout(customerRegistrationPanel);
        customerRegistrationPanel.setLayout(customerRegistrationPanelLayout);
        customerRegistrationPanelLayout.setHorizontalGroup(
            customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerRegistrationPanelLayout.createSequentialGroup()
                        .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerRegistrationPanelLayout.createSequentialGroup()
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIDLabel2)
                                    .addComponent(contactInformationLabel))
                                .addGap(18, 18, 18)
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDLabel3)
                                    .addComponent(phoneNumber)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerRegistrationPanelLayout.createSequentialGroup()
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(profileCredentialLabel)
                                    .addComponent(customerNameLabel)
                                    .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                                        .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstNameLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customerRegistrationPanelLayout.createSequentialGroup()
                                .addComponent(userIDLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cardNumber))))
                        .addGap(29, 29, 29))
                    .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                        .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerRegistrationLabel)
                            .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIDLabel))
                                .addGap(18, 18, 18)
                                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDLabel5)
                                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(userIDLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        customerRegistrationPanelLayout.setVerticalGroup(
            customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerRegistrationPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(customerRegistrationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastName)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addComponent(profileCredentialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userPassword)
                    .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDLabel)
                    .addComponent(userIDLabel5))
                .addGap(18, 18, 18)
                .addComponent(contactInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneNumber)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIDLabel2)
                    .addComponent(userIDLabel3))
                .addGap(18, 18, 18)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDLabel4)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIDLabel1))
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerRegistrationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerRegistrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String first_name = firstName.getText();
        String last_name = lastName.getText();
        String user_ID = userID.getText();
        String user_password = userPassword.getText();
        String email_address = emailAddress.getText();
        String gender = String.valueOf(genderBox.getSelectedItem());
        try{
            String phone_number = phoneNumber.getText();
            String card_number = cardNumber.getText();
            // Check phone number validity
            if(phone_number.length() > 9 && phone_number.length() < 12){
                for(int i = 0; i < phone_number.length(); i++){
                    if(phone_number.charAt(i) < '0' || phone_number.charAt(i) > '9'){
                        throw new Exception();
                    }
                }
            }else{
                throw new Exception();
            }
            // Check card number validity
            if(card_number.length() == 16){
                for(int i = 0; i < card_number.length(); i++){
                    if(card_number.charAt(i) < '0' || card_number.charAt(i) > '9'){
                        throw new Exception();
                    }
                }
            }else{
                throw new Exception();
            }
            // Register new customer
            String new_customer = user_ID + "\n" + user_password + "\n" + first_name + " " + last_name + "\n" + card_number + "\n" + email_address + "\n" + phone_number + "\n" + gender + "\n\n";
            FileWriter output;
            try {
                output = new FileWriter("./src/assignment/customer info.txt", true);
                output.write(new_customer);
                output.close();
            } catch (IOException e) {
                try {
                    File f = new File("./src/assignment/customer info.txt");
                    output = new FileWriter(f);
                    output.write(new_customer);
                output.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error: File not found", "File Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: Invalid numerical input", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void returnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton1ActionPerformed
        this.setVisible(false);
        new manager_functions().setVisible(true);
    }//GEN-LAST:event_returnButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardNumber;
    private javax.swing.JLabel contactInformationLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerRegistrationLabel;
    private javax.swing.JPanel customerRegistrationPanel;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel profileCredentialLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton1;
    private javax.swing.JTextField userID;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel userIDLabel1;
    private javax.swing.JLabel userIDLabel2;
    private javax.swing.JLabel userIDLabel3;
    private javax.swing.JLabel userIDLabel4;
    private javax.swing.JLabel userIDLabel5;
    private javax.swing.JTextField userPassword;
    // End of variables declaration//GEN-END:variables
}
