/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class DichVu extends javax.swing.JPanel {


    public static DichVu form;
    Connection con = DBConnection.getConnection();
    PreparedStatement pst;
    
    public DichVu() {
        initComponents();
        CrudTable();
    }

        public void CrudTable()
    {
        try {
            pst = con.prepareStatement("select * from DICHVU");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData RSM = rs.getMetaData();
            int c;
            c = RSM.getColumnCount();
            
            DefaultTableModel DF = (DefaultTableModel)tbl_CungCapDV.getModel();
            
            DF.setRowCount(0);
            
            while(rs.next())
            {    
                Vector v2 = new Vector();
                for(int i=1; i <= c; i++)
                {
                    v2.add(rs.getString("MADV"));
                    v2.add(rs.getString("TENDV"));
                    v2.add(rs.getString("GIADV"));
                    v2.add(rs.getString("GHICHU"));
                }
                DF.addRow(v2);
            }
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        lbl_TenDV = new javax.swing.JLabel();
        lbl_DonGia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextArea();
        lbl_GhiChu = new javax.swing.JLabel();
        txt_TenDV = new javax.swing.JTextField();
        txt_DonGia = new javax.swing.JTextField();
        pnl_Nut = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_CungCapDV = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        pnl.setBackground(new java.awt.Color(204, 255, 204));
        pnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_TenDV.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbl_TenDV.setText("T??n d???ch v???");

        lbl_DonGia.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbl_DonGia.setText("????n gi??");

        txt_GhiChu.setColumns(20);
        txt_GhiChu.setRows(5);
        jScrollPane1.setViewportView(txt_GhiChu);

        lbl_GhiChu.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbl_GhiChu.setText("Ghi ch??");

        txt_TenDV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_DonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pnl_Nut.setBackground(new java.awt.Color(204, 204, 255));
        pnl_Nut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus (1).png"))); // NOI18N
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit (1).png"))); // NOI18N
        btn_Sua.setText(" ");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete (1).png"))); // NOI18N
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icon_Reload.png"))); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutLayout = new javax.swing.GroupLayout(pnl_Nut);
        pnl_Nut.setLayout(pnl_NutLayout);
        pnl_NutLayout.setHorizontalGroup(
            pnl_NutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Them)
                .addGap(18, 18, 18)
                .addComponent(btn_Sua)
                .addGap(18, 18, 18)
                .addComponent(btn_Xoa)
                .addGap(18, 18, 18)
                .addComponent(btn_LamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NutLayout.setVerticalGroup(
            pnl_NutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_NutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_NutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_NutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Them)
                        .addComponent(btn_Xoa)
                        .addComponent(btn_LamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/room-service.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("(VN??)");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("D???CH V??? ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText("C???A CH??NG T??I");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(pnl_Nut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TenDV)
                            .addComponent(lbl_DonGia)
                            .addComponent(lbl_GhiChu))
                        .addGap(26, 26, 26)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TenDV)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenDV)
                    .addComponent(txt_TenDV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_DonGia)
                            .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(lbl_GhiChu))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pnl_Nut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        tbl_CungCapDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? d???ch v???", "T??n d???ch v???", "????n gi??", "Ghi ch??"
            }
        ));
        tbl_CungCapDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CungCapDVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_CungCapDV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        String TenDV = txt_TenDV.getText();
        String DonGia = txt_DonGia.getText();
        String GhiChu = txt_GhiChu.getText();
        if(txt_TenDV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui l??ng ??i???n t??n di??ch vu??!"); 
        }else if(txt_DonGia.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui l??ng ??i???n ????n gia??!");
        }else{
            try {
                pst = con.prepareStatement("insert into DICHVU (TENDV, GIADV, GHICHU)values(?,?,?)");
                pst.setString(1, TenDV);
                pst.setString(2, DonGia);
                pst.setString(3, GhiChu);
                int k = pst.executeUpdate();

                if(k==1)
                {
                    txt_TenDV.setText("");
                    txt_DonGia.setText("");
                    txt_GhiChu.setText("");
                    txt_TenDV.requestFocus();
                    CrudTable();

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Them dich vu that bai");
                }

            } catch (SQLException ex) {
                Logger.getLogger(DichVu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void tbl_CungCapDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CungCapDVMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)tbl_CungCapDV.getModel();
        int SelectIndex = tbl_CungCapDV.getSelectedRow();
        
        String maDV = d1.getValueAt(SelectIndex, 0).toString();
 
        txt_TenDV.setText(d1.getValueAt(SelectIndex, 1).toString());
        txt_DonGia.setText(d1.getValueAt(SelectIndex, 2).toString());
        txt_GhiChu.setText(d1.getValueAt(SelectIndex, 3).toString());
        btn_Them.setEnabled(false);
    }//GEN-LAST:event_tbl_CungCapDVMouseClicked

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
         DefaultTableModel d1 = (DefaultTableModel)tbl_CungCapDV.getModel();
        int SelectIndex = tbl_CungCapDV.getSelectedRow();       
         if(SelectIndex==-1){
            JOptionPane.showMessageDialog(this, "Vui long cho dich vu muon xoa!!!");
        }else{
            try {
                String maDV = d1.getValueAt(SelectIndex, 0).toString(); 
                pst = con.prepareStatement("delete from DICHVU where MADV = ? ");
                pst.setString(1, maDV);
                int k = pst.executeUpdate();

                if(k==1)
                {
                    int xoa =JOptionPane.showConfirmDialog(this, "b???n ch???c ch???n mu???n xo??a?","", JOptionPane.OK_CANCEL_OPTION);
                    if (xoa == JOptionPane.OK_OPTION) {
                        txt_TenDV.setText("");
                        txt_DonGia.setText("");
                        txt_GhiChu.setText("");
                        txt_TenDV.requestFocus();
                        CrudTable();
                        btn_Them.setEnabled(true);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Xoa dich vu that bai");
                }

            } catch (SQLException ex) {
                Logger.getLogger(DichVu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
         DefaultTableModel d1 = (DefaultTableModel)tbl_CungCapDV.getModel();
        int SelectIndex = tbl_CungCapDV.getSelectedRow();

        if(SelectIndex==-1){
            JOptionPane.showMessageDialog(this, "Vui long cho dich vu muon sua!!!");
        }else{   
            String maDV = d1.getValueAt(SelectIndex,0 ).toString();
            String TenDV = txt_TenDV.getText();
            String DonGia = txt_DonGia.getText();
            String GhiChu = txt_GhiChu.getText();

            try {
                pst = con.prepareStatement("update DichVu set TENDV=?, GIADV=?, GHICHU=? where MADV = ? ");

                pst.setString(1, TenDV);
                pst.setString(2, DonGia);
                pst.setString(3, GhiChu);
                pst.setString(4, maDV);
                int k = pst.executeUpdate();

                if(k==1)
                {
                    JOptionPane.showMessageDialog(this, "Sua dich vu thanh cong");
                    txt_TenDV.setText("");
                    txt_DonGia.setText("");
                    txt_GhiChu.setText("");
                    txt_TenDV.requestFocus();
                    CrudTable();
                    btn_Them.setEnabled(true);

                }
                else 
                {
                    JOptionPane.showMessageDialog(this, "Them dich vu that bai");
                }

            } catch (SQLException ex) {
                Logger.getLogger(DichVu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        txt_TenDV.setText("");
        txt_DonGia.setText("");
        txt_GhiChu.setText("");
        txt_TenDV.requestFocus();
        CrudTable();       
    }//GEN-LAST:event_btn_LamMoiActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_DonGia;
    private javax.swing.JLabel lbl_GhiChu;
    private javax.swing.JLabel lbl_TenDV;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnl_Nut;
    private javax.swing.JTable tbl_CungCapDV;
    private javax.swing.JTextField txt_DonGia;
    private javax.swing.JTextArea txt_GhiChu;
    private javax.swing.JTextField txt_TenDV;
    // End of variables declaration//GEN-END:variables
}
