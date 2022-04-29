/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class pembayaran_trx_jual extends javax.swing.JFrame {

    /**
     * Creates new form pembayaran_trx_jual
     */
    public pembayaran_trx_jual() {
        initComponents();
        setLocationRelativeTo(null);
        Tampil_tgl();
    }

    public void Tampil_tgl() {

        java.util.Date tglsekarang = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String tanggal = smpdtfmt.format(tglsekarang);

        time.setText(tanggal);
    }

    public void diskon() {
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sub = Integer.parseInt(sub_total.getText());
                int disk = Integer.parseInt(diskon.getText());
                if (disk == 0) {
                    int ttl = sub;
                    total_harga.setText(Integer.toString(ttl));
                } else if (disk > 0) {
                    int ttl = sub - disk;
                    total_harga.setText(Integer.toString(ttl));
                } else {

                }
            }
        };
        new Timer(1, task).start();
    }

    public void kembalian() {
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total_bayar.getText().equals("0")) {

                } else {
                    int sub = Integer.parseInt(total_harga.getText());
                    int disk = Integer.parseInt(total_bayar.getText());
                    int ttl = disk - sub;
                    kembalian.setText(Integer.toString(ttl));
                }
            }
        };
        new Timer(1, task).start();
    }

    private void simpan() {
        DefaultTableModel mdl = new DefaultTableModel();
        mdl.addColumn("id");
        int jumlah_baris = trx_jual.jTable1.getRowCount();
        JOptionPane.showMessageDialog(rootPane, jumlah_baris);
        String id_barang;
        if (jumlah_baris == 0) {
            JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
        } else {
            try {
                String sqli = "SELECT * FROM `temp_trx_jual` WHERE `id_trx`='" + id_trx.getText() + "'";
                java.sql.Connection con = (Connection) konekdb.GetConnection();
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sqli);
                while (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "select temporary");
                    mdl.addRow(new Object[]{
                        rs.getString(7)
                    });
                    try {
                        for (int i = 0; i < jumlah_baris; i++) {
                            String harga = (String) trx_jual.jTable1.getValueAt(i, 3);
                            JOptionPane.showMessageDialog(rootPane, harga);
                            String jumlah = (String) trx_jual.jTable1.getValueAt(i, 4);
                            JOptionPane.showMessageDialog(rootPane, jumlah);
                            String sql = "INSERT INTO `tb_detail_transjual`(`id_transjual`, `id_barang`, `jumlah`, `harga`) VALUES ("
                                    + "'" + id_trx.getText() + "',"
                                    + "'" + mdl.getValueAt(i, 0) + "',"
                                    + "'" + jumlah + "','" + harga + "')";
                            java.sql.PreparedStatement pst = con.prepareStatement(sql);
                            pst.execute();
                            try {
                                String query = "DELETE FROM `temp_trx_jual` WHERE id_trx='" + id_trx.getText() + "'";
                                java.sql.PreparedStatement ps = con.prepareStatement(query);
                                ps.execute();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(rootPane, "ini salah");
                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, e);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Gagal Menyimpan! Error : " + e);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        total_bayar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 36)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Simpan");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 130, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/butn_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Batal");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 130, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/butn_trx_jual.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        time.setEditable(false);
        time.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        time.setBorder(null);
        time.setOpaque(false);
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 370, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel2.setText("Tanggal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        id_trx.setEditable(false);
        id_trx.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        id_trx.setBorder(null);
        id_trx.setOpaque(false);
        jPanel1.add(id_trx, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 370, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel4.setText("ID Transaksi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        sub_total.setEditable(false);
        sub_total.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        sub_total.setBorder(null);
        sub_total.setOpaque(false);
        jPanel1.add(sub_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 370, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel3.setText("Sub Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        diskon.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        diskon.setBorder(null);
        diskon.setOpaque(false);
        diskon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diskonMouseClicked(evt);
            }
        });
        diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonActionPerformed(evt);
            }
        });
        diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                diskonKeyPressed(evt);
            }
        });
        jPanel1.add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 370, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel5.setText("Diskon");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        total_harga.setEditable(false);
        total_harga.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        total_harga.setBorder(null);
        total_harga.setOpaque(false);
        total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_hargaActionPerformed(evt);
            }
        });
        jPanel1.add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 370, 40));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel14.setText("Total Harga");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        total_bayar.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        total_bayar.setBorder(null);
        total_bayar.setOpaque(false);
        total_bayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_bayarMouseClicked(evt);
            }
        });
        total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_bayarActionPerformed(evt);
            }
        });
        jPanel1.add(total_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 370, 40));

        jLabel15.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel15.setText("Total Bayar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        kembalian.setEditable(false);
        kembalian.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        kembalian.setBorder(null);
        kembalian.setOpaque(false);
        jPanel1.add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 370, 40));

        jLabel18.setFont(new java.awt.Font("Quicksand", 0, 17)); // NOI18N
        jLabel18.setText("Kembalian");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image2/txt_tbh_brg.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel20.setText("Tekan enter setelah mengisi total pembayaran");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel21.setText("Diskon hanya bisa di isi angka minimal \"0\"");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel22.setText("Tekan enter setelah mengisi diskon");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonActionPerformed
        // TODO add your handling code here:
        diskon();
    }//GEN-LAST:event_diskonActionPerformed

    private void total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_hargaActionPerformed
        // TODO add your handling code here:
        diskon();
    }//GEN-LAST:event_total_hargaActionPerformed

    private void total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_bayarActionPerformed
        // TODO add your handling code here:
        kembalian();
    }//GEN-LAST:event_total_bayarActionPerformed

    private void diskonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diskonMouseClicked
        // TODO add your handling code here:
        diskon();
    }//GEN-LAST:event_diskonMouseClicked

    private void diskonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diskonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            diskon();
        }
    }//GEN-LAST:event_diskonKeyPressed

    private void total_bayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_bayarMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            kembalian();
        }
    }//GEN-LAST:event_total_bayarMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            try {
                String sql = "INSERT INTO `tb_transjual`(`id_transjual`, "
                        + "`tgl_transaksi`, `total_harga`, `nominal_bayar`, "
                        + "`kembalian`) VALUES ('" + id_trx.getText() + "',"
                        + "'" + time.getText() + "','" + total_harga.getText() + "',"
                        + "'" + total_bayar.getText() + "','" + kembalian.getText() + "')";
                java.sql.Connection con = (Connection) konekdb.GetConnection();
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel mdl = new DefaultTableModel();
                mdl.addColumn("id");
                int jumlah_baris = trx_jual.jTable1.getRowCount();
                JOptionPane.showMessageDialog(rootPane, jumlah_baris);
                if (jumlah_baris == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Table Masih Kosong!");
                } else {
                    try {
                        for (int i = 0; i < jumlah_baris; i++) {
                            String jumlah = (String) trx_jual.jTable1.getValueAt(i, 3);
                            String harga = (String) trx_jual.jTable1.getValueAt(i, 4);
                            String id_brg = (String) trx_jual.jTable1.getValueAt(i, 5);
                            String sql1 = "INSERT INTO `tb_detail_transjual`(`id_transjual`, `id_barang`, `jumlah`, `harga`) VALUES ("
                                    + "'" + id_trx.getText() + "',"
                                    + "'" + id_brg + "',"
                                    + "'" + jumlah + "','" + harga + "')";
                            java.sql.PreparedStatement ps1 = con.prepareStatement(sql1);
                            ps1.execute();
                        }
                        try {
                            String query = "DELETE FROM `temp_trx_jual` WHERE id_trx='" + id_trx.getText() + "'";
                            java.sql.PreparedStatement ps = con.prepareStatement(query);
                            ps.execute();
                            this.dispose();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "ini salah");
                        }
                }catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Gagal Menyimpan! Error : " + e);
                    }
            }
        }catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
    }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(pembayaran_trx_jual

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaran_trx_jual

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaran_trx_jual

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaran_trx_jual

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaran_trx_jual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diskon;
    public static final javax.swing.JTextField id_trx = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kembalian;
    public static final javax.swing.JTextField sub_total = new javax.swing.JTextField();
    public static final javax.swing.JTextField time = new javax.swing.JTextField();
    private javax.swing.JTextField total_bayar;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
