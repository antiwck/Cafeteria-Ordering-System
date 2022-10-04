package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class user_profile_page extends javax.swing.JFrame {

    public String userDetail = "";
    
    // Read user detail from file and display in text area
    public user_profile_page() {
        initComponents();
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/customer info.txt")));
            String line = "";
            while(s.hasNext()){
                line = s.nextLine();
                if (line.equalsIgnoreCase(customer_login.getUserID())){
                    userDetail += ("User ID       : " + line + "\n");
                    userDetail += ("User password : " + s.nextLine() + "\n");
                    userDetail += ("Name          : " + s.nextLine() + "\n");
                    s.nextLine();
                    userDetail += ("Email address : " + s.nextLine() + "\n");
                    userDetail += ("Contact       : " + s.nextLine() + "\n");
                    userDetail += ("Gender        : " + s.nextLine() + "\n");
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
        customerDetailsBox.setText(userDetail);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProfile = new javax.swing.JPanel();
        profileLabel = new javax.swing.JLabel();
        userDetailPanel = new javax.swing.JScrollPane();
        customerDetailsBox = new javax.swing.JTextArea();
        returnButton = new javax.swing.JButton();
        returnButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userProfile.setBackground(new java.awt.Color(51, 51, 51));

        profileLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(194, 194, 194));
        profileLabel.setText("Profile");

        userDetailPanel.setBorder(null);

        customerDetailsBox.setEditable(false);
        customerDetailsBox.setBackground(new java.awt.Color(73, 75, 77));
        customerDetailsBox.setColumns(20);
        customerDetailsBox.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        customerDetailsBox.setForeground(new java.awt.Color(194, 194, 194));
        customerDetailsBox.setRows(5);
        customerDetailsBox.setFocusable(false);
        userDetailPanel.setViewportView(customerDetailsBox);

        returnButton.setBackground(new java.awt.Color(81, 81, 81));
        returnButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnButton.setForeground(new java.awt.Color(194, 194, 194));
        returnButton.setText("Return to menu");
        returnButton.setBorder(null);
        returnButton.setFocusPainted(false);
        returnButton.setFocusable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        returnButton1.setBackground(new java.awt.Color(81, 81, 81));
        returnButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnButton1.setForeground(new java.awt.Color(194, 194, 194));
        returnButton1.setText("View receipts");
        returnButton1.setBorder(null);
        returnButton1.setFocusPainted(false);
        returnButton1.setFocusable(false);
        returnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userProfileLayout = new javax.swing.GroupLayout(userProfile);
        userProfile.setLayout(userProfileLayout);
        userProfileLayout.setHorizontalGroup(
            userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfileLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileLabel)
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addComponent(userDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(returnButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        userProfileLayout.setVerticalGroup(
            userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProfileLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(profileLabel)
                .addGroup(userProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userProfileLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userProfileLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        new menu_page(new menu_page().getMenuTable()).setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void returnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton1ActionPerformed
        this.setVisible(false);
        new view_receipt_page().setVisible(true);
    }//GEN-LAST:event_returnButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_profile_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea customerDetailsBox;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton returnButton1;
    private javax.swing.JScrollPane userDetailPanel;
    private javax.swing.JPanel userProfile;
    // End of variables declaration//GEN-END:variables

}
