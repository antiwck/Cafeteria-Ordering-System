package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class feedback_overview extends javax.swing.JFrame {

    public feedback_overview() {
        initComponents();
        viewFeedback();
        viewRating();
    }
    
    public void viewFeedback(){
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/feedback.txt")));
            String line = "";
            String feedback = "";
            while(s.hasNext()){
                feedback += "User id    : " + s.nextLine() + "\n";
                feedback += "Feedback   : " + s.nextLine() + "\n";
                feedback += "Raing      : " + s.nextLine() + "\n";
                s.nextLine();
                feedback += "\n";
            }
            feedbackOverviewBox.setText(feedback);
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    public void viewRating(){
        Scanner s = null;
        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0;
        try{
            s = new Scanner(new BufferedReader(new FileReader("./src/assignment/feedback.txt")));
            String line = "";
            String ratingOverview = "";
            while(s.hasNext()){
                line = s.nextLine();
                if(line.matches("[123450]")){
                    switch(Integer.parseInt(line)){
                        case 0:
                            zero ++;
                            break;
                        case 1:
                            one ++;
                            break;
                        case 2:
                            two ++;
                            break;
                        case 3:
                            three ++;
                            break;
                        case 4:
                            four ++;
                            break;
                        case 5:
                            five ++;
                            break;
                    }
                }
            }
            ratingOverview = "0 star : " + zero + "\n1 star : " + one + "\n2 star : " + two + "\n3 star : " + three + "\n4 star : " + four + "\n5 star : " + five;
            ratingOverviewBox.setText(ratingOverview);
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

        feedbackOverviewPanel = new javax.swing.JPanel();
        feedbackOverviewLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        ratingLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        starBox = new javax.swing.JComboBox<>();
        ratingOverviewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackOverviewBox = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ratingOverviewBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackOverviewPanel.setBackground(new java.awt.Color(51, 51, 51));

        feedbackOverviewLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        feedbackOverviewLabel.setForeground(new java.awt.Color(194, 194, 194));
        feedbackOverviewLabel.setText("Feedback overview");

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

        ratingLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(194, 194, 194));
        ratingLabel.setText("Rating :");

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

        starBox.setBackground(new java.awt.Color(194, 194, 194));
        starBox.setForeground(new java.awt.Color(0, 0, 0));
        starBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "0 star", "1 star", "2 star", "3 star", "4 star", "5 star" }));
        starBox.setFocusable(false);

        ratingOverviewLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ratingOverviewLabel.setForeground(new java.awt.Color(194, 194, 194));
        ratingOverviewLabel.setText("Rating overview");

        jScrollPane1.setBorder(null);

        feedbackOverviewBox.setEditable(false);
        feedbackOverviewBox.setBackground(new java.awt.Color(60, 60, 60));
        feedbackOverviewBox.setColumns(20);
        feedbackOverviewBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        feedbackOverviewBox.setForeground(new java.awt.Color(194, 194, 194));
        feedbackOverviewBox.setRows(5);
        feedbackOverviewBox.setFocusable(false);
        jScrollPane1.setViewportView(feedbackOverviewBox);

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ratingOverviewBox.setEditable(false);
        ratingOverviewBox.setBackground(new java.awt.Color(60, 60, 60));
        ratingOverviewBox.setColumns(20);
        ratingOverviewBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ratingOverviewBox.setForeground(new java.awt.Color(194, 194, 194));
        ratingOverviewBox.setRows(5);
        ratingOverviewBox.setFocusable(false);
        jScrollPane3.setViewportView(ratingOverviewBox);

        javax.swing.GroupLayout feedbackOverviewPanelLayout = new javax.swing.GroupLayout(feedbackOverviewPanel);
        feedbackOverviewPanel.setLayout(feedbackOverviewPanelLayout);
        feedbackOverviewPanelLayout.setHorizontalGroup(
            feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                        .addComponent(feedbackOverviewLabel)
                        .addContainerGap())
                    .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                        .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ratingLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(starBox, 0, 202, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackOverviewPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ratingOverviewLabel)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))))))
        );
        feedbackOverviewPanelLayout.setVerticalGroup(
            feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(feedbackOverviewLabel)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingOverviewLabel))
                    .addGroup(feedbackOverviewPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(feedbackOverviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ratingLabel)
                            .addComponent(starBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(feedbackOverviewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(feedbackOverviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.setVisible(false);
        new manager_functions().setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String rating = String.valueOf(starBox.getSelectedItem());
        if (rating == "NA"){
            viewFeedback();
        }else{
            Scanner s = null;
            String feedback = "";
            try{
                s = new Scanner(new BufferedReader(new FileReader("./src/assignment/feedback.txt")));
                while(s.hasNext()){
                    String line = "";
                    line += "User id    : " + s.nextLine() + "\n";
                    line += "Feedback   : " + s.nextLine() + "\n";
                    if (s.nextLine().charAt(0) == rating.charAt(0)){
                        feedback += line + "\n";
                    }
                    s.nextLine();
                }
                feedbackOverviewBox.setText(feedback);
            } catch (FileNotFoundException ex) {
                System.out.println("File is not found");
            } finally {
                if (s != null) {
                    s.close();
                }
            }
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        viewFeedback();
    }//GEN-LAST:event_refreshButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback_overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea feedbackOverviewBox;
    private javax.swing.JLabel feedbackOverviewLabel;
    private javax.swing.JPanel feedbackOverviewPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JTextArea ratingOverviewBox;
    private javax.swing.JLabel ratingOverviewLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> starBox;
    // End of variables declaration//GEN-END:variables
}
