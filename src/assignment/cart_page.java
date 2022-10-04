package assignment;

import javax.swing.JOptionPane;

public class cart_page extends javax.swing.JFrame {
    
    // Display all the order in text area
    public void viewOrder(){
        orderDetailBox.setText(menu_page.getOrderDetail());
    }

    // Reset order
    public void candelOrder(){
        orderDetailBox.setText("");
        priceBox.setText("");
        menu_page.price = 0;
    }
    
    // Display price in text area
    public void displayPrice(){
        priceBox.setText(String.format("Total: RM %.2f", menu_page.getPrice()));
    }
    
    public cart_page() {
        initComponents();
        displayPrice();
        viewOrder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartPanel = new javax.swing.JPanel();
        cartLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        priceBox = new javax.swing.JFormattedTextField();
        itemLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderDetailBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cartPanel.setBackground(new java.awt.Color(51, 51, 51));

        cartLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cartLabel.setForeground(new java.awt.Color(194, 194, 194));
        cartLabel.setText("Cart");

        confirmButton.setBackground(new java.awt.Color(81, 81, 81));
        confirmButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(194, 194, 194));
        confirmButton.setText("Comfirm order");
        confirmButton.setBorder(null);
        confirmButton.setFocusPainted(false);
        confirmButton.setFocusable(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(81, 81, 81));
        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(194, 194, 194));
        cancelButton.setText("Cancel order");
        cancelButton.setBorder(null);
        cancelButton.setFocusPainted(false);
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

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

        priceBox.setEditable(false);
        priceBox.setBackground(new java.awt.Color(60, 60, 60));
        priceBox.setBorder(null);
        priceBox.setForeground(new java.awt.Color(194, 194, 194));
        priceBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceBox.setFocusable(false);
        priceBox.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        itemLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        itemLabel.setForeground(new java.awt.Color(194, 194, 194));
        itemLabel.setText("Item");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(194, 194, 194));
        quantityLabel.setText("Quantity");

        jScrollPane1.setBorder(null);

        orderDetailBox.setEditable(false);
        orderDetailBox.setBackground(new java.awt.Color(60, 60, 60));
        orderDetailBox.setColumns(20);
        orderDetailBox.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        orderDetailBox.setForeground(new java.awt.Color(194, 194, 194));
        orderDetailBox.setRows(5);
        orderDetailBox.setBorder(null);
        orderDetailBox.setFocusable(false);
        jScrollPane1.setViewportView(orderDetailBox);

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartLabel)
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cartPanelLayout.createSequentialGroup()
                                .addComponent(itemLabel)
                                .addGap(400, 400, 400)
                                .addComponent(quantityLabel))
                            .addComponent(jScrollPane1))
                        .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cartPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cartPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemLabel)
                            .addComponent(quantityLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // Check if order is valid, true if cart is not empty else prompt notification
        if(menu_page.getPrice() > 0){
            this.setVisible(false);
            new payment_selection_page().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Empty cart", "Empty", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        candelOrder();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // Return to menu, if cart is resetted, use the default class else use override class
        this.setVisible(false);
        if(orderDetailBox.getText().equals("")){
            new menu_page().setVisible(true);
        }else{
            new menu_page(new menu_page().getMenuTable()).setVisible(true);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea orderDetailBox;
    private javax.swing.JFormattedTextField priceBox;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
