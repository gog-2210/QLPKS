/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl1_134.setBackground(new java.awt.Color(240, 204, 204));

        lbl1_134.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1_134.setForeground(new java.awt.Color(195, 78, 107));
        lbl1_134.setText("ĐỔI MẬT KHẨU");

        llbl2_134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        llbl2_134.setText("Mật khẩu cũ:");

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

        btn2_134.setText("Huỷ");
        btn2_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_134ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1_134Layout = new javax.swing.GroupLayout(pnl1_134);
        pnl1_134.setLayout(pnl1_134Layout);
        pnl1_134Layout.setHorizontalGroup(
            pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_134Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(lbl1_134)
                .addGap(93, 93, 93))
            .addGroup(pnl1_134Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl1_134Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btn2_134, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_134, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_134, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lbl3_134)
                    .addComponent(llbl2_134))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1_134Layout.setVerticalGroup(
            pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_134Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1_134)
                .addGap(68, 68, 68)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnl1_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2_134, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
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
        // TODO add your handling code here:
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
    private javax.swing.JLabel llbl2_134;
    private javax.swing.JPanel pnl1_134;
    private javax.swing.JTextField txt1_134;
    private javax.swing.JTextField txt2_134;
    private javax.swing.JTextField txt3_134;
    // End of variables declaration//GEN-END:variables
}
