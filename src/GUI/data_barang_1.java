/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import db.konekdb;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lutfi
 */
public class data_barang_1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form data_barang
     */
    public String id,namabarang,satuan,hargadasar,hargajual,stok;
    public data_barang_1() {
        initComponents();           
        datatable();
        //refresh();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
        jTable1.getTableHeader().setBackground(new Color(254,149,46));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setFont(new Font("Quicksand SemiBold", Font.BOLD, 12));
    }
    public void refresh() {
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datatable();
            }
        };
        new Timer(1, task).start();
    }
     public static void datatable(){
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            try {
                String sql = "SELECT * FROM tb_barang";
                java.sql.Connection conn = (Connection)konekdb.GetConnection();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while(res.next())
                {
                    tbl.addRow(new Object[]{
                        res.getString(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5),
                        res.getString(6),
            });
                jTable1.setModel(tbl);
            }
         } catch (Exception e) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barcode = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnhapus = new javax.swing.JLabel();
        btntambah = new javax.swing.JLabel();
        btnubah = new javax.swing.JLabel();
        idku = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        satuann = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        harga_b = new javax.swing.JLabel();
        harga_j = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(962, 710));
        setPreferredSize(new java.awt.Dimension(962, 710));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Data Barang.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 29, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 292.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 92, 900, -1));

        barcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bi_qr-code-scan.png"))); // NOI18N
        barcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barcodeMouseClicked(evt);
            }
        });
        jPanel1.add(barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bx_search.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 152, -1, 40));

        txtcari.setBackground(new java.awt.Color(196, 196, 196));
        txtcari.setFont(new java.awt.Font("Quicksand SemiBold", 0, 18)); // NOI18N
        txtcari.setBorder(null);
        txtcari.setOpaque(false);
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 151, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 298.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jTable1.setFont(new java.awt.Font("Quicksand SemiBold", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(35);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 209, 860, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hapus.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Tambah.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Ubah.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 90, 30));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 302.png"))); // NOI18N
        btnhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhapusMouseClicked(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Rectangle 302.png"))); // NOI18N
        btntambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntambahMouseClicked(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logodatabarang/Rectangle 301.png"))); // NOI18N
        btnubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnubahMouseClicked(evt);
            }
        });
        jPanel1.add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        idku.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(idku, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        nama.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        satuann.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(satuann, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        jumlah.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        harga_b.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(harga_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, -1, -1));

        harga_j.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(harga_j, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
        /*String c = txtcari.getText();
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE Id_barang=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE nama_barang=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE satuan=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE harga_dasar=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE harga_jual=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE stok=('"+c+"');";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }*/
    }//GEN-LAST:event_SearchMouseClicked

    private void btnhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhapusMouseClicked
        // TODO add your handling code here:
        String g = idku.getText();
        switch (g){
            case "":
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!!");
                break;
            default:
                dialogboxhapusdata okw = new dialogboxhapusdata(this, idku.getText());
                okw.setVisible(true);
        }
    }//GEN-LAST:event_btnhapusMouseClicked

    private void btntambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntambahMouseClicked
        // TODO add your handling code here:
        Tambahandata j = new Tambahandata();
        j.setVisible(true);
    }//GEN-LAST:event_btntambahMouseClicked

    private void btnubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnubahMouseClicked
        // TODO add your handling code here:
        String g = idku.getText();
        switch (g){
            case "":
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!!");
                break;
            default:
                Ubahdata gh = new Ubahdata(this, idku.getText(), nama.getText(), satuann.getText(), harga_b.getText(), harga_j.getText(), jumlah.getText());
                gh.setVisible(true);
        }
    }//GEN-LAST:event_btnubahMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         //TODO add your handling code here:
        int tbl= jTable1.getSelectedRow();
        idku.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),0)));
        nama.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),1)));
        satuann.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),2)));
        harga_b.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3)));
        harga_j.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),4)));
        jumlah.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),5)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
        String c = txtcari.getText();
        try {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Id barang");
            tbl.addColumn("Nama Barang");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga Dasar");
            tbl.addColumn("Harga Jual");
            tbl.addColumn("Stok");
            jTable1.setModel(tbl);
            String sql = "SELECT * FROM tb_barang WHERE Id_barang LIKE '"+c+"%' OR nama_barang LIKE '"+c+"%'";
            java.sql.Connection conn=(Connection)konekdb.GetConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet res=stm.executeQuery(sql);
            pst.execute();
            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("satuan"),
                    res.getString("harga_dasar"),
                    res.getString("harga_jual"),
                    res.getString("stok")
                });
                jTable1.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void barcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeMouseClicked
        // TODO add your handling code here:
        txtcari.requestFocus();
    }//GEN-LAST:event_barcodeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.JLabel barcode;
    private javax.swing.JLabel btnhapus;
    private javax.swing.JLabel btntambah;
    private javax.swing.JLabel btnubah;
    private javax.swing.JLabel harga_b;
    private javax.swing.JLabel harga_j;
    private javax.swing.JLabel idku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTable jTable1 = new javax.swing.JTable();
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel satuann;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
 
}
