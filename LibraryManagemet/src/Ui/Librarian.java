package Ui;


import LibrarianSection.AddBooks;
import LibrarianSection.IssueBooks;
import LibrarianSection.ViewBooks;
import LibrarianSection.ViewIssuedBooks;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anshu Sony
 */
public class Librarian extends javax.swing.JFrame {

    /**
     * Creates new form Librarian
     */
    public Librarian() {
        initComponents();
      this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btAddBooks = new javax.swing.JButton();
        btViewBooks = new javax.swing.JButton();
        btIssueBooks = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btReturnBooks = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Librarian Section");

        btAddBooks.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btAddBooks.setText("Add Books");
        btAddBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddBooksActionPerformed(evt);
            }
        });

        btViewBooks.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btViewBooks.setText("View Books");
        btViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewBooksActionPerformed(evt);
            }
        });

        btIssueBooks.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btIssueBooks.setText("Issue Books");
        btIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIssueBooksActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jButton4.setText("View Issued Books");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btReturnBooks.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btReturnBooks.setText("Return Books");

        btLogout.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReturnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(btIssueBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btAddBooks)
                .addGap(35, 35, 35)
                .addComponent(btViewBooks)
                .addGap(34, 34, 34)
                .addComponent(btIssueBooks)
                .addGap(35, 35, 35)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(btReturnBooks)
                .addGap(35, 35, 35)
                .addComponent(btLogout)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddBooksActionPerformed
        AddBooks abook=new AddBooks();
        abook.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAddBooksActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        this.hide();
        Users users = new Users();
        users.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewBooksActionPerformed
        ViewBooks viewbooks= new ViewBooks();
        viewbooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_btViewBooksActionPerformed

    private void btIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIssueBooksActionPerformed
        IssueBooks issuebooks= new IssueBooks();
        issuebooks.setVisible(true);
        dispose();
    }//GEN-LAST:event_btIssueBooksActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ViewIssuedBooks view = new ViewIssuedBooks();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddBooks;
    private javax.swing.JButton btIssueBooks;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btReturnBooks;
    private javax.swing.JButton btViewBooks;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void setVisible(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
