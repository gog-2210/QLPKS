/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GuynIT
 */
public class DoiMK extends javax.swing.JFrame {

    /**
     * Creates new form DoiMK
     */
    public DoiMK() {
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

        pnl1_134 = new javax.swing.JPanel();
        lbl1_134 = new javax.swing.JLabel();
        llbl2_134 = new javax.swing.JLabel();
        lbl3_134 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1_134 = new javax.swing.JTextField();
        txt2_134 = new javax.swing.JTextField();
        txt3_134 = new javax.swing.JTextField();
        btn1_134 = new javax.swing.JButton();
        btn2_134 = new javax.swing.JButton();
        lbl4_134 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1_134.setBackground(new java.awt.Color(240, 204, 204));

        lbl1_134.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1_134.setForeground(new java.awt.Color(195, 78, 107));
        lbl1_134.setText("ĐỔI MẬT KHẨU");

        llbl2_134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        llbl2_134.setText("Tên tài khoản muốn đổi :");

        lbl3_134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl3_134.setText("Mật khẩu mới:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nhập lại mật khẩu mới:");

        txt2_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2_134ActionPerformed(evt);
            }
        });

        btn1_134.setText("Đổi");
        btn1_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_134ActionPerformed(evt);
            }
        });

        btn2_134.setText("Quay lại");
        btn2_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_134ActionPerformed(evt);
            }
        });

        lbl4_134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl4_134.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnl1_134Layout = new javax.swing.GroupLayout(pnl1_134);
        pnl1_134.setLayout(pnl1_134Layout);
        pnl1_134Layout.setHorizontalGroup(
            pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_134Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(lbl1_134)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1_134Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt1_134)
                    .addGroup(pnl1_134Layout.createSequentialGroup()
                        .addComponent(btn1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2_134))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl3_134, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(llbl2_134, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2_134, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3_134)
                    .addComponent(lbl4_134, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        pnl1_134Layout.setVerticalGroup(
            pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_134Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1_134)
                .addGap(27, 27, 27)
                .addComponent(llbl2_134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbl3_134, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2_134, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3_134, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl4_134, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_134, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1_134, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl1_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_134ActionPerformed
        if(txt1_134.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng điền tên tài khoản muốn đổi!");
        //thông báo nếu password trống    
        }else if(txt2_134.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng điền mật khẩu mới!");
        }else if(txt3_134.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập lại mật khẩu mới!");    
        }
        else{
                String txt1 =txt3_134.getText();
                String txt2 =txt2_134.getText();
                if(!txt1.equals(txt2)) lbl4_134.setText("Nhập lại mật khẩu chưa trùng khớp");
                else{
                    try {
                        Connection conn = DBConnection.getConnection();
                        String sql = "UPDATE TAIKHOAN SET MATKHAU=? WHERE TENTK=?";
                        PreparedStatement pr = conn.prepareStatement(sql);
                        pr.setString(1,txt2_134.getText());
                        pr.setString(2,txt1_134.getText());
                        
                        int rs = pr.executeUpdate();
                        if(rs==1)
                        {
                            if(txt1.equals(txt2)) lbl4_134.setText("");
                            JOptionPane.showMessageDialog(this,"Bạn đã Đổi mật khẩu thành công!");
                        }
                        else{
                            if(txt1.equals(txt2)) lbl4_134.setText("");
                            JOptionPane.showMessageDialog(this,"Bạn đã đổi mật khẩu thất bại!\n\n"+"Có thể tên tài khoản đã không tồn tại!");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DoiMK.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }//GEN-LAST:event_btn1_134ActionPerformed

    private void txt2_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2_134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_134ActionPerformed

    private void btn2_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_134ActionPerformed
        this.dispose();
        new TrangChu().setVisible(true);
    }//GEN-LAST:event_btn2_134ActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1_134;
    private javax.swing.JButton btn2_134;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl1_134;
    private javax.swing.JLabel lbl3_134;
    private javax.swing.JLabel lbl4_134;
    private javax.swing.JLabel llbl2_134;
    private javax.swing.JPanel pnl1_134;
    private javax.swing.JTextField txt1_134;
    private javax.swing.JTextField txt2_134;
    private javax.swing.JTextField txt3_134;
    // End of variables declaration//GEN-END:variables
}
