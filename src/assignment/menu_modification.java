package assignment;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu_modification extends javax.swing.JFrame {
    
    public menu_modification() {
        initComponents();
        viewLatestMenu();
    }
    
    public void viewLatestMenu(){
        Scanner s = null;
        String[] data = {};
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        model.setRowCount(0);
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/menu.txt"))).useDelimiter("\n");
            while(s.hasNext()){
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = s.next();
            }
            for (int i = 0; i < data.length; i+=3){
                model.addRow(new String[]{data[i],data[i+1]});
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuModificationPanel = new javax.swing.JPanel();
        menuModificationLabel = new javax.swing.JLabel();
        menuScrollPane = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        newItemPriceBox = new javax.swing.JTextField();
        newItemBox = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        IDLabel1 = new javax.swing.JLabel();
        modifyItemBox = new javax.swing.JTextField();
        IDLabel2 = new javax.swing.JLabel();
        IDLabel3 = new javax.swing.JLabel();
        modifyItemPriceBox = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        modifyItemButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuModificationPanel.setBackground(new java.awt.Color(51, 51, 51));

        menuModificationLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuModificationLabel.setForeground(new java.awt.Color(194, 194, 194));
        menuModificationLabel.setText("Menu modification");

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
                "Item", "Price (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menuTable.setOpaque(false);
        menuTable.setRowHeight(30);
        menuTable.setRowSelectionAllowed(false);
        menuTable.getTableHeader().setReorderingAllowed(false);
        menuScrollPane.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
        }

        newItemPriceBox.setBackground(new java.awt.Color(153, 153, 153));
        newItemPriceBox.setBorder(null);

        newItemBox.setBackground(new java.awt.Color(153, 153, 153));
        newItemBox.setBorder(null);

        IDLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel.setText("New item   :");

        IDLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel1.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel1.setText("Price           :");

        modifyItemBox.setBackground(new java.awt.Color(153, 153, 153));
        modifyItemBox.setBorder(null);

        IDLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel2.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel2.setText("Modify        :");

        IDLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDLabel3.setForeground(new java.awt.Color(194, 194, 194));
        IDLabel3.setText("Price           :");

        modifyItemPriceBox.setBackground(new java.awt.Color(153, 153, 153));
        modifyItemPriceBox.setBorder(null);

        addItemButton.setBackground(new java.awt.Color(81, 81, 81));
        addItemButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addItemButton.setForeground(new java.awt.Color(194, 194, 194));
        addItemButton.setText("Add");
        addItemButton.setBorder(null);
        addItemButton.setFocusPainted(false);
        addItemButton.setFocusable(false);
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        modifyItemButton.setBackground(new java.awt.Color(81, 81, 81));
        modifyItemButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modifyItemButton.setForeground(new java.awt.Color(194, 194, 194));
        modifyItemButton.setText("Modify");
        modifyItemButton.setBorder(null);
        modifyItemButton.setFocusPainted(false);
        modifyItemButton.setFocusable(false);
        modifyItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyItemButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(81, 81, 81));
        removeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removeButton.setForeground(new java.awt.Color(194, 194, 194));
        removeButton.setText("Remove");
        removeButton.setBorder(null);
        removeButton.setFocusPainted(false);
        removeButton.setFocusable(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

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

        javax.swing.GroupLayout menuModificationPanelLayout = new javax.swing.GroupLayout(menuModificationPanel);
        menuModificationPanel.setLayout(menuModificationPanelLayout);
        menuModificationPanelLayout.setHorizontalGroup(
            menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuModificationPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuModificationLabel)
                    .addGroup(menuModificationPanelLayout.createSequentialGroup()
                        .addComponent(menuScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addItemButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modifyItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(menuModificationPanelLayout.createSequentialGroup()
                                    .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(IDLabel)
                                        .addComponent(IDLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newItemBox)
                                        .addComponent(newItemPriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(menuModificationPanelLayout.createSequentialGroup()
                                        .addComponent(IDLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(modifyItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuModificationPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(IDLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(modifyItemPriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        menuModificationPanelLayout.setVerticalGroup(
            menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuModificationPanelLayout.createSequentialGroup()
                .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuModificationPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(menuModificationLabel)
                        .addGap(18, 18, 18)
                        .addComponent(menuScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(menuModificationPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(newItemBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(newItemPriceBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDLabel2)
                            .addGroup(menuModificationPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(modifyItemBox, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuModificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(modifyItemPriceBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifyItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuModificationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuModificationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        String item = newItemBox.getText();
        float price = 0;
        try{
            price = Float.parseFloat(newItemPriceBox.getText());
            FileWriter output;
            String newItem = item + "\n" + String.format("%.2f", price) + "\n\n";
            try {
                output = new FileWriter("./src/assignment/menu.txt", true);
                output.write(newItem);
                output.close();
            } catch (IOException e) {
                try {
                    File f = new File("./src/assignment/menu.txt");
                    output = new FileWriter(f);
                    output.write(newItem);
                output.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error: File cannot be created", "File Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            viewLatestMenu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: Price must be in integer/float", "Input error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void modifyItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyItemButtonActionPerformed
        int rowCount = menuTable.getSelectedRow()*3;
        String item = modifyItemBox.getText();
        float price = 0;
        try{
            price = Float.parseFloat(modifyItemPriceBox.getText());
            String modifiedItem = String.format("%s\n%.2f", item, price);
            FileWriter output;
            String newMenu = "";
            try {
                int ctr = 0;
                Scanner s = new Scanner(new BufferedReader(new FileReader("./src/assignment/menu.txt")));
                while(s.hasNext()){
                    if (ctr == rowCount){
                        for(int i = 0; i < 2; i++){
                            s.nextLine();
                        }
                        newMenu += modifiedItem + "\n";
                    }else{
                        newMenu += s.nextLine() + "\n";
                    }
                    ctr ++;
                }
                newMenu += s.nextLine() + "\n";
                s.close();
                output = new FileWriter("./src/assignment/menu.txt");
                output.write(newMenu);
                output.close();
            } catch (IOException e) {
                try {
                    File f = new File("./src/assignment/menu.txt");
                    output = new FileWriter(f);
                    output.write(newMenu);
                output.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error: File cannot be created", "File Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            viewLatestMenu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: Price must be in integer/float", "Input error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_modifyItemButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int rowCount = menuTable.getSelectedRow()*3;
        FileWriter output;
        String newMenu = "";
        try {
            int ctr = 0;
            Scanner s = new Scanner(new BufferedReader(new FileReader("./src/assignment/menu.txt")));
            while(s.hasNext()){
                ctr ++;
                if (ctr == rowCount){
                    for(int i = 0; i < 3; i++){
                        s.nextLine();
                    }
                }else{
                    newMenu += s.nextLine() + "\n";
                }
            }
            newMenu += s.nextLine() + "\n";
            s.close();
            output = new FileWriter("./src/assignment/menu.txt");
            output.write(newMenu);
            output.close();
        } catch (IOException e) {
            try {
                File f = new File("./src/assignment/menu.txt");
                output = new FileWriter(f);
                output.write(newMenu);
            output.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: File cannot be created", "File Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        viewLatestMenu();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        new manager_functions().setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_modification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JLabel IDLabel1;
    private javax.swing.JLabel IDLabel2;
    private javax.swing.JLabel IDLabel3;
    private javax.swing.JButton addItemButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel menuModificationLabel;
    private javax.swing.JPanel menuModificationPanel;
    private javax.swing.JScrollPane menuScrollPane;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField modifyItemBox;
    private javax.swing.JButton modifyItemButton;
    private javax.swing.JTextField modifyItemPriceBox;
    private javax.swing.JTextField newItemBox;
    private javax.swing.JTextField newItemPriceBox;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
