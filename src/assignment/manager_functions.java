package assignment;

public class manager_functions extends javax.swing.JFrame {

    public manager_functions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        managerLoginPanel = new javax.swing.JPanel();
        managerFunctionLabel = new javax.swing.JLabel();
        menuModificationButton = new javax.swing.JButton();
        customerRegistrationButton1 = new javax.swing.JButton();
        paymentOverviewButton = new javax.swing.JButton();
        feedbackOverviewButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        managerLoginPanel.setBackground(new java.awt.Color(51, 51, 51));

        managerFunctionLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        managerFunctionLabel.setForeground(new java.awt.Color(194, 194, 194));
        managerFunctionLabel.setText("Manager functions");

        menuModificationButton.setBackground(new java.awt.Color(81, 81, 81));
        menuModificationButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menuModificationButton.setForeground(new java.awt.Color(194, 194, 194));
        menuModificationButton.setText("Menu modification");
        menuModificationButton.setBorder(null);
        menuModificationButton.setFocusable(false);
        menuModificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificationButtonActionPerformed(evt);
            }
        });

        customerRegistrationButton1.setBackground(new java.awt.Color(81, 81, 81));
        customerRegistrationButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        customerRegistrationButton1.setForeground(new java.awt.Color(194, 194, 194));
        customerRegistrationButton1.setText("Customer registration");
        customerRegistrationButton1.setBorder(null);
        customerRegistrationButton1.setFocusable(false);
        customerRegistrationButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRegistrationButton1ActionPerformed(evt);
            }
        });

        paymentOverviewButton.setBackground(new java.awt.Color(81, 81, 81));
        paymentOverviewButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paymentOverviewButton.setForeground(new java.awt.Color(194, 194, 194));
        paymentOverviewButton.setText("Payment overview");
        paymentOverviewButton.setBorder(null);
        paymentOverviewButton.setFocusable(false);
        paymentOverviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentOverviewButtonActionPerformed(evt);
            }
        });

        feedbackOverviewButton.setBackground(new java.awt.Color(81, 81, 81));
        feedbackOverviewButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        feedbackOverviewButton.setForeground(new java.awt.Color(194, 194, 194));
        feedbackOverviewButton.setText("Feedback overview");
        feedbackOverviewButton.setBorder(null);
        feedbackOverviewButton.setFocusable(false);
        feedbackOverviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackOverviewButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(81, 81, 81));
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(194, 194, 194));
        exitButton.setText("Exit");
        exitButton.setBorder(null);
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managerLoginPanelLayout = new javax.swing.GroupLayout(managerLoginPanel);
        managerLoginPanel.setLayout(managerLoginPanelLayout);
        managerLoginPanelLayout.setHorizontalGroup(
            managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerLoginPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(managerFunctionLabel))
                    .addGroup(managerLoginPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                                .addComponent(customerRegistrationButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(paymentOverviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                                .addComponent(menuModificationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(feedbackOverviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerLoginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        managerLoginPanelLayout.setVerticalGroup(
            managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(managerFunctionLabel)
                .addGap(26, 26, 26)
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerRegistrationButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentOverviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(managerLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuModificationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feedbackOverviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(managerLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuModificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificationButtonActionPerformed
        this.setVisible(false);
        new menu_modification().setVisible(true);
    }//GEN-LAST:event_menuModificationButtonActionPerformed

    private void customerRegistrationButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRegistrationButton1ActionPerformed
        this.setVisible(false);
        new customer_registration().setVisible(true);
    }//GEN-LAST:event_customerRegistrationButton1ActionPerformed

    private void paymentOverviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentOverviewButtonActionPerformed
        this.setVisible(false);
        new payment_overview().setVisible(true);
    }//GEN-LAST:event_paymentOverviewButtonActionPerformed

    private void feedbackOverviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackOverviewButtonActionPerformed
        this.setVisible(false);
        new feedback_overview().setVisible(true);
    }//GEN-LAST:event_feedbackOverviewButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
        new main_page().setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_functions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerRegistrationButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton feedbackOverviewButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel managerFunctionLabel;
    private javax.swing.JPanel managerLoginPanel;
    private javax.swing.JButton menuModificationButton;
    private javax.swing.JButton paymentOverviewButton;
    // End of variables declaration//GEN-END:variables
}
