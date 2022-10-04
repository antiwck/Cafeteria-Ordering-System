package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class payment_overview extends javax.swing.JFrame {

    public payment_overview() {
        initComponents();
        viewPayment();
    }
    
    public void viewPayment(){
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/receipt.txt")));
            String line = "";
            String details = "";
            while(s.hasNext()){
                details += "Name        : " + s.nextLine() + "\n";
                details += "Date        : " + s.nextLine() + "\n";
                details += "Payment Type: " + s.nextLine() + "\n";
                details += "Order price : RM " + s.nextLine() + "\n";
                details += "Order list  : \n";
                while((line = s.nextLine()).length() > 0){
                    details += line + "\n";
                }
                details += "\n";
            }
            paymentOverviewBox.setText(details);
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    public void viewCustomerPayment(){
        Scanner s = null;
        String name = userName.getText();
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/receipt.txt")));
            String line = "";
            String details = "";
            while(s.hasNext()){
                line = s.nextLine();
                if(line.equalsIgnoreCase(name)){
                    details += "Name        : " + line + "\n";
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
            paymentOverviewBox.setText(details);
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentOverviewPanel = new javax.swing.JPanel();
        paymentOverviewLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        returnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentOverviewBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paymentOverviewPanel.setBackground(new java.awt.Color(51, 51, 51));

        paymentOverviewLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        paymentOverviewLabel.setForeground(new java.awt.Color(194, 194, 194));
        paymentOverviewLabel.setText("Payment overview");

        userName.setBackground(new java.awt.Color(153, 153, 153));
        userName.setBorder(null);

        searchButton.setBackground(new java.awt.Color(81, 81, 81));
        searchButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(194, 194, 194));
        searchButton.setText("search");
        searchButton.setBorder(null);
        searchButton.setFocusable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(194, 194, 194));
        nameLabel.setText("Username :");

        refreshButton.setBackground(new java.awt.Color(81, 81, 81));
        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(194, 194, 194));
        refreshButton.setText("Refresh");
        refreshButton.setBorder(null);
        refreshButton.setFocusable(false);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

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

        paymentOverviewBox.setEditable(false);
        paymentOverviewBox.setBackground(new java.awt.Color(60, 60, 60));
        paymentOverviewBox.setColumns(20);
        paymentOverviewBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        paymentOverviewBox.setForeground(new java.awt.Color(194, 194, 194));
        paymentOverviewBox.setRows(5);
        paymentOverviewBox.setFocusable(false);
        jScrollPane1.setViewportView(paymentOverviewBox);

        javax.swing.GroupLayout paymentOverviewPanelLayout = new javax.swing.GroupLayout(paymentOverviewPanel);
        paymentOverviewPanel.setLayout(paymentOverviewPanelLayout);
        paymentOverviewPanelLayout.setHorizontalGroup(
            paymentOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentOverviewPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paymentOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paymentOverviewPanelLayout.createSequentialGroup()
                        .addComponent(paymentOverviewLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentOverviewPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        paymentOverviewPanelLayout.setVerticalGroup(
            paymentOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentOverviewPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(paymentOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentOverviewLabel)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(paymentOverviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(paymentOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        new manager_functions().setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        viewCustomerPayment();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        viewPayment();
    }//GEN-LAST:event_refreshButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment_overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea paymentOverviewBox;
    private javax.swing.JLabel paymentOverviewLabel;
    private javax.swing.JPanel paymentOverviewPanel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
