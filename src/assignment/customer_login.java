package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class customer_login extends javax.swing.JFrame {
    
    public static String name;
    protected static String userID;
    protected static String userPassword;
    
    // To return user id for other authentication purpose
    public static String getUserID(){
        return userID;
    }
    
    // The function to verify and log in user via cutomer info file
    public boolean customerLogin(String id, String password){
        userID = id;
        userPassword = password;
        
        String line;
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/customer info.txt")));
            while(s.hasNext()){
                line = s.nextLine();
                if (line.equalsIgnoreCase(userID)){
                    if ((line = s.nextLine()).equalsIgnoreCase(userPassword)){
                        name = s.nextLine();
                        return true;
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (s != null) {
                s.close();
            }
        }
        return false;
    }

    public customer_login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerLoginPanel = new javax.swing.JPanel();
        customerLoginLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        customerIDbox = new javax.swing.JTextField();
        passwordBox = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerLoginPanel.setBackground(new java.awt.Color(51, 51, 51));

        customerLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        customerLoginLabel.setForeground(new java.awt.Color(194, 194, 194));
        customerLoginLabel.setText("Customer Login");

        IDLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel.setText("ID            :");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(194, 194, 194));
        passwordLabel.setText("Password:");

        customerIDbox.setBackground(new java.awt.Color(153, 153, 153));
        customerIDbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customerIDbox.setToolTipText("User ID");
        customerIDbox.setBorder(null);
        customerIDbox.setPreferredSize(new java.awt.Dimension(60, 20));

        passwordBox.setBackground(new java.awt.Color(153, 153, 153));
        passwordBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordBox.setToolTipText("Password");
        passwordBox.setBorder(null);
        passwordBox.setPreferredSize(new java.awt.Dimension(60, 20));

        loginButton.setBackground(new java.awt.Color(81, 81, 81));
        loginButton.setForeground(new java.awt.Color(194, 194, 194));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(81, 81, 81));
        backButton.setForeground(new java.awt.Color(194, 194, 194));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerLoginPanelLayout = new javax.swing.GroupLayout(customerLoginPanel);
        customerLoginPanel.setLayout(customerLoginPanelLayout);
        customerLoginPanelLayout.setHorizontalGroup(
            customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerLoginPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerIDbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerLoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerLoginPanelLayout.createSequentialGroup()
                        .addComponent(customerLoginLabel)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerLoginPanelLayout.createSequentialGroup()
                        .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))))
        );
        customerLoginPanelLayout.setVerticalGroup(
            customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerLoginPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(customerLoginLabel)
                .addGap(39, 39, 39)
                .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(customerIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(customerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Verify whether customer is in database, true then continue else prompt error
        if (customerLogin(customerIDbox.getText(), String.valueOf(passwordBox.getPassword())) == true){
            this.setVisible(false);
            new menu_page().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid credential\nPassword reset is sent to your email", "Login error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new main_page().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField customerIDbox;
    private javax.swing.JLabel customerLoginLabel;
    private javax.swing.JPanel customerLoginPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
