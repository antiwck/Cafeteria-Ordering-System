package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class view_receipt_page extends javax.swing.JFrame {

    public void viewReceipt(){
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/receipt.txt")));
            String line = "";
            String details = "";
            while(s.hasNext()){
                line = s.nextLine();
                if(line.equalsIgnoreCase(customer_login.name)){
                    details += "Date        : " + s.nextLine() + "\n";
                    details += "Payment Type: " + s.nextLine() + "\n";
                    details += "Order price : RM " + s.nextLine() + "\n";
                    details += "Order list  : \n";
                    while((line = s.nextLine()).length() > 0){
                        details += line + "\n";
                    }
                    details += "\n";
                }
            }
            receiptBox.setText(details);
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    // View all the receipts/past order and details
    public view_receipt_page() {
        initComponents();
        viewReceipt();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receiptPanel = new javax.swing.JPanel();
        receiptLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receiptPanel.setBackground(new java.awt.Color(51, 51, 51));

        receiptLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        receiptLabel.setForeground(new java.awt.Color(194, 194, 194));
        receiptLabel.setText("Receipt");

        returnButton.setBackground(new java.awt.Color(81, 81, 81));
        returnButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnButton.setForeground(new java.awt.Color(194, 194, 194));
        returnButton.setText("Return");
        returnButton.setBorder(null);
        returnButton.setFocusPainted(false);
        returnButton.setFocusable(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        receiptBox.setEditable(false);
        receiptBox.setBackground(new java.awt.Color(60, 60, 60));
        receiptBox.setColumns(20);
        receiptBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        receiptBox.setForeground(new java.awt.Color(194, 194, 194));
        receiptBox.setRows(5);
        receiptBox.setFocusable(false);
        jScrollPane1.setViewportView(receiptBox);

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(receiptLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        new user_profile_page().setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_receipt_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea receiptBox;
    private javax.swing.JLabel receiptLabel;
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
