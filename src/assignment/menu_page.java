package assignment;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu_page extends javax.swing.JFrame {
    
    public static DefaultTableModel modelWithoutReset;  
    public static double price;
    public static String orderDetail;
    
    // Get menu details from menu file and display in table
    public void viewMenu(){
        Scanner s = null;
        String[] data = {};
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();   
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/menu.txt"))).useDelimiter("\n");
            while(s.hasNext()){
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = s.next();
            }
            for (int i = 0; i < data.length; i+=3){
                model.addRow(new String[]{data[i],data[i+1],"0"});
            }
            menuTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
            menuTable.setModel(model);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (s != null) {
                s.close();
            }
        }
    }
        
    // Update the pricing when quantity is edited via listener
    public void addItemToOrder(){
        price = 0.00;
        if (menuTable.getCellEditor() == null){
            try{
                if (menuTable.getModel().getRowCount() > 0) {
                    for(int i = 0; i < menuTable.getRowCount(); i++){
                        price += (double) Double.parseDouble((String) menuTable.getModel().getValueAt(i, 1)) * (double) Double.parseDouble((String) menuTable.getModel().getValueAt(i, 2));
                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid quantity input", "Error", JOptionPane.WARNING_MESSAGE);
            }
            priceBox.setText(String.format("  RM %.2f", price));
        }
    }
    
    // Sets the order for other classes
    public void setOrderDetails(){
        orderDetail = "";
        for(int i = 0; i < menuTable.getRowCount(); i++){
            if((double)Double.parseDouble((String)menuTable.getModel().getValueAt(i, 2)) > 0){
                orderDetail += String.format("%-45s%3s\n", ((String) menuTable.getModel().getValueAt(i, 0)).strip(), (Integer)Integer.parseInt((String) menuTable.getModel().getValueAt(i, 2)));
            }
        }
    }
    
    // Set the menu table model
    public void setMenuTable(){
        modelWithoutReset = (DefaultTableModel)menuTable.getModel();
    }
    
    
    // Returns the price for other classes
    public static double getPrice(){
        return price;
    }
    
    // Returns the order detail for other class
    public static String getOrderDetail(){
        return orderDetail;
    }
    
    // Get the menu table model
    public DefaultTableModel getMenuTable(){
        return modelWithoutReset;
    }
    // Overriding if return menu to change order [To keep track of order witout refreshing page]
    public menu_page(DefaultTableModel model) {
        initComponents();
        viewMenu();
        menuTable.setModel(model);
    }
    
    // Original menu page with clean template
    public menu_page() {
        initComponents();
        viewMenu();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        checkOutButton = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        priceBox = new javax.swing.JFormattedTextField();
        exitButton = new javax.swing.JButton();
        viewProfileButton = new javax.swing.JButton();
        menuScrollPane = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(51, 51, 51));

        menuLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(194, 194, 194));
        menuLabel.setText("Menu");

        checkOutButton.setBackground(new java.awt.Color(81, 81, 81));
        checkOutButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOutButton.setForeground(new java.awt.Color(194, 194, 194));
        checkOutButton.setText("Check out");
        checkOutButton.setBorder(null);
        checkOutButton.setFocusPainted(false);
        checkOutButton.setFocusable(false);
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(194, 194, 194));
        priceLabel.setText("Price");

        priceBox.setEditable(false);
        priceBox.setBackground(new java.awt.Color(153, 153, 153));
        priceBox.setBorder(null);
        priceBox.setText("  RM ");
        priceBox.setFocusable(false);

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

        viewProfileButton.setBackground(new java.awt.Color(81, 81, 81));
        viewProfileButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProfileButton.setForeground(new java.awt.Color(194, 194, 194));
        viewProfileButton.setText("View profile");
        viewProfileButton.setBorder(null);
        viewProfileButton.setFocusable(false);
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });

        menuScrollPane.setBackground(new java.awt.Color(83, 84, 85));
        menuScrollPane.setForeground(new java.awt.Color(85, 85, 85));
        menuScrollPane.setViewportView(null);

        menuTable.setBackground(new java.awt.Color(102, 102, 102));
        menuTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuTable.setForeground(new java.awt.Color(255, 255, 255));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price (RM)", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menuTable.setFocusable(false);
        menuTable.setOpaque(false);
        menuTable.setRowHeight(30);
        menuTable.setRowSelectionAllowed(false);
        menuTable.getTableHeader().setReorderingAllowed(false);
        menuTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menuTablePropertyChange(evt);
            }
        });
        menuScrollPane.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(menuLabel)
                        .addGap(600, 600, 600)
                        .addComponent(viewProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuLabel)
                    .addComponent(viewProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(menuScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel)
                    .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
        setOrderDetails();
        setMenuTable();       
        this.setVisible(false);
        new user_profile_page().setVisible(true);
    }//GEN-LAST:event_viewProfileButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
        new main_page().setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        setOrderDetails();
        setMenuTable();
        this.setVisible(false);
        new cart_page().setVisible(true);
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void menuTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menuTablePropertyChange
        addItemToOrder();
    }//GEN-LAST:event_menuTablePropertyChange

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JScrollPane menuScrollPane;
    private javax.swing.JTable menuTable;
    private javax.swing.JFormattedTextField priceBox;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton viewProfileButton;
    // End of variables declaration//GEN-END:variables
}
