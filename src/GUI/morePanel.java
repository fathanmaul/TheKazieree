/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author LenataHoma
 */
public class morePanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form morePanel
     */
    public morePanel() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI gui = (BasicInternalFrameUI) this.getUI();
        gui.setNorthPane(null);
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
        btn_pengaturan_akun = new javax.swing.JLabel();
        btn_tentang_kami1 = new javax.swing.JLabel();
        btn_tentang_kami = new javax.swing.JLabel();
        btn_riwayat_transaksi = new javax.swing.JLabel();
        btn_dataPengguna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(953, 707));
        setMinimumSize(new java.awt.Dimension(953, 707));
        setPreferredSize(new java.awt.Dimension(953, 707));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pengaturan_akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_pengaturan_akun.png"))); // NOI18N
        btn_pengaturan_akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pengaturan_akunMouseClicked(evt);
            }
        });
        jPanel1.add(btn_pengaturan_akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 390, 100));

        btn_tentang_kami1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_sign_out.png"))); // NOI18N
        btn_tentang_kami1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tentang_kami1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_tentang_kami1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 390, 100));

        btn_tentang_kami.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_tentang_kami.png"))); // NOI18N
        btn_tentang_kami.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tentang_kamiMouseClicked(evt);
            }
        });
        jPanel1.add(btn_tentang_kami, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 259, 390, 100));

        btn_riwayat_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_riwayat_transaksi.png"))); // NOI18N
        btn_riwayat_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_riwayat_transaksiMouseClicked(evt);
            }
        });
        jPanel1.add(btn_riwayat_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 390, 100));

        btn_dataPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/btn_dataPengguna.png"))); // NOI18N
        btn_dataPengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dataPenggunaMouseClicked(evt);
            }
        });
        jPanel1.add(btn_dataPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 390, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/FormLainnya.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 680));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dataPenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dataPenggunaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Masih Dalam Proses Pengembangan !");
    }//GEN-LAST:event_btn_dataPenggunaMouseClicked

    private void btn_pengaturan_akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengaturan_akunMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Masih Dalam Proses Pengembangan !");
    }//GEN-LAST:event_btn_pengaturan_akunMouseClicked

    private void btn_riwayat_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_riwayat_transaksiMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Masih Dalam Proses Pengembangan !");
    }//GEN-LAST:event_btn_riwayat_transaksiMouseClicked

    private void btn_tentang_kamiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tentang_kamiMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Masih Dalam Proses Pengembangan !");
    }//GEN-LAST:event_btn_tentang_kamiMouseClicked

    private void btn_tentang_kami1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tentang_kami1MouseClicked
        // TODO add your handling code here:
        try {
            int jawab = JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar Akun??", "Konfirmasi", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            switch(jawab){
                case JOptionPane.YES_OPTION:
                    Login2 log = new Login2();
                    log.setVisible(true);
                    Dashboard2 dash = new Dashboard2();
                    dash.disable();
                    dash.setVisible(false);
                    dash.removeAll();
                    
                case JOptionPane.NO_OPTION:
                    break;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_tentang_kami1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_dataPengguna;
    private javax.swing.JLabel btn_pengaturan_akun;
    private javax.swing.JLabel btn_riwayat_transaksi;
    private javax.swing.JLabel btn_tentang_kami;
    private javax.swing.JLabel btn_tentang_kami1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
