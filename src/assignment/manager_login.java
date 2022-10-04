package assignment;

import javax.swing.JOptionPane;

public class manager_login extends javax.swing.JFrame {
    public manager_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managerLoginPanel = new javax.swing.JPanel();
        managerLoginLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        managerIDbox = new javax.swing.JTextField();
        passwordBox = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        managerLoginPanel.setBackground(new java.awt.Color(51, 51, 51));

        managerLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        managerLoginLabel.setForeground(new java.awt.Color(194, 194, 194));
        managerLoginLabel.setText("Manager Login");

        IDLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel.setText("ID            :");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(194, 194, 194));
        passwordLabel.setText("Password:");

        managerIDbox.setBackground(new java.awt.Color(153, 153, 153));
        managerIDbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managerIDbox.setToolTipText("Manager id");
        managerIDbox.setBorder(null);
        managerIDbox.setPreferredSize(new java.awt.Dimension(60, 20));

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

        javax.swing.GroupLayout managerLoginPanelLayout = new javax.swing.GroupLayout(managerLoginPanel);
        managerLoginPanel.setLayout(managerLoginPanelLayout);
        managerLoginPanelLayout.setHorizontalGroup(
            managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerLoginPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(managerIDbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(managerLoginPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(managerLoginPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(managerLoginLabel)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        managerLoginPanelLayout.setVerticalGroup(
            managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(managerLoginLabel)
                .addGap(34, 34, 34)
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(managerIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managerLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(managerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // Verify whether manager is in database, true then continue else prompt error
        if (managerIDbox.getText().equalsIgnoreCase("admin") && String.valueOf(passwordBox.getPassword()).equalsIgnoreCase("admin")){
            this.setVisible(false);
            new manager_functions().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid credential\nAuthentication failed!", "Login error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new main_page().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField managerIDbox;
    private javax.swing.JLabel managerLoginLabel;
    private javax.swing.JPanel managerLoginPanel;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
