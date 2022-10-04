package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class payment_selection_page extends javax.swing.JFrame {

    public static int amount;
    public static Date date;
    public static String firstName, lastName, cardNumber;
    public static String paymentType;
    int attempt = 3;
    Scanner s = null;

    // Write the order details into file after verification
    public void recordData(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        String date = now.format(formattedDate);
        String receiptDetails = String.format("%s %s\n%s\n%s\n%.2f\n%s\n", firstName, lastName, date, paymentType, menu_page.getPrice(), menu_page.getOrderDetail());
        try {
            FileWriter output = new FileWriter("./src/assignment/receipt.txt", true);
            output.write(receiptDetails);
            output.close();
        }catch(IOException e){
            try {
                File f = new File("./src/assignment/receipt.txt");
                FileWriter output = new FileWriter(f);
                output.write(receiptDetails);
                output.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: File cannot be created", "File Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // Set payment type [credit or debit]
    public void setPaymentType(String method){
        paymentType = method;
    }

    // Return payment type
    public String getPaymentType(){
        return paymentType;
    }

    // Check the credential via text file before authenticate payment
    private boolean checkCredential(String firstName, String lastName, String cardNumber){
        try{
            String line;
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/customer info.txt")));
            while(s.hasNext()){
                line = s.nextLine();
                if (line.equalsIgnoreCase(firstName + " " + lastName) && s.nextLine().equalsIgnoreCase(cardNumber) && paymentType != null){
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
        return false;
    }
    
    // Based on input, validate payment and proceed accordingly, if cancel order and return to menu
    private void makePament(){
        firstName = firstNameBox.getText();
        lastName = lastNameBox.getText();
        cardNumber = cardNumberBox.getText();
        
        if(checkCredential(firstName, lastName, cardNumber)){
            recordData();
            this.setVisible(false);
            new feedback_page().setVisible(true);
        }else{
            attempt -= 1;
            if (attempt >= 1) {
                JOptionPane.showMessageDialog(this, String.format("Invalid credential, attempt left: %s", attempt), "Error", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Order is cancelled due to invalid credential", "Error", JOptionPane.OK_OPTION);
                this.setVisible(false);
                new menu_page().setVisible(true);
            }
        }
    }

    public payment_selection_page() {
        initComponents();
        costLabel.setText(String.format("  RM %.2f", menu_page.getPrice()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentSelectionButton = new javax.swing.ButtonGroup();
        paymentPanel = new javax.swing.JPanel();
        cartLabel = new javax.swing.JLabel();
        seperatingDetails = new javax.swing.JSeparator();
        costLabel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        firstNameBox = new javax.swing.JTextField();
        lastNameBox = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        cardNumberBox = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        debitButton = new javax.swing.JToggleButton();
        creditButton = new javax.swing.JToggleButton();
        confirmPaymentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paymentPanel.setBackground(new java.awt.Color(51, 51, 51));

        cartLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cartLabel.setForeground(new java.awt.Color(194, 194, 194));
        cartLabel.setText("Payment");

        seperatingDetails.setForeground(new java.awt.Color(153, 153, 153));

        costLabel.setEditable(false);
        costLabel.setBackground(new java.awt.Color(86, 86, 86));
        costLabel.setBorder(null);
        costLabel.setForeground(new java.awt.Color(194, 194, 194));
        costLabel.setText("  RM ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 194, 194));
        jLabel1.setText("Total");

        firstNameBox.setBackground(new java.awt.Color(153, 153, 153));
        firstNameBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameBox.setToolTipText("First name");
        firstNameBox.setPreferredSize(new java.awt.Dimension(60, 20));

        lastNameBox.setBackground(new java.awt.Color(153, 153, 153));
        lastNameBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameBox.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastNameBox.setToolTipText("Last name");
        lastNameBox.setPreferredSize(new java.awt.Dimension(60, 20));

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(194, 194, 194));
        firstNameLabel.setText("First name");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(194, 194, 194));
        lastNameLabel.setText("Last name");

        cardNumberBox.setBackground(new java.awt.Color(153, 153, 153));
        cardNumberBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberBox.setToolTipText("Card numver (16 digits)");
        cardNumberBox.setPreferredSize(new java.awt.Dimension(60, 20));

        cardNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardNumberLabel.setForeground(new java.awt.Color(194, 194, 194));
        cardNumberLabel.setText("Card number");

        debitButton.setBackground(new java.awt.Color(102, 102, 102));
        paymentSelectionButton.add(debitButton);
        debitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        debitButton.setForeground(new java.awt.Color(194, 194, 194));
        debitButton.setText("Debit card");
        debitButton.setBorder(null);
        debitButton.setFocusable(false);
        debitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitButtonActionPerformed(evt);
            }
        });

        creditButton.setBackground(new java.awt.Color(102, 102, 102));
        paymentSelectionButton.add(creditButton);
        creditButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        creditButton.setForeground(new java.awt.Color(194, 194, 194));
        creditButton.setText("Credit card");
        creditButton.setBorder(null);
        creditButton.setFocusable(false);
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });

        confirmPaymentButton.setBackground(new java.awt.Color(81, 81, 81));
        confirmPaymentButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        confirmPaymentButton.setForeground(new java.awt.Color(194, 194, 194));
        confirmPaymentButton.setText("Confirm payment");
        confirmPaymentButton.setBorder(null);
        confirmPaymentButton.setFocusPainted(false);
        confirmPaymentButton.setFocusable(false);
        confirmPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPaymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(firstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seperatingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paymentPanelLayout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addGap(272, 272, 272)
                                .addComponent(lastNameLabel))
                            .addComponent(cardNumberLabel))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(paymentPanelLayout.createSequentialGroup()
                                .addComponent(cardNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(creditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(debitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cartLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cartLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seperatingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cardNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(confirmPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPaymentButtonActionPerformed
        makePament();
    }//GEN-LAST:event_confirmPaymentButtonActionPerformed

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        setPaymentType("Credit card");
    }//GEN-LAST:event_creditButtonActionPerformed

    private void debitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitButtonActionPerformed
        setPaymentType("Debit card");
    }//GEN-LAST:event_debitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_selection_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardNumberBox;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JLabel cartLabel;
    private javax.swing.JButton confirmPaymentButton;
    private javax.swing.JFormattedTextField costLabel;
    private javax.swing.JToggleButton creditButton;
    private javax.swing.JToggleButton debitButton;
    private javax.swing.JTextField firstNameBox;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameBox;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.ButtonGroup paymentSelectionButton;
    private javax.swing.JSeparator seperatingDetails;
    // End of variables declaration//GEN-END:variables
}
