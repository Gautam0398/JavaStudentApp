
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GMweb
 */
public class manageCourseForm extends javax.swing.JFrame {

    /**
     * Creates new form manageCourseForm
     */
    course c=new course();
    public manageCourseForm() {
        initComponents();
       c.fillCourseJtable(jTable1);
       jTable1.setRowHeight(40);
       jTable1.setShowGrid(true);
       jTable1.setSelectionBackground(Color.BLACK);

       
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_CourseId = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButtonRemoveCourse = new javax.swing.JButton();
        jButton_AddCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_CourseLabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton_EditCourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Course");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hours:");

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 300, 1));

        jButtonRemoveCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRemoveCourse.setText("Remove");
        jButtonRemoveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveCourseActionPerformed(evt);
            }
        });

        jButton_AddCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_AddCourse.setText("Add");
        jButton_AddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddCourseActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Label", "Hours"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Label:");

        jButton_EditCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_EditCourse.setText("Edit");
        jButton_EditCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRemoveCourse)
                        .addGap(38, 38, 38)
                        .addComponent(jButton_EditCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_AddCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_CourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_CourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_CourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRemoveCourse)
                            .addComponent(jButton_EditCourse)
                            .addComponent(jButton_AddCourse))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveCourseActionPerformed
      
        if(!jTextField_CourseId.getText().equals("")){
        int id = Integer.valueOf(jTextField_CourseId.getText());
            try {
                c.insertUpdateDeleteStudent('d',id,null,null);
            } catch (SQLException ex) {
                Logger.getLogger(manageCourseForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
                       manageCourseForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","Label","Hours"}));
                       c.fillCourseJtable(manageCourseForm.jTable1);}
                         jTextField_CourseId.setText("");
                         jTextField_CourseLabel.setText("");
                         jSpinner1.setValue(0);
                         
    }//GEN-LAST:event_jButtonRemoveCourseActionPerformed

    private void jButton_AddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddCourseActionPerformed

 addCourseForm AddCf=new addCourseForm();
                    AddCf.setVisible(true);
                    AddCf.pack();
                    AddCf.setLocationRelativeTo(null);
                    AddCf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try {
            MainForm.jLabel_StdCount.setText(" COURSE COUNT = "+Integer.toString(MyFunction.countData("course")));
        } catch (SQLException ex) {
            Logger.getLogger(manageCourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_AddCourseActionPerformed

    private void jButton_EditCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditCourseActionPerformed
        
        if(!c.isCourseExist(jTextField_CourseLabel.getText()))        
             {
                 int id = Integer.valueOf(jTextField_CourseId.getText());
                 String label=jTextField_CourseLabel.getText();
                 int hours=Integer.valueOf(jSpinner1.getValue().toString());
                try {
                      c.insertUpdateDeleteStudent('u',id,label,hours);
                      
                       manageCourseForm.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","Label","Hours"}));
                       c.fillCourseJtable(manageCourseForm.jTable1);
                        JOptionPane.showMessageDialog(null,"Course Edited");
                    } 
                catch (SQLException ex) {
                       Logger.getLogger(addCourseForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Course Already Exits");
             }

    }//GEN-LAST:event_jButton_EditCourseActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int index= jTable1.getSelectedRow();
        jTextField_CourseId.setText(jTable1.getValueAt(index,0).toString());
        jTextField_CourseLabel.setText(jTable1.getValueAt(index,1).toString());
        jSpinner1.setValue(Integer.valueOf(jTable1.getValueAt(index,2).toString()));
        
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemoveCourse;
    private javax.swing.JButton jButton_AddCourse;
    private javax.swing.JButton jButton_EditCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_CourseId;
    private javax.swing.JTextField jTextField_CourseLabel;
    // End of variables declaration//GEN-END:variables
}
