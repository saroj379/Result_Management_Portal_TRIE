/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package result_management_portal;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author princ
 */
public class addResult extends javax.swing.JFrame {

    /**
     * Creates new form addResult
     */
    public addResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roll_number = new javax.swing.JTextField();
        ds = new javax.swing.JTextField();
        os = new javax.swing.JTextField();
        cns = new javax.swing.JTextField();
        dbms = new javax.swing.JTextField();
        iot = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton6.setText("Add new Student");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        jButton7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton7.setText("Registered Students");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 190, -1));

        jButton8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton8.setText("All Students Result");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 190, -1));

        jButton9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton9.setText("Log-out");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, -1));

        jButton10.setBackground(new java.awt.Color(255, 102, 102));
        jButton10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Add Result");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("Roll Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 90, 20));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("DS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 90, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("OS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 90, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("CNS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("DBMS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("IoT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 80, 20));
        getContentPane().add(roll_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 150, -1));
        getContentPane().add(ds, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 150, -1));
        getContentPane().add(os, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 150, -1));

        cns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnsActionPerformed(evt);
            }
        });
        getContentPane().add(cns, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 150, -1));
        getContentPane().add(dbms, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, -1));
        getContentPane().add(iot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 150, -1));

        save.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result_management_portal/Custom-Icon-Design-Flatastic-9-Save.24.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addStudents().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new results().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addResult().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnsActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String rollno = roll_number.getText();
        String ds1 = ds.getText();
        String os1 = os.getText();
        String cns1 = cns.getText();
        String dbms1 = dbms.getText();
        String iot1 = iot.getText();
        
        if(rollno.equals("") || ds1.equals("") || os1.equals("") || cns1.equals("") || dbms1.equals("") || iot1.equals("")){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Georgia", Font.BOLD, 14)));
            JOptionPane.showMessageDialog(null, "<html><div color=red>Please, Fill the Marks!", "SetColor", JOptionPane.ERROR_MESSAGE);
        }
        // if not blank then proced
        else{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms", "root","admin");

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("select * from student where rollno='"+rollno+"'");

                if(rs.next()){
                    st.executeUpdate("insert into result(rollno, ds, os, cns, dbms, iot) values('"+rollno+"', '"+ds1+"', '"+os1+"', '"+cns1+"', '"+dbms1+"', '"+iot1+"')");
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Georgia", Font.BOLD, 14)));
                    JOptionPane.showMessageDialog(null, "<html><div color=green>Marks added successfully!","success", JOptionPane.INFORMATION_MESSAGE);
//                    JOptionPane.showMessageDialog(null, "Marks added successfully!");
                    setVisible(false);
                    new addResult().setVisible(true);
                }
                else{
                    int a = JOptionPane.showConfirmDialog(null,"Roll Number is not available.\n Do you want to register?");
                    if(a == JOptionPane.YES_OPTION){
                        setVisible(false);
                        new addStudents().setVisible(true);
                    }
                    else if(a == JOptionPane.CANCEL_OPTION){
                        setVisible(true);
                    }
                    else{
                        setVisible(true);
                        new addResult().setVisible(true);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cns;
    private javax.swing.JTextField dbms;
    private javax.swing.JTextField ds;
    private javax.swing.JTextField iot;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField os;
    private javax.swing.JTextField roll_number;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}