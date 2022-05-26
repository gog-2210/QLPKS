/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author GuynIT
 */
public class TrangChu extends javax.swing.JFrame {
    private JPanel pnl; 
    private JFrame frame;
    /**
     * Creates new form HomeForm
     */
    public TrangChu() {
        initComponents();
        pnl = new Phong();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
        showtime();
        JButton [] btns = {btn1_134,btn2_134,btn5_134,btn4_134,btn3_134};
        for(JButton btn :btns){
            btn.setBackground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(18, 27, 69));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21,25,28));
                }
            });
        }
        
    }
        void showtime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
                lbl1_134.setText(s.format(d) + "-" + D.format(d));
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnl3_134 = new javax.swing.JPanel();
        btn1_134 = new javax.swing.JButton();
        btn2_134 = new javax.swing.JButton();
        btn3_134 = new javax.swing.JButton();
        btn4_134 = new javax.swing.JButton();
        btn5_134 = new javax.swing.JButton();
        lbl1_134 = new javax.swing.JLabel();
        spr1_134 = new javax.swing.JSeparator();
        pnlMain_134 = new javax.swing.JPanel();
        pnl2_134 = new javax.swing.JPanel();
        lbl3_134 = new javax.swing.JLabel();
        lbl2_134 = new javax.swing.JLabel();
        lbl4_134 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnl3_134.setBackground(new java.awt.Color(21, 25, 29));

        btn1_134.setBackground(new java.awt.Color(21, 25, 29));
        btn1_134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1_134.setForeground(new java.awt.Color(255, 255, 255));
        btn1_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bed64px.png"))); // NOI18N
        btn1_134.setText("Sơ đồ phòng");
        btn1_134.setBorderPainted(false);
        btn1_134.setDoubleBuffered(true);
        btn1_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_134ActionPerformed(evt);
            }
        });

        btn2_134.setBackground(new java.awt.Color(21, 25, 29));
        btn2_134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2_134.setForeground(new java.awt.Color(255, 255, 255));
        btn2_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer64px.png"))); // NOI18N
        btn2_134.setText(" Khách hàng");
        btn2_134.setBorderPainted(false);
        btn2_134.setDoubleBuffered(true);
        btn2_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_134ActionPerformed(evt);
            }
        });

        btn3_134.setBackground(new java.awt.Color(21, 25, 29));
        btn3_134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3_134.setForeground(new java.awt.Color(255, 255, 255));
        btn3_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer-service64px.png"))); // NOI18N
        btn3_134.setText("        Dịch vụ");
        btn3_134.setBorderPainted(false);
        btn3_134.setDoubleBuffered(true);
        btn3_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_134ActionPerformed(evt);
            }
        });

        btn4_134.setBackground(new java.awt.Color(21, 25, 29));
        btn4_134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4_134.setForeground(new java.awt.Color(255, 255, 255));
        btn4_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/booking64px.png"))); // NOI18N
        btn4_134.setText("  Đặt phòng");
        btn4_134.setBorderPainted(false);
        btn4_134.setDoubleBuffered(true);
        btn4_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_134ActionPerformed(evt);
            }
        });

        btn5_134.setBackground(new java.awt.Color(21, 25, 29));
        btn5_134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5_134.setForeground(new java.awt.Color(255, 255, 255));
        btn5_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        btn5_134.setText(" Thanh toán");
        btn5_134.setBorderPainted(false);
        btn5_134.setDoubleBuffered(true);
        btn5_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_134ActionPerformed(evt);
            }
        });

        lbl1_134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl1_134.setForeground(new java.awt.Color(255, 255, 255));
        lbl1_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clock.png"))); // NOI18N
        lbl1_134.setDoubleBuffered(true);

        spr1_134.setForeground(new java.awt.Color(255, 255, 255));
        spr1_134.setOpaque(true);

        javax.swing.GroupLayout pnl3_134Layout = new javax.swing.GroupLayout(pnl3_134);
        pnl3_134.setLayout(pnl3_134Layout);
        pnl3_134Layout.setHorizontalGroup(
            pnl3_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn1_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn2_134, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
            .addComponent(btn3_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn4_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn5_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_134Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl3_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spr1_134)
                    .addComponent(lbl1_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl3_134Layout.setVerticalGroup(
            pnl3_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_134Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spr1_134, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(btn1_134)
                .addGap(18, 18, 18)
                .addComponent(btn2_134)
                .addGap(18, 18, 18)
                .addComponent(btn4_134)
                .addGap(20, 20, 20)
                .addComponent(btn3_134)
                .addGap(18, 18, 18)
                .addComponent(btn5_134)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMain_134.setBackground(new java.awt.Color(33, 39, 45));
        pnlMain_134.setLayout(new java.awt.BorderLayout());

        pnl2_134.setBackground(java.awt.Color.orange);

        lbl3_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closeDen.png"))); // NOI18N
        lbl3_134.setName("thoat"); // NOI18N
        lbl3_134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3_134MouseClicked(evt);
            }
        });

        lbl2_134.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl2_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dmkDen.png"))); // NOI18N
        lbl2_134.setText("Đổi mật khẩu");
        lbl2_134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2_134MouseClicked(evt);
            }
        });

        lbl4_134.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl4_134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-outDen.png"))); // NOI18N
        lbl4_134.setText("Đăng xuất");
        lbl4_134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4_134MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl2_134Layout = new javax.swing.GroupLayout(pnl2_134);
        pnl2_134.setLayout(pnl2_134Layout);
        pnl2_134Layout.setHorizontalGroup(
            pnl2_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2_134Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl2_134)
                .addGap(18, 18, 18)
                .addComponent(lbl4_134)
                .addGap(30, 30, 30)
                .addComponent(lbl3_134)
                .addGap(33, 33, 33))
        );
        pnl2_134Layout.setVerticalGroup(
            pnl2_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2_134Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl2_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl2_134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl2_134)
                        .addComponent(lbl4_134))
                    .addComponent(lbl3_134))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl3_134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl2_134, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMain_134, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl2_134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain_134, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE))
            .addComponent(pnl3_134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn3_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_134ActionPerformed
        pnl = new DichVu();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
    }//GEN-LAST:event_btn3_134ActionPerformed

    private void btn2_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_134ActionPerformed
        pnl = new KhachHang();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
    }//GEN-LAST:event_btn2_134ActionPerformed

    private void btn1_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_134ActionPerformed
         pnl = new Phong();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
    }//GEN-LAST:event_btn1_134ActionPerformed

    private void btn4_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_134ActionPerformed
        pnl = new DatPhong();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
    }//GEN-LAST:event_btn4_134ActionPerformed

    private void lbl3_134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3_134MouseClicked
        int thoat134 = JOptionPane.showConfirmDialog(this, "bạn chắc chắn muốn thoát ?","", JOptionPane.OK_CANCEL_OPTION);
        if (thoat134 == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lbl3_134MouseClicked

    private void btn5_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_134ActionPerformed
        pnl = new ThanhToan();
        pnlMain_134.removeAll();
        pnlMain_134.add(pnl);
        pnl.validate();
    }//GEN-LAST:event_btn5_134ActionPerformed

    private void lbl4_134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4_134MouseClicked
        new FormLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl4_134MouseClicked

    private void lbl2_134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2_134MouseClicked
        new DoiMK().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl2_134MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i=i+0.1){
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(20);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChao().setVisible(true);
                new TrangChu().setVisible(false);
            }
        });
    }
    /*
    background cho MouseClick panel
    #
    setcolor(btn_1);
    ind_1.setOpaque(true);
    resetcolor(new JPanel[]{btn_2}, new JPanel[]{ind_2});
    #
    private void setcolor(JPanel pane){
        pane.setBackground(new Color(0,0,153));
    }
    
        private void resetcolor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(255,153,153));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
    #  
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1_134;
    private javax.swing.JButton btn2_134;
    private javax.swing.JButton btn3_134;
    private javax.swing.JButton btn4_134;
    private javax.swing.JButton btn5_134;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1_134;
    private javax.swing.JLabel lbl2_134;
    private javax.swing.JLabel lbl3_134;
    private javax.swing.JLabel lbl4_134;
    private javax.swing.JPanel pnl2_134;
    private javax.swing.JPanel pnl3_134;
    private javax.swing.JPanel pnlMain_134;
    private javax.swing.JSeparator spr1_134;
    // End of variables declaration//GEN-END:variables
}
