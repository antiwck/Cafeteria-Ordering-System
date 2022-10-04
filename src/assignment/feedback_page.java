package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class feedback_page extends javax.swing.JFrame {
    
    public static String feedbackDetails;
    public static int rating;
    
    // Return the feedback from user
    public String getFeedbackDetails(){
        feedbackDetails = feedbackTextBox.getText();
        return feedbackDetails;
    }
    
    // Change the star rating based on used selection [Visual rating]
    void feedbackRating(int rating){
        ImageIcon selected = new javax.swing.ImageIcon(getClass().getResource("selected.png"));
        ImageIcon notSelected = new javax.swing.ImageIcon(getClass().getResource("not selected.png"));
        switch(rating){
            case 1:
                star1.setIcon(selected);
                star2.setIcon(notSelected);
                star3.setIcon(notSelected);
                star4.setIcon(notSelected);
                star5.setIcon(notSelected);
                break;
            case 2:
                star1.setIcon(selected);
                star2.setIcon(selected);
                star3.setIcon(notSelected);
                star4.setIcon(notSelected);
                star5.setIcon(notSelected);
                break;
            case 3:
                star1.setIcon(selected);
                star2.setIcon(selected);
                star3.setIcon(selected);
                star4.setIcon(notSelected);
                star5.setIcon(notSelected);
                rating = 3;
                break;
            case 4:
                star1.setIcon(selected);
                star2.setIcon(selected);
                star3.setIcon(selected);
                star4.setIcon(selected);
                star5.setIcon(notSelected);
                break;
            case 5:
                star1.setIcon(selected);
                star2.setIcon(selected);
                star3.setIcon(selected);
                star4.setIcon(selected);
                star5.setIcon(selected);
                break;
            default:
                rating = 0;
                break;
        }       
    }
    
    // Write the feedback to text file with rating
    public void submitFeedback(){
        feedbackDetails = String.format("%s\n%s\n%d\n\n", customer_login.userID, feedbackTextBox.getText(), rating);
        try {
            FileWriter output = new FileWriter("./src/assignment/feedback.txt", true);
            output.write(feedbackDetails);
            output.close();
        }catch(IOException e){
            try {
                File f = new File("./src/assignment/feedback.txt");
                FileWriter output = new FileWriter(f);
                output.write(feedbackDetails);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: File cannot be created", "File Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(this, "Thank you for your purchase and feedback", "Thank You", JOptionPane.PLAIN_MESSAGE);
    }

    public feedback_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feedbackPanel = new javax.swing.JPanel();
        feedbackLabel = new javax.swing.JLabel();
        feedbackBox = new javax.swing.JScrollPane();
        feedbackTextBox = new javax.swing.JTextArea();
        submitFeedbackButton = new javax.swing.JButton();
        star1 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackPanel.setBackground(new java.awt.Color(51, 51, 51));

        feedbackLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        feedbackLabel.setForeground(new java.awt.Color(194, 194, 194));
        feedbackLabel.setText("Feedback");

        feedbackTextBox.setBackground(new java.awt.Color(153, 153, 153));
        feedbackTextBox.setColumns(20);
        feedbackTextBox.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        feedbackTextBox.setRows(5);
        feedbackTextBox.setBorder(null);
        feedbackBox.setViewportView(feedbackTextBox);

        submitFeedbackButton.setBackground(new java.awt.Color(81, 81, 81));
        submitFeedbackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submitFeedbackButton.setForeground(new java.awt.Color(194, 194, 194));
        submitFeedbackButton.setText("Submit feedback");
        submitFeedbackButton.setBorder(null);
        submitFeedbackButton.setFocusPainted(false);
        submitFeedbackButton.setFocusable(false);
        submitFeedbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFeedbackButtonActionPerformed(evt);
            }
        });

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/not selected.png"))); // NOI18N
        star1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star1MouseClicked(evt);
            }
        });

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/not selected.png"))); // NOI18N
        star2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star2MouseClicked(evt);
            }
        });

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/not selected.png"))); // NOI18N
        star3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star3MouseClicked(evt);
            }
        });

        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/not selected.png"))); // NOI18N
        star4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star4MouseClicked(evt);
            }
        });

        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/not selected.png"))); // NOI18N
        star5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout feedbackPanelLayout = new javax.swing.GroupLayout(feedbackPanel);
        feedbackPanel.setLayout(feedbackPanelLayout);
        feedbackPanelLayout.setHorizontalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackPanelLayout.createSequentialGroup()
                .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feedbackBox, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feedbackLabel)))
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(star1)
                        .addGap(18, 18, 18)
                        .addComponent(star2)
                        .addGap(18, 18, 18)
                        .addComponent(star3)
                        .addGap(18, 18, 18)
                        .addComponent(star4)
                        .addGap(18, 18, 18)
                        .addComponent(star5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitFeedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        feedbackPanelLayout.setVerticalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(star3)
                    .addGroup(feedbackPanelLayout.createSequentialGroup()
                        .addComponent(feedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(feedbackBox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(star1)
                                .addComponent(submitFeedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(star2)))
                    .addComponent(star4)
                    .addComponent(star5))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitFeedbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFeedbackButtonActionPerformed
        submitFeedback();
        this.setVisible(false);
        new menu_page().setVisible(true);
    }//GEN-LAST:event_submitFeedbackButtonActionPerformed

    private void star1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseClicked
        rating = 1;
        feedbackRating(rating);
    }//GEN-LAST:event_star1MouseClicked

    private void star2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseClicked
        rating = 2;
        feedbackRating(rating);
    }//GEN-LAST:event_star2MouseClicked

    private void star3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseClicked
        rating = 3;
        feedbackRating(rating);
    }//GEN-LAST:event_star3MouseClicked

    private void star4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseClicked
        rating = 4;
        feedbackRating(rating);
    }//GEN-LAST:event_star4MouseClicked

    private void star5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseClicked
        rating = 5;
        feedbackRating(rating);
    }//GEN-LAST:event_star5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback_page().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane feedbackBox;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JPanel feedbackPanel;
    private javax.swing.JTextArea feedbackTextBox;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    private javax.swing.JButton submitFeedbackButton;
    // End of variables declaration//GEN-END:variables
}